package com.springboothidden.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiddenController {
	
	@RequestMapping("/date")
	public String returnDate()
	{
		return "Current Time" + new Date();
	}

}
