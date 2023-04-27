package practice1;

import java.util.Scanner;


public class problem5 {
	public static void main(String[] args) {
		
		float money, percent, interest;
		int year;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter your intitial balance:");
		money = n.nextFloat();
		System.out.println("Enter rate (percent)");
		percent = n.nextFloat();
		System.out.println("Enter time (in years)");
		year = n.nextInt();
		
		interest = (float) ((money*percent*year)/2);
		
		System.out.println("\nyour money = " +money);
		System.out.println("\nyour percent = " +percent+"%");
		System.out.println("\nduration = " +year);
		System.out.println("\nyour interest = " +interest);
		
		n.close();		
	}
}
