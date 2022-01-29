import pattern.bridge.*;

public class BridgeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length != 1){
			usage();
			System.exit(0);
		}
		
		Display d1 = null;
		Display d2 = null;
		CountDisplay d3 = null;
		
		if(args[0].equals("File")){
			d3 = new CountDisplay(new TextFileDisplayImpl("D:\\web_project\\study\\bin\\sample.txt"));
		}else{
			d1 = new Display(new StringDisplayImpl("Hello, Korea."));
			d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
			d3 = new CountDisplay(new StringDisplayImpl("Hollo, Universe."));
		}
		
		if(d1!=null)d1.display();
		if(d2!=null)d2.display();
		if(d3!=null)d3.display();
		if(d3!=null)d3.multiDisplay(5);
	}
	
	private static void usage(){
		System.out.println("Usage:java BridgeMain [String|File]");
	}
}
