package com.example.demo.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.mapper.BoardMapper;

@RestController
public class HomeController {
	
	@Autowired 
	BoardMapper boardMapper;
	
	@RequestMapping("/admin")
	public String admin() {
		return "this is admin page";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "this is user page";
	}
	
	
}
