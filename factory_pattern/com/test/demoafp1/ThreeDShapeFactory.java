package com.test.demoafp1;

public class ThreeDShapeFactory implements AbstractShapeFactory {

	@Override
	public Shape getShape(String type) {
		if(type.equals("BOX")) {
			return new Circle();
		}if(type.equals("PYRAMID")) {
			return new Pyramid();
		}
		return null;
	}

}
