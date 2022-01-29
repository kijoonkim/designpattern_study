package pattern.bridge;

import java.io.*;

public class TextFileDisplayImpl extends DisplayImpl {
	private BufferedReader reader;
	private String filename;
	private final int MAX_READHEAD_LIMIT = 4096;
	
	public TextFileDisplayImpl(String filename){
		this.filename = filename;
	}

	@Override
	public void rawClose() {
		try{
		reader.close();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		System.out.println("********** File "+filename+" End **********");
	}

	@Override
	public void rawOpen() {
		try{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
			reader.mark(MAX_READHEAD_LIMIT);
		}catch (IOException e){
			e.printStackTrace();
		}
		
		System.out.println("********** File "+filename+" Begine **********");
	}

	@Override
	public void rawPrint() {
		try{
			String line;
			reader.reset();
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
