package com.gamerunner.GameDesign.dependencyinjection.practice1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
class BusinessCalculationService {

	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}