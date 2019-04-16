package constructor;

public class Superclass {
	int age;
	Superclass(int age)  //CONSTRUCTOR
	{
		this.age=age;
	}
public void getAgeValue()
{
	System.out.println("the age value in superclass is "+age);
}
}
class Subclass extends Superclass
{
	Subclass(int age)
	{
	super(age);
	}
	
}