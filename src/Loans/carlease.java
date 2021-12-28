package Loans;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carlease {
	@Test
	public void carleaseloginweb() {
	System.out.println("carlease login with web");
}
	@Parameters({"url"})
	@Test
	public void carleaseloginapp(String name) {
		System.out.println("carlease login with app"+"   "+name);
	}
	@Test(groups= {"smoke"})
	public void carleaseloginnet() {
			System.out.println("carlease login with net");
		}

	@DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[3][2];
		data[0][0] ="althaf";
		data[0][1] ="test0";
		data[1][0] ="sadik";	
		data[1][1] ="test1";
		data[2][0] ="anees";	
		data[2][1] ="test2";
		
		
		return data;
	}
	@Test(dataProvider = "getdata")
	public void login(String username, String pwd) {
		
		System.out.println(username);
		System.out.println(pwd);
		
	}




}

