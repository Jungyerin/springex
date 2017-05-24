package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping (type 단독매핑) */

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String list(){							/* * : 메소드 이름으로 바로 매핑하여 들어옴*/ 
		return "GuestbookController:list()";
	}

}
