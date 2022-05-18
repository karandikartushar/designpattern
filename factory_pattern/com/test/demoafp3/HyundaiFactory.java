package com.test.demoafp3;

public class HyundaiFactory implements CarAbstractFactory {
	private String fuleType;
	private String color;
	private String driveType;
	public HyundaiFactory(String fuleType, String color, String driveType) {
		this.fuleType = fuleType;
		this.color = color;
		this.driveType = driveType;
	}
	@Override
	public Car getCar(String type) {
		if(type.equals("CERTA")) {
			return new Creta(this.fuleType, this.color, this.driveType);
		}
		return null;
	}
}
