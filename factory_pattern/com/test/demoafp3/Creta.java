package com.test.demoafp3;

public class Creta implements Car {
	private String fuleType;
	private String color;
	private String driveType;
	public Creta(String fuleType, String color, String driveType) {
		this.fuleType = fuleType;
		this.color = color;
		this.driveType = driveType;
	}
	@Override
	public void build() {
		System.out.println("Build Creta with"+ this.color + " "+ this.driveType + " "+ this.fuleType);
	}

}
