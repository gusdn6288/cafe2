package com.shop.cafe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Product;


@RestController
public class MemberController {
	
	@GetMapping("insertMember")
	public String insertMember(){
		return "ok";
	}
}
