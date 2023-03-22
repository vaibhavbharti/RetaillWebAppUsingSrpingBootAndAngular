package com.ayushi.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.search.payloads.SearchDto;
import com.ayushi.search.services.SearchService;



@RestController
@RequestMapping("/api/users")
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
//	Searching
	
	@GetMapping("/search/{keywords}")
	public ResponseEntity<List<SearchDto>> searchProductByTitle(@PathVariable("keywords") String keywords) {
		List<SearchDto> results = this.searchService.searchProducts(keywords);
		return new ResponseEntity<List<SearchDto>>(results, HttpStatus.OK);

	}
	


}
