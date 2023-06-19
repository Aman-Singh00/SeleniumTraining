package testng_basics;

import org.testng.annotations.BeforeSuite;

public class Working_with_before_suite {

		@BeforeSuite
		public void dbConnection()
		{
			System.out.println("Excecuting Database Connection");
		}
	}


