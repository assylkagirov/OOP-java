package Practice4;

public class Example1
{
    public static void main(String[] args)
    {
	
    int     denominator, numerator, ratio;


	numerator   = 5;
	denominator = 2;
	try {
    ratio = numerator / denominator;
    System.out.println("The answer is: "+ratio);
	System.out.println("Done.");
	
	}catch(Exception e) {
    	System.out.println("Divide by 0. ");
    }
	 // Don't move this line
    
    }
}
