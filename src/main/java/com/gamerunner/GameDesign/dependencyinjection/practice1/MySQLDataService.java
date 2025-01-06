package com.gamerunner.GameDesign.dependencyinjection.practice1;

import org.springframework.stereotype.Component;

@Component
class MySQLDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}