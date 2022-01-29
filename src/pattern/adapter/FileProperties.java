package pattern.adapter;
import java.io.*;
import java.util.Properties;


public class FileProperties implements FileIO {
	Properties p;
	
	public FileProperties(){
		this.p = new Properties();
	}

	public String getValue(String key) {
		// TODO Auto-generated method stub
		return p.getProperty(key);
	}

	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi = new FileInputStream(new File(filename));
		p.load(fi);
	}

	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		p.setProperty(key, value);
	}

	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo = new FileOutputStream(new File(filename));
		p.store(fo, "");
	}

}
