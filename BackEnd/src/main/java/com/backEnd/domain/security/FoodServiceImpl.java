package com.backEnd.domain.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backEnd.securityConfiguration.FoodRepository;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public Food save(Food food){
		return foodRepository.save(food);
	}
}


