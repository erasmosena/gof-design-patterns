package creational.abstractfactory.abstractfactory2;


import creational.abstractfactory.abstractfactory2.factory1.Factory1;
import creational.abstractfactory.abstractfactory2.factory2.Factory2;

public class AbstractFactory2Usage {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = new Factory1();
		//AbstractFactory abstractFactory = new Factory2();

		ProductA productA = abstractFactory.getProductA();
		System.out.println(productA.getName());

		ProductB productB = abstractFactory.getProductB();
		System.out.println(productB.getName());

		ProductC productC = abstractFactory.getProductC();
		System.out.println(productC.getName());

	}

}
