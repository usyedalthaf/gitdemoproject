package Loans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class carloan {
	@Test
	public void carloanloginweb() {
	System.out.println("carloan login with web");
}
	@AfterTest
	public void carloanloginapp() {
		System.out.println("carloan login with app");
	}
	@Test(groups= {"smoke"})
	public void carloanloginnet() {
			System.out.println("carloan login with net");
		}

}

