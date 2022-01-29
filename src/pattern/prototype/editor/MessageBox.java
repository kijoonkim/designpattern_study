package pattern.prototype.editor;

public class MessageBox extends ProductImpl {
	private char decochar;
	public MessageBox(char decochar){
		this.decochar = decochar;
	}
	
	public void use(String s) {
		int length = s.getBytes().length;
		for(int i=0; i < length+4; i++){
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for(int i=0; i < length+4; i++){
			System.out.print(decochar);
		}
		System.out.println("");
	}
}
