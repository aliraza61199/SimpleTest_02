package Test_02;

import org.testng.annotations.Test;

public class ContactTest {
	
	
	@Test
	public void createContact() {
		
	      String Url=  System.getProperty("url");
	      String Browser=  System.getProperty("browser");
	      String UserName=  System.getProperty("username");
	      String Password=  System.getProperty("password");

			System.out.println(Url);
			System.out.println(Browser);	
			System.out.println(UserName);
			System.out.println(Password);

			
			System.out.println("create Contact2 name");
			System.out.println("Contact2 Name ");
			System.out.println("Contact2 number");

		}
	@Test
		public void modifyOrg() {
			System.out.println("modify the Contact2 ");
		}

}
