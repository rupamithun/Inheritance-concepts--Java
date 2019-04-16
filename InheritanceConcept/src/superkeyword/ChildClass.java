package superkeyword;

public class ChildClass extends ParentClass{
	int num =200;
	
	  ChildClass() 
	  {
		  super("hi");
		  System.out.println("Childclass");
	  
	  }
	 
	
	public void display()
	{
		
		System.out.println("num=" +num);
		System.out.println("num=" +super.num);
	}
	

}
