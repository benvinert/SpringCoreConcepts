package org.test.BeginnerSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
		
	public String drive() {
		
		return "On Bike";
	}
	
}
