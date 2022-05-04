package com.test.demoafp1;

public class ShapeProducer {

	public static AbstractShapeFactory getShape(String type) {
		if(type.equals("2D")) {
			return new TwoDShapeFactory();
		}else {
			return new ThreeDShapeFactory();
		}
	}
}
