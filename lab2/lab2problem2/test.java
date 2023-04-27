package lab2problem2;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		
		HashSet<CSGO> cs = new HashSet<CSGO>();
		

		cs.add(new CSGO("AWP", "Deagle"));
		cs.add(new Guns("AWP", "Deagle", "10000 dollars"));
		
		System.out.println(cs);
	}
}	
