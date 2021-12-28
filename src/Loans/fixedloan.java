package Loans;

import org.testng.annotations.Test;

public class fixedloan {
	@Test
	public void fixedloanloginweb() {
	System.out.println("fixedloan login with web");
}
	@Test
	public void fixedloanloginapp() {
		System.out.println("fixedloan login with app");
	}
	@Test(groups= {"smoke"})
	public void fixedloanloginnet() {
			System.out.println("fixedloan login with net");
		}

}

