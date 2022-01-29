package pattern.strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
	private Random random;
	public RandomStrategy(int seeds){
		random = new Random(seeds);
	}
	public Hand nextHand() {
		return Hand.getHand(random.nextInt(3));
	}

	public void study(boolean win) {
		// TODO Auto-generated method stub

	}

}
