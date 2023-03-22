package com.ayushi.search.services;

import java.util.List;

import com.ayushi.search.payloads.SearchDto;

public interface SearchService {
	
	List<SearchDto> searchProducts(String keyword);
	

}
