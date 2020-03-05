package com.ak.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	

	public Heart getHeart() {
		return heart;
	}
	
	
	 public void startPumping()
	 {
		 heart.pump();
		 System.out.println("Name:"+heart.getNameOfAnimal()+" NoOfHeart:"+heart.getNoOfHeart());
	 }
}
