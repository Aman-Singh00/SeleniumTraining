package testng_basics;

import org.testng.annotations.Test;

public class Working_with_testng {
	
	
	@Test
	public void m1()//test case
	{//code you write inside is test steps
		System.out.println("hello");
	}
	@Test
	public void m2()
	{
		System.out.println("Aman");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
	}

}
