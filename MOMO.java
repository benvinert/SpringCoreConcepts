package org.test.BeginnerSpring;

import org.springframework.stereotype.Component;

@Component
public class MOMO implements Tyres{
	
	private int size = 55;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String size() {
		return "MOMO SIZE:" + getSize();
		
	}
	
	
	
}
