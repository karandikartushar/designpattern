package com.test.demoafp1;

public class Client {
	public static void main(String[] args) {
		AbstractShapeFactory twoDShape = ShapeProducer.getShape("2D");
		Shape circle = twoDShape.getShape("CIRCLE");
		circle.draw();
		
		AbstractShapeFactory threeDShape = ShapeProducer.getShape("3D");
		Shape pyramid = threeDShape.getShape("PYRAMID");
		pyramid.draw();
	}
}
