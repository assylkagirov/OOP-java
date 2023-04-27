package lab3problem1;

public class Mercedes extends Cars implements Movable {
	
	public Mercedes(String model, int year) {
		super(model,year);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Mercedes is Moving fast");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("brrrrrrrrrruuuuuuuuhhhh");
	}
	
	public String toString() {
		return super.toString();
	}

}
