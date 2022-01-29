package pattern.prototype.editor;

import pattern.prototype.framework.Product;

public abstract class ProductImpl implements Product {
	public Product createClone() {
		Product p = null;
		try{
			p = (Product)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}
	
}
