package com.kaiamodica.loginreg.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kaiamodica.loginreg.model.LoginUser;
import com.kaiamodica.loginreg.model.User;
import com.kaiamodica.loginreg.services.UserService;



@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String logreg(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "logreg.jsp";
	}
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		return "dashboard.jsp";
	}
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser,
			BindingResult result, Model model, HttpSession session) {
		User registeredUser = userService.register(newUser, result);
		if(result.hasErrors()) {
			model.addAttribute("newLogin",new LoginUser());
			return "logreg.jsp";
		}else {
			session.setAttribute("userId", registeredUser.getId());
			session.setAttribute("userName", registeredUser.getUsername());
			return "redirect:/dashboard";
		}
		
	}
	@PostMapping("/login")
	public String register(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
			BindingResult result, Model model, HttpSession session) {
		User loginUser = userService.login(newLogin, result);
		if(result.hasErrors()) {
			model.addAttribute("newUser",new User());
			return "logreg.jsp";
		}else {
			session.setAttribute("userId", loginUser.getId());
			session.setAttribute("userName", loginUser.getUsername());
			return "redirect:/dashboard";
		}
		
	}
	@GetMapping("/logout")
	public String  logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
