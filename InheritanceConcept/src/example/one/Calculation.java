package example.one;

public class Calculation {
	int z;
	public void performAdd(int x, int y) {
		
		z=x+y;
		System.out.println("Addition of x and y="+z);
	}
public void performSub(int x, int y)
{
	
	z=x-y;
	System.out.println("Subtraction of x and y="+z);
}	
}
class Result extends Calculation
{

	public void performMultiply(int x, int y)
	{
		z=x*y;
		System.out.println("Multiplication of x and y="+z);
	}
	
}
