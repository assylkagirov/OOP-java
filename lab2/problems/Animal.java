package problems;

public abstract class Animal {
	public String voice;
	public int age;
	
	Animal(){
		
	}
	
	Animal(int age){
		this.age = age;
	}
	
	Animal(int age, String voice){
		this(age);
		this.voice = voice;
	}
	
	public abstract String getVoice();
	
	public void setVoice(String newVoice) {
		voice = newVoice;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String toString() {
		return "Age: " + age + " ,Voice: " + voice;
	}
}
