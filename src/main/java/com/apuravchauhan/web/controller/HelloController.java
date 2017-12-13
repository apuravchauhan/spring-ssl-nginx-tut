package com.apuravchauhan.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author apuravchauhan
 *
 */
@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView sayHello(HttpServletRequest request) {
		request.getSession(true);
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg", "Apurav Chauhan");
		return model;
	}

	@RequestMapping("/redirect")
	public String redirect() {
		return "redirect:/";
	}

}
