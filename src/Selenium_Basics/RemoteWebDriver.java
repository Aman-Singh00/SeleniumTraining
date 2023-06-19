package Selenium_Basics;

interface i1{
	
	void m1();
}

class i2 implements i1
{

	@Override
	public void m1() {
		System.out.println("hello");
		
	}
	
}

class i3 extends i2{
	
	
	
}




public class RemoteWebDriver {
	
	public static void main(String[] args) {
				
		i2 i=new i3();
		i.m1();
	}

	
	
}


