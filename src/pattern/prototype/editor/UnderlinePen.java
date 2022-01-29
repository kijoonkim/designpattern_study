package pattern.prototype.editor;

public class UnderlinePen extends ProductImpl {
	private char ulchar;
	public UnderlinePen(char ulchar){
		this.ulchar = ulchar;
	}
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.println(" ");
		for(int i=0; i < length; i++){
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}

}
