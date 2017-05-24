package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/write")
	public String write(/*@RequestParam("n") String name*/
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="age", required=true, defaultValue="10") int age){ /*파라미터 값이 url로 넘어 올때 받을 이름*/ /*자동으로 형변환 가능*/
		System.out.println("name : "+name+" age : "+age);
		return "BoardController:write";
		
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam String name){ /*파라미터 값이 url로 넘어 올때 받을 이름*/
		System.out.println("name : "+name);
		return "BoardController:update";
		
	}

}
