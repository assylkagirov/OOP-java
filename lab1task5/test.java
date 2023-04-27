package lab1task5;

public class test {
	
	public static void main(String[] args) {

		RedDragon launch = new RedDragon();
			
		
		launch.kidnap(new Person(Gender.GIRL));
		launch.kidnap(new Person(Gender.BOY));
		launch.kidnap(new Person(Gender.GIRL));
		

		
		if(!launch.willDragonEatOrNot()) {
			System.out.println("Dragon will be full ");
		}else {
			System.out.println("Dragon will be hungry");
		}

			
		
	}
}
