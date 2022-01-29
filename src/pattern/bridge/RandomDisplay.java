package pattern.bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
	private Random ran = new Random();
	public RandomDisplay(DisplayImpl impl){
		super(impl);
	}
	
	public void randomDisplay(int times){
		multiDisplay(ran.nextInt(times));
	}
}
