package exam;


public class TestPhone {
	public static void main(String[] args) {
		
		Iphone1 newObj = new Iphone1();
		AppleWatch newAppObj = new AppleWatch() {
			
			@Override
			public void appleWatchInfo() {
				// TODO Auto-generated method stub
				
			}
		};
	newObj.regularClassInfo();
	newObj.call();
	newObj.camera();
	newObj.message();
	newObj.battery();
	newObj.wireless();
	newAppObj.appleWatchInfo();
			
	newObj.setPrice(750);
	newObj.setuser('M');
	newObj.setmadeInUsa(false);
	newObj.setinfo("I bought this Phone in 2000");
	System.out.println(newObj.getinfo() + ", The price was " + newObj.getPrice() + " , user's sex:" + newObj.getuser() + " , " + newObj.getmadeInUsa() );
	
	Iphone2 iphn2Obj = new Iphone2();
	Iphone3 iphn3Obj = new Iphone3();
	Iphone4 iphn4Obj = new Iphone4();
	Iphone5 iphn5Obj = new Iphone5();
	Iphone6 iphn6Obj = new Iphone6();
	
	iphn2Obj.camera();
	iphn3Obj.map();
	iphn4Obj.photos();
	iphn5Obj.youtube();
	iphn6Obj.facetime();
	
	iphn2Obj.Iphone2info();
	
	iphn6Obj.materials(50, 100);
	iphn6Obj.materials(50, 100, "150");
	
	ConfiguredIphone6 configObj = new ConfiguredIphone6();
	configObj.materials(200, 400);
	configObj.materials(450, 550, "750");
	}
	
	//Iphone1 is the parent class and Iphone2 & 3 are the child classes. Iphone1,2 & 4 forms a multi level inheritance. single inheritence example is Iphone3 extends to iphone1
	

}
