package com.abstractfactory;

public class TestAbstractFactory {
	public static void main(String []args){
		FactoryProducer producer = new FactoryProducer();
		Shape rect = producer.getShape("Rectangle");
		rect.drawShape();
		Color green = producer.getColor("Green");
		green.fillColor();
	}
}
