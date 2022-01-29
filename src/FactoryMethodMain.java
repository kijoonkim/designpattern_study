import pattern.factoryMethod.framework.*;
import pattern.factoryMethod.idcard.*;

public class FactoryMethodMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		factory.create("�����", "ES-01").use();
		factory.create("ȫ����", "ES-02").use();
		factory.create("������", "ES-03").use();
	}
}
