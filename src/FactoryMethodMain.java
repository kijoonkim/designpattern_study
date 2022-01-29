import pattern.factoryMethod.framework.*;
import pattern.factoryMethod.idcard.*;

public class FactoryMethodMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		factory.create("±Ë±‚¡ÿ", "ES-01").use();
		factory.create("»´º∫¡ÿ", "ES-02").use();
		factory.create("æÁ¡÷»Ò", "ES-03").use();
	}
}
