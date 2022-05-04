package com.test.demoafp2;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShpae(String type) {
		return null;
	}

	@Override
	public Color getColor(String type) {
		if(type.equals("RED")) {
			return new Red();
		}else if(type.equals("YELLOW")) {
			return new Yellow();
		}
		return null;
	}

}
