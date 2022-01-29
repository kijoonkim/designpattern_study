import java.io.IOException;

import pattern.adapter.FileIO;
import pattern.adapter.FileProperties;



public class FileIOMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO f = new FileProperties();
		try{
			f.readFromFile("D:\\web_project\\디자인 패턴 스터디\\bin\\file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("D:\\web_project\\디자인 패턴 스터디\\bin\\newfile.txt");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
