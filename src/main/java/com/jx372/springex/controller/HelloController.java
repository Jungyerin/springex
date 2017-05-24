package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public ModelAndView hello2(@RequestParam("n") String name){
				
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		mav.setViewName( "/WEB-INF/views/hello.jsp" );

		System.out.println(name);
		return mav;
	}

}
