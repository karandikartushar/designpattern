package com.test.demoafp2;

public class ShapeFactory implements AbstractFactory {

	@Override
	public Shape getShpae(String type) {
		if(type.equals("CIRCLE")) {
			return new Circle();
		}else if(type.equals("SUQARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String type) {
		return null;
	}

}
