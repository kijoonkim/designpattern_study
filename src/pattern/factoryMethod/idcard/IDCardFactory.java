package pattern.factoryMethod.idcard;


import java.util.List;
import java.util.ArrayList;

import pattern.factoryMethod.framework.Factory;
import pattern.factoryMethod.framework.Product;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();
	@Override
	public Product createProduct(String owner, String idNumber) {
		// TODO Auto-generated method stub
		return new IDCard(owner, idNumber);
	}

	@Override
	public void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add(((IDCard)product).getOwner());
	}
	
	public List getOwners(){
		return owners;
	}
}
