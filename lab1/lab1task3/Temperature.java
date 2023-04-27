package lab1task3;

public class Temperature{

	private double temperature;
	private char scale;

	//4 constructor methods
	public Temperature(){
	}

	public Temperature(double temperature){
		this.temperature = temperature;
	}
	
	public Temperature(char scale){
		this.scale = scale;
	}
	
	public Temperature(double temperature, char scale){
		this.temperature = temperature;
		this.scale = scale;
	}
	
	// accessor methods
	public double degreesC(){
		if (scale == 'C'){
			return temperature;
		}
		else{
			return ((double) (Math.round((5 * (temperature - 32.0) / 9.0) * 10.0)) / 10);
		}
	}
	
	public double degreesF(){
		if (scale == 'F'){
			return temperature;
		}
		else{
			return (Math.round((9 * (temperature / 5) + 32) * 10) / 10);
		}
	}
	
	// Create three methods to set the fields
	public void setTemperature(double temperature){
		this.temperature = temperature;
	}
	public void setScale(char scale){
		this.scale = scale;
	}
	public void setTemperatureScale(double temperature, char scale){
		this.temperature = temperature;
		this.scale = scale;
	}


	public String toString(){
		if (scale == 'C'){
			return "in C " + degreesC() +" to F " +degreesF();
		}
		else{
			return "in F " + degreesF() +" to F " +degreesC();
		}
	}
}