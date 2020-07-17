package org.test.BeginnerSpring;

import org.springframework.stereotype.Component;

@Component
public class toyo implements Tyres {
	private int SIZE = 1;

	public int getSIZE() {
		return SIZE;
	}

	public void setSIZE(int sIZE) {
		SIZE = sIZE;
	}

	public String size() {
		
		return "TOYO SIZE:" + getSIZE();
		
	}

}
