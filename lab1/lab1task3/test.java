package lab1task3;

public class test {
	public static void main(String[] args){

		Temperature incels = new Temperature();
		incels.setTemperature(1);
		incels.setScale('C');
		System.out.println(incels.toString());

		Temperature infahr = new Temperature(0);
		infahr.setTemperatureScale(52.00, 'F');
		System.out.println(infahr.toString());
		
		
	}	

}