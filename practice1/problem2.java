package practice1;
import java.util.Scanner;
import java.lang.Math;

public class problem2 {
	public static void main(String[] args) 
	{
		
		float side, area, perimetr, diagonal;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Enter the Side Length of Square: ");
		side = n.nextFloat();		
		
		area = 4*side;
		perimetr = (side+side)*2;
		diagonal = (float) (Math.sqrt(2) * side);
		
		System.out.println("\nArea = " +area);
		System.out.println("\nPerimetr = " +perimetr);
		System.out.println("\nDiagonal= " +diagonal);
		
		n.close();
		
	}
}
