package testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_with_Test_configuration {
//	<@BeforeSuite>
//	<@BeforeTest>
//		<@BeforeClass>
//			<@BeforeMethods>
//				<@Test>		Test Case
//			<@AfterMethods>
//		<@AfterClass>
//	<@AfterTest>
//<@AfterSuite>
	
	@Test
	public void Demo()
	{
		System.out.println("Executing Test 1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Excecuting before method");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Excecuting After method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Executing Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Executing After class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Exceuting before test");
	}

	@AfterTest
	public void AfterTest()
	{
		System.out.println("Exceuting After test");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Executing before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Executing After Suite");
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Test case 2");
	}
	

}
