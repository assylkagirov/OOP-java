package practice1;

import java.util.Scanner;
import java.lang.Math;

public class problem4 {
	public static void main(String[] args) {
		
		float x1, x2, d;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a");
		int a = n.nextInt();
		System.out.println("Enter b");
		int b = n.nextInt();
		System.out.println("Enter c");
		int c = n.nextInt();
		
		d = (int) (Math.pow(b,2) - 4*a*c);
		if(d < 0) {
			System.out.println("discriminant is negative number");
			n.close();
			return;
		}
		x1 = (float) ((-b + Math.sqrt(d))/(2*a));
		x2 = (float) ((-b - Math.sqrt(d))/(2*a));
		
		System.out.println("\nx1 = " +x1);
		System.out.println("\nx2 = " +x2);
		
		n.close()
;		
	}
}
