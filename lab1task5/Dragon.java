package lab1task5;
import java.util.Vector;


public class Dragon {
	Vector<Person> person = new Vector<Person>();
	
	public Dragon() {	
	}
	
	void kidnap(Person p) {
		person.add(p);
	}
	
	boolean willDragonEatOrNot() {
		int cnt = 0;
		
		for(int i = 0; i < person.size(); i++) {
			
			if(Gender.BOY == person.get(i).gender) {
				cnt++;
			}else {
				if(cnt > 0) {
					cnt--;
				}
			}
			
		}
		return false;
	}
	
	
}