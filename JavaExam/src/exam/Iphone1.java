package exam;


public class Iphone1 implements Phone {
	public void regularClassInfo() {
		System.out.println("Everything in Java is associated with classes");
		System.out.println("A Class is a blueprint for creating objects");
		System.out.println("An abstract class cannot be instantiated directly");
		System.out.println("An interface is a type of Abstract class");
	}

	@Override
	public void interfaceinfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wireless() {
		// TODO Auto-generated method stub
		
	}

	AppleWatch newObj = new AppleWatch() {
		
		@Override
		public void appleWatchInfo() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private int price;
	private String info;
	private char user;
	private boolean madeInUsa;
	
	public int getPrice() {
		return price;		
	}
	
	public void setPrice(int value ) {
		this.price = value;
	}
	public String getinfo() {
		return info;
	}
	public void setinfo(String information) {
		this.info = information;
		
	}
	public char getuser() {
		return user;
		
	}
	public void setuser( char userinfo) {
		this.user = userinfo;
			}
	public boolean getmadeInUsa() {
		return madeInUsa;
		
	}
	public void setmadeInUsa(boolean production) {
		this.madeInUsa = production;
	}
	
	public Iphone1() {
		
	}
	
	public Iphone1(int value, String information, boolean production, char userinfo) {
		price = value; 
		info = information;
		user = userinfo;
		madeInUsa = production;
		
	}
	
}
