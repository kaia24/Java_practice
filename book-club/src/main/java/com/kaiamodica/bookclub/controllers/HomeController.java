package com.kaiamodica.bookclub.controllers;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.kaiamodica.bookclub.models.Book;
import com.kaiamodica.bookclub.services.BookService;


@Controller
public class HomeController {
	@Autowired
	private BookService bookService;

	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		model.addAttribute("bookList", bookService.allBooks());
		return "dashboard.jsp";
	}

	@GetMapping("/books/new")
	public String newBookForm(@ModelAttribute("book") Book book) {
		return "newBook.jsp";
	}

	@PostMapping("/books/new")
	public String processCreate(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "newBook.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/dashboard";
		}
	}

	@GetMapping("/books/{id}")
	public String bookDetails(@PathVariable("id") Long id, Model model) {
		Book book = bookService.oneBook(id);
		model.addAttribute("book", book);
		return "oneBook.jsp";
	}

	@GetMapping("/books/edit/{id}")
	public String editBookForm(@PathVariable("id") Long id, Model model) {
		Book book = bookService.oneBook(id);
		model.addAttribute("book", book);
		return "editBook.jsp";

	}

	@PutMapping("/books/edit/{id}")
	public String processEditBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "editBook.jsp";
		} else {
			bookService.editBook(book);
			return "redirect:/dashboard";
		}
	}
	@DeleteMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id")Long id) {
		bookService.deleteBook(id);
		return "redirect:/dashboard";
	}

	

}
