package inheritance;
//base class
public class Bicycle {
public int gear;
public int speed;

public Bicycle(int gear,int speed)//constructor
{
	this.gear=gear;
	this.speed=speed;//this keyword is used to refer current class objects 
	
}
void applyBrake(int decrement)
{
	speed-=decrement;
}
void releaseBrake(int increment)
{
	speed+=increment;

}
public String toString()
{
	return ("No of Gears are"+gear
			+"\n"
			+"speed of bicycle is"+speed);
}
}
//subclass
class Mountainbike extends Bicycle
{
	int seatheight;
	public Mountainbike(int gear,int speed,int startheight)
	{
super(gear,speed);//super keyword is used to refer parentclass objects
seatheight=startheight;

}
	public String toString()
	{
		return(super.toString() +"\n"+"seatheight is "+seatheight);
	}
}

	
	
	
	
	
	
	
	
	
	
	