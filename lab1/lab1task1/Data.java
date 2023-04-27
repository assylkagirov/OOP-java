package lab1task1;

public class Data {
	private double average;
	private double maximum;
	private int number;
	
	public Data() {
		average = 0;
		maximum = 0;
		number = 0;
	}
	public void addValue(double num) {
		if(number == 0) {
			average = num;
			maximum = num;
		}
		else {
			if(num > maximum) {
				maximum = num;
			}
			average = (average * number + num) / (number + 1);
		}
		number++;
	}
	
	public double getMaximum() {
		return maximum;
	}
	
	public double getAverage() {
		return average;
	}
	

}