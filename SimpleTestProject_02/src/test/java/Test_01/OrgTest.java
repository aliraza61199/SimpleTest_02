package Test_01;

import org.testng.annotations.Test;

public class OrgTest {
	
	
	@Test
	public void createOrg() {
		
	      String Url=  System.getProperty("url");
	      String Browser=  System.getProperty("browser");
	      String UserName=  System.getProperty("username");
	      String Password=  System.getProperty("password");

			System.out.println(Url);
			System.out.println(Browser);	
			System.out.println(UserName);
			System.out.println(Password);

			
			System.out.println("create Org2 name");
			System.out.println("org2 Name ");
			System.out.println("org2 number");

		}
	@Test
		public void modifyOrg() {
			System.out.println("modify the Org2 ");
		}

}
