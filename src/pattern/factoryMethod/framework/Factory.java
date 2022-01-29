package pattern.factoryMethod.framework;


public abstract class Factory {
	public final Product create(String owner, String idNumber){
		Product p = createProduct(owner, idNumber);
		registerProduct(p);
		return p;
	}
	
	public abstract Product createProduct(String owner, String idNumber);
	public abstract void registerProduct(Product product);
}
