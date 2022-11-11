package com.search_num_2.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search_num_2.dto.NumData;

@Component
public class SearchNumRestClient {

	public NumData findNum(int id) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		NumData numbers = restTemplate.getForObject("http://localhost:8085/api/numbers/num/"+id, NumData.class);
		
		return numbers;
	}

	
}
