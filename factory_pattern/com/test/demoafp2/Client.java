package com.test.demoafp2;

public class Client {
	public static void main(String[] args) {
		AbstractFactory shapeFactory =  FactoryProducer.getFactory("SHAPE");
		Shape circle = shapeFactory.getShpae("CIRCLE");
		circle.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color red = colorFactory.getColor("RED");
		red.fill();
	}
}
