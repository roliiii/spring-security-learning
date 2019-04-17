package com.fluffy.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluffy.security.dao.ValamiDao;
import com.fluffy.security.service.ValamiService;

@RestController
public class Index {

	@Autowired
	private ValamiService valamiService;
	
	@GetMapping("/index")
	public ValamiDao index() {
		return valamiService.getValami();
	}
}
