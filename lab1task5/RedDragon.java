package lab1task5;

import java.util.Vector;

public class RedDragon extends Dragon {
	public RedDragon() {
	}
	

	boolean willDragonEatOrNot() {
		int cnt = 0;
		for(int i = 0; i < person.size(); i++) {
			if(Gender.GIRL == person.get(i).gender && Gender.BOY == person.get(i).gender ) {
				cnt++;
			}
		}
		if(cnt >=3 ) {
			return true;
		}
		
		return false;
	}
	
}
