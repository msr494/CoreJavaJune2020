package exam;


public class Iphone2 extends Iphone1{
	
	
	public void camera() {
		int price = 770;
		System.out.println("The camera was introduced in Iphone2. The price was increased to " + price);
		
		
	}
	
	char gender;
	
	public Iphone2() {
		
	}
	public Iphone2 (char malefemale) {
		gender = malefemale;
	}
	public void Iphone2info() {
		System.out.println("The iPhone 2 was released in 2001, and the camera was introduced as a brand new feature.");
		super.regularClassInfo();
	}
	public void Iphone2info(char mf) {
		
	}
	

}
