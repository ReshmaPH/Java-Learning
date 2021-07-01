package com.into.oops;

public class MotorBikesRunner {

	public static void main(String[] args) {

		MotorBikes ducati = new MotorBikes(100);
		MotorBikes honda = new MotorBikes(300);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		ducati.start();
		honda.start();
	//	ducati.setSpeed(100);
		honda.setSpeed(80);
		// incase we need to increase speed by 100
		
		/*int speed=ducati.getSpeed();
		speed+=100;
		ducati.setSpeed(speed);

		int hondaSpeed=honda.getSpeed();
		hondaSpeed+=100;
		honda.setSpeed(hondaSpeed); */
		
		//ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		honda.decreaseSpeed(400);
		//System.out.println(ducati.getSpeed());
	
		System.out.println(honda.getSpeed());

	}

}
