package practice1;
import java.util.Scanner;

public class problem3 {
	 public static void main(String[] args) {
		  Scanner n = new Scanner(System.in);
		  
		  System.out.println("Enter a grade");
		  int grade = n.nextInt();
		  
		  String grades[] = {"F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
		  
		  int x;
		  x = ((grade * 2 + 9) / 10) - 10;
		  
		  System.out.println(grades[x]);
		  n.close();
		  
		  }

}
