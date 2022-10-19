package sing;
class Area4
{
	int Length;
	int Breadth;
	void Are(int L,int B)
	{
		Length=L;
		Breadth=B;
	}
	void Calc()
	{
		int Area=Length * Breadth;
		System.out.println("Area Is:"+Area);
	}
}
public class Area 
{
	  public static void main(String args[])
	  {
		  Area4 A=new Area4();
		  A.Are(20,20);
		  A.Calc();
	  }
}