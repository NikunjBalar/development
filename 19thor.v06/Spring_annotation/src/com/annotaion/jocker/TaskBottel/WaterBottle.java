package com.annotaion.jocker.TaskBottel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WaterBottle implements Bottle{

	private int price;
	
	@Autowired
	public WaterBottle(@Value("10") int price) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.price=price;
	}
	
	@Override
	public void open() {
	
		System.out.println("strting open water bottle"+this.price);
	}

	
}
