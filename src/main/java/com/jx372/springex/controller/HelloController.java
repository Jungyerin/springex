package com.jx372.springex.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String hello2(Model model, @RequestParam("name") String name){
		
		model.addAttribute("name", name);						/*dispatcher servlet이 만들어서 넣어준다. */
		return "/WEB-INF/views/hello.jsp" ;
	}

	
	/*기술이  침투해있기때문에 비추천 */
	@RequestMapping("/hello3")
	public void hello3(HttpServletRequest request, Writer out){
		String name = request.getParameter("name");
		
		try {
			out.write("<h1>Hello "+name+"</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
