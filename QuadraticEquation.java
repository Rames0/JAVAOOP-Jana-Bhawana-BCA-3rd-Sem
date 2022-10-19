package sing;

import java.util.Scanner;

public class QuadraticEquation  
{  
	public static void main(String[] Strings)   
	{  
		Scanner Bi = new Scanner(System.in);  
		System.out.print("Enter The Value Of A:");  
		double A = Bi.nextDouble();  
		System.out.print("Enter The Value Of B:");  
		double B = Bi.nextDouble();  
		System.out.print("Enter The Value Of C:");  
		double C = Bi.nextDouble();  
		double D= B * B - 4.0 * A * C;  
		if (D> 0.0)   
	{  
		double R1 = (-B + Math.pow(D, 0.5)) / (2.0 * A);  
		double R2 = (-B - Math.pow(D, 0.5)) / (2.0 * A);  
		System.out.println("The roots are " + R1 + " and " + R2);  
	}   
	else if (D == 0.0)   
	{  
		double R1 = -B / (2.0 * A);  
		System.out.println("The root is " + R1);  
	}   
	else   
	{  
		System.out.println("Roots are not real.");  
	}  
	}  
}  