package problems;

public class Lion extends Animal{
	private String name;
	private int lengthair;
	Lion(){
		
	}
	
	Lion(int age){
		this.age = age;
	}
	
	Lion(int age, String voice){
		this(age);
		this.voice = voice;
	}
	
	Lion(int age, String voice, String name){
		this(age, voice);
		this.name = name;
	}
	
//	public String getVoice() {
//		return voice;
//	}
	
	public String getVoice() {
		return voice;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getAge() {
		return age;
	}
		
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String toString() {
		return "Age: " + age +" ,Voice: " + voice + " ,Name: " + name;
	}
}
