package week1.day1;

public class MobileAssignment {
	public void makecall()
	{
		System.out.println("Calling");
	}
	public void sendsms()
	{
		System.out.println("Hi");
	}
    public void mobileModel()
    {
    	String mobileModel = "SAMSUNG";
    	System.out.println("Mobile Model is SAMSUNG");
    }
    public void mobileWeight()
    {
    	float mobileWeight =100.50f;
    	System.out.println("Mobile weight is 100.50");
    	}
    public void fullCharged()
    {
    	boolean fullCharged =true;
    	System.out.println("Mobile is fully charged");
    }
    public void mobileCost()
    {
    	int mobileCost=15000;
    	System.out.println("Mobile cost =15000");
    }
    public static void main(String[] args) {
		MobileAssignment obj = new MobileAssignment();
		obj.makecall();
		obj.sendsms();
		obj.mobileModel();
		obj.mobileWeight();
		obj.fullCharged();
		obj.mobileCost();
		System.out.println("This is my Mobile");
		
	}
}
