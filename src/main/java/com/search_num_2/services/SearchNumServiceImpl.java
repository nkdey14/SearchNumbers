package com.search_num_2.services;

import org.springframework.stereotype.Service;

@Service
public class SearchNumServiceImpl implements SearchNumService {

	@Override
	public int addTwoNumbers(int fnum, int snum) {
		
		return fnum + snum;
	}

}
