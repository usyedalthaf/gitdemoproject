package Loans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class flexiloan {
	@Test
	public void flexiloanloginweb() {
	System.out.println("flexiloan login with web");
}
	@Test(dependsOnMethods = {"flexiloanloginweb"})
	public void flexiloanloginapp() {
		System.out.println("flexiloan login with app");
	}
	@AfterTest(enabled=false)
	public void flexiloanloginnet() {
			System.out.println("flexiloan login with net");
		}
}
