package lab3problem5;

public class test {
	public static void main(String[] args) {
		
		Chocolate[] chocolates = new Chocolate[3];
		chocolates[0] = new Chocolate("Twix", 350);
		chocolates[1] = new Chocolate("Bounti", 250);
		chocolates[2] = new Chocolate("Merci", 1400);

		Time[] times = new Time[3];
		times[0] = new Time(15, 1, 45);
		times[1] = new Time(8, 32, 4);
		times[2] = new Time(24, 0, 0);
		
	
		Sort.quickSort(times);
		
		for (Time time: times) {
			System.out.println(time);
		}
		
		Sort.bubbleSort(chocolates);
		
		for (Chocolate i: chocolates) {
			System.out.println(i);
		}
		

	}
}
