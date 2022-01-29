package pattern.factoryMethod.idcard;
import pattern.factoryMethod.framework.Product;

public class IDCard extends Product {
	private String owner;
	private String idNumber;
	IDCard(String owner, String idNumber){
		System.out.println(owner + "의 "+idNumber+" 카드를 만듭니다.");
		this.owner = owner;
		this.idNumber = idNumber;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub

	}
	
	public String getOwner(){
		return owner;
	}
	
	public String getIdNumber(){
		return idNumber;
	}
}
