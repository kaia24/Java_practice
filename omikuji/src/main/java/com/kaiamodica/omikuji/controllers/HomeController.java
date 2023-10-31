package com.kaiamodica.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
	return "home.jsp";
	}

	@RequestMapping("/show")
	public String show(@RequestParam(value = "num") int num, @RequestParam(value = "person") String city,@RequestParam(value = "person") String person,
			@RequestParam(value = "hobby") String hobby, @RequestParam(value = "animal") String animal,
			@RequestParam(value = "nice") String nice,
			HttpSession session) {
		session.setAttribute("num",num);
		session.setAttribute("city",city);
		session.setAttribute("person",person);
		session.setAttribute("hobby",hobby);
		session.setAttribute("animal",animal);
		session.setAttribute("nice",nice);
		return "show.jsp";
	}
}
