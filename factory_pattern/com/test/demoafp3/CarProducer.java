package com.test.demoafp3;

public class CarProducer {
	public static CarAbstractFactory getFactory(String type, String fuleType, String color, String driveType){
		if(type.equals("HONDA")) {
			return new HondaFactory(fuleType, color, driveType);
		}else if(type.equals("HYUNDAI")) {
			return new HyundaiFactory(fuleType, color, driveType);
		}else if(type.equals("SUZUKI")) {
			return new SuzukiFactory(fuleType, color, driveType);
		}
		return null;
	}
}
