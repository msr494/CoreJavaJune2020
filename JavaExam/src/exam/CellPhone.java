package exam;

 class CellPhone implements Phone {
	
	public void battery() {
		System.out.println("this is a public void method battery");
	}
	public void wireless() {
		System.out.println("this is a public void method wireless");
	}
	public void interfaceinfo() {
		
		System.out.println("An interface is a completely abstract class that is used to group related methods");
	}
	public void call() {
		System.out.println("this is a test printout. we are \ttesting all formats \nto make sure it works");
	}

	public void message () {
		System.out.println("we cannot create constructor inside interface");
	}
	public void camera() {
		System.out.println("printing the camera");
	}
}
