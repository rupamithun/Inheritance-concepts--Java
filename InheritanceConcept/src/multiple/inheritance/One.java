package multiple.inheritance;

public interface One {
public void firstInt();
}
interface Two
{
	public void secondInt();
}
interface Three extends One,Two
{
	public void thirdInt();
}
class Child implements Three
{
	public void firstInt()
	{
		System.out.println("JAVA");
	}
	public void secondInt()
	{
		System.out.println("Java API");
	}
	public void thirdInt()
	{
		System.out.println("JVM");
	}
}

