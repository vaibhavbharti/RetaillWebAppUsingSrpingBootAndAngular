package com.ayushi.search.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushi.search.entities.Search;
import com.ayushi.search.payloads.SearchDto;
import com.ayushi.search.repositories.SearchRepo;
import com.ayushi.search.services.SearchService;


@Service
public class SearchServiceimpl implements SearchService {
	
	@Autowired
	private SearchRepo searchRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	 
//	@Override
//	public List<SearchDto> searchProducts(String keyword) {
//		List<Search> products = this.searchRepo.searchByTitle("%"+keyword+"%");
//		List<SearchDto> searchDtos = products.stream().map((product)->this.modelMapper.map(product, SearchDto.class)).collect(Collectors.toList());
//		return searchDtos; 
//	}
	
//	Searching 
	@Override
	public List<SearchDto> searchProducts(String keyword) {
		List<Search> products = this.searchRepo.findByTitleContaining(keyword);
		List<SearchDto> productDtos = products.stream().map((product)->this.modelMapper.map(product, SearchDto.class)).collect(Collectors.toList());
		return productDtos;
	}

}
