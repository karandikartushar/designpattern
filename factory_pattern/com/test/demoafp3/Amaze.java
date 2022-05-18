package com.test.demoafp3;

public class Amaze implements Car {
	private String fuleType;
	private String color;
	private String driveType;
	public Amaze(String fuleType, String color, String driveType) {
		this.fuleType = fuleType;
		this.color = color;
		this.driveType = driveType;
	}
	@Override
	public void build() {
		System.out.println("Build Amaze "  + this.color + " "+ this.driveType + " "+ this.fuleType);

	}

}
