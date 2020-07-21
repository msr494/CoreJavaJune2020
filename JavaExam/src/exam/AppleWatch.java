package exam;

public abstract class AppleWatch extends AppleWatchSeries5{
	
	public void abstractClassInfo() {
		System.out.println("It is a restricted class that cannot be used to create objects");
		System.out.println("it must be inherited from another class");
		System.out.println("the other method is appleWathcInfo which is a abstract method");
		
	}
	public abstract void appleWatchInfo();
	

}
