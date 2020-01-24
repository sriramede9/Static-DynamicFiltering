package com.sri.Static.DynamicFiltering.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.sri.Static.DynamicFiltering.model.User2;

@RestController
public class UserControllerDynamic {

	@GetMapping("/Users/name&phone")
	public MappingJacksonValue getUserNameandPhone() {

		User2 user2 = new User2(1, "Sri", 8008080);

		// step 1
		// define MappingJacksonValue

		MappingJacksonValue mapping = new MappingJacksonValue(user2);

		//step4
		//chose what variable we are filtering
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "phoneNumber");

		//step 3
		//define filters
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("customfilter", filter);

		// step 2
		// set Filter
		mapping.setFilters(filters);

		return mapping;
	}
	
	@GetMapping("/Users/name&id")
	public MappingJacksonValue getUserNameandid() {
		
		List<User2> userlist=Arrays.asList(new User2(1,"Sri Ram Ede",808080),new User2(2,"Sri Ram E",8080888));
		
		// step 1
		// define MappingJacksonValue
		
		MappingJacksonValue mapping = new MappingJacksonValue(userlist);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "id");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("customfilter", filter);
		
		// step 2
		// set Filter
		mapping.setFilters(filters);
		
		return mapping;
	}

}
