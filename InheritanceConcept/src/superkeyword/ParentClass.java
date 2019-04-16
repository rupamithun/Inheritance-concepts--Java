package superkeyword;

public class ParentClass {
int num=100;

ParentClass()
{
	System.out.println("no arg parent class constructor");
}
ParentClass(String s)
{
	System.out.println("Parameterized constructor");
}
public void parentDisplay()
{
	System.out.println("parent method");
}
}

