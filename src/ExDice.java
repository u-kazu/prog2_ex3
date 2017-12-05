package  jp.ac.uryukyu.ie.ex3.pair23;

public class ExDice extends Dice {
	private int minValue; 
	private int maxValue; 
	
	public ExDice(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		play();
	}
	@Override
	public void play() {
		int value = (int)(Math.random()*(maxValue - minValue + 1));
		setValue(value + minValue); 
	}
}