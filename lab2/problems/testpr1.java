package problems;

public class testpr1 {
	public static void main(String []args) {
		Animal a = new Lion(5, "Roar");
		
		Animal a1 = new Lion(7, "ROAR", "Simba");
		
		System.out.println(a1.getVoice());
		System.out.println(a.getAge());
		System.out.println(a1.toString());
	
		
	}
}
