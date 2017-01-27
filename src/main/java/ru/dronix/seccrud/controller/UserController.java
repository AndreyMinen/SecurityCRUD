package ru.dronix.seccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(Model model,String error) {
		if(error != null){
			model.addAttribute("error","Неправильный логин или пароль");
		}

		return "login";
	}


}