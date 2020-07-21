package exam;

public class ConfiguredIphone6 extends Iphone6{
	
	public void materials(int ramPrice, int cameraPrice) {
		System.out.println("this is a test to method override from iphone6");

}
	public void materials(int ramPrice, int cameraPrice, String processorPrice) {
		System.out.println("this is a test for method override");

}

}
