package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping (type + method) */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping("/joinform")
	public String joinform(){
		return "UserController:joinform";
	}
	
	@ResponseBody
	@RequestMapping("/join")
	public String doJoin(){
		return "UserController:doJoinform";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET) //2개 이상은 이름을 반드시 적어줘야함.
	public String login(){			
		return "/WEB-INF/views/login.jsp";	}	
	
	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST) //2개 이상은 이름을 반드시 적어줘야함.
	
	/*form에 있는 내용을 통째로 객체에 받아서 가지고 올 수 있음.*/
	public String login(@ModelAttribute UserVo uservo){			/*set을 해주지 않아도 어노테이션을 이용해서 통째로 객체를 가지고 올 수 있다. uservo의 변수 이름과 폼의 이름이 같아야 가능.*/		
		System.out.println(uservo);
		return "UserController:login(String, String)";
	}
	
	

}
