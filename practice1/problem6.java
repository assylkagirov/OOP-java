package practice1;
import java.util.Scanner;

public class problem6 {
	public static boolean ispalindrome(String s) {
		String reverse = "";
		for(int i = s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		if(s.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter the word");
		String s = n.nextLine();
		s = s.toLowerCase();

	
		if(ispalindrome(s)) {
			System.out.println("This word is palindrome");
		}else {
			System.out.println("This word is not palindrome");
		}
		
		
		n.close();
		
	}
}
