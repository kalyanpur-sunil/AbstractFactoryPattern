package com.abstractfactory;

public class FactoryProducer extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}else if(shape.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color.equalsIgnoreCase("red")){
			return new Red();
		}else if(color.equalsIgnoreCase("green")){
			return new Green();
		}else if(color.equalsIgnoreCase("orange")){
			return new Orange();
		}
		return null;
	}

}
