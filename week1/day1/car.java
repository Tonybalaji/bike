package week1.day1;

public class car
{
	public void pressureBreak() 
	{
		System.out.println("Slow the car");
	}
	public void applyGear()
	{
		System.out.println("Apply the Gear");
	}
	public void switchOffAc() 
	{
		System.out.println("off an AC");
	}
    public void riseAcclerate()
    {
    	System.out.println("up the an acceletrate");
    }
public static void main(String[] args) 
{
	car done =new car();
	done.pressureBreak();
	done.applyGear();
	done.switchOffAc();
	done.riseAcclerate();
}
}
