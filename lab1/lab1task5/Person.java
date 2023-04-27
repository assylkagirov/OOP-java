package lab1task5;

public class Person {
	
	Gender gender;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return gender.toString();
	}
}