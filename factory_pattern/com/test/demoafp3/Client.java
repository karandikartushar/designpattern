package com.test.demoafp3;

public class Client {
	public static void main(String[] args) {
		CarAbstractFactory hFactory = CarProducer.getFactory("HYUNDAI","Petrol", "Red", "Manual");
		Car creta = hFactory.getCar("CERTA");
		creta.build();
	}
}
