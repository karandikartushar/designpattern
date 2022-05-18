package com.test.demoafp3;

public class SuzukiFactory implements CarAbstractFactory {
	private String fuleType;
	private String color;
	private String driveType;
	public SuzukiFactory(String fuleType, String color, String driveType) {
		this.fuleType = fuleType;
		this.color = color;
		this.driveType = driveType;
	}
	@Override
	public Car getCar(String type) {
		if(type.equals("ALTO")) {
			return new Alto(this.fuleType, this.color, this.driveType);
		}
		return null;
	}

}
