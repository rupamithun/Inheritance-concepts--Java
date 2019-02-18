package example.two.superkeyword;

public class One {
int x=4;
public void valueOfx()
{
	System.out.println("Value of x in superclass One");
}
}
class Two extends One
{
	int x=8;
	public void valueofy()
	{
		
		System.out.println("value of x in subclass Two="+x);
	}
	public void printxvalue() {
		System.out.println("x="+super.x);
	
	}
	
}