package com.sri.Static.DynamicFiltering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sri.Static.DynamicFiltering.model.User;
@RestController
public class UserConotroller {

	@GetMapping("/Users")
	public User getUsers() {
		return new User( "Sri",1, 8008080);
	}
}
