package sing;

import java.util.Scanner;

import sing.Areas;

class Areas 
{
	Float Area;
	Float Length;
	Float Height;
	void Areao(Float L,Float H)
	{
		Length=L;
		Height=L;
	}
	Float returnarea()
	{
		return (Length * Height);
	}
}
public class AreaOfRectangle
{
	public static void main(String[] args) 
	{
		Scanner Bi=new Scanner(System.in);
		System.out.print("Enter The Length:");
		Float L=Bi.nextFloat();
		System.out.print("Enter The Height:");
		Float H=Bi.nextFloat();
		Areas A=new Areas();
		A.Areao(L,H);
		float C=A.returnarea();
		System.out.println("Area Is:"+C);
	}
}