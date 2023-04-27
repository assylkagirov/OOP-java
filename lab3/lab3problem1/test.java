package lab3problem1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mercedes gelen = new Mercedes("G55", 2020);
		gelen.sound();
		gelen.move();
		System.out.println(gelen.toString());
		
		
		Animal animal = new Animal("Lion");
		System.out.println(animal.toString());
		animal.move();
	}

}