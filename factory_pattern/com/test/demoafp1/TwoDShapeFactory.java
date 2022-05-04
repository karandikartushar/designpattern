package com.test.demoafp1;

public class TwoDShapeFactory implements AbstractShapeFactory {

	@Override
	public Shape getShape(String type) {
		if(type.equals("CIRCLE")) {
			return new Circle();
		}if(type.equals("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
