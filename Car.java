package org.test.BeginnerSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired// Bring the objects of the type of interface(Tyres)
	@Qualifier("MOMO")// Which Object you want to wire
	private Tyres momo;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String drive() {
		System.out.println("CAR DRIVE");
		String num = momo.size();
		return num;
	}
	

}
