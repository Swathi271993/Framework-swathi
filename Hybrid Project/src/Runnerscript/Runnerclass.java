package Runnerscript;




import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.FetchdataExcel;
import pom.Facebook;

public class Runnerclass extends BaseClass {
//	@Test(dataProvider = "login")
	@Test
	public void facebook() throws InterruptedException
	{

	Facebook f=new Facebook(driver);
f.email(FetchdataExcel.getdata("Swathi",0,0));
	Thread.sleep(5000);
	
	f.passwrd(FetchdataExcel.getdata("Swathi",0,1));
	Thread.sleep(5000);
	f.login();
	Assert.fail();
	}
	/*
	 * @DataProvider(name="login") public Object[][] get( ) { Object[][] data=
	 * {{"Rahul@gmail.com","123"},
	 * {"Harsh@gmail.com","456"},{"Hansh@gmail.com","789"}}; return data; }
	 */
	

}
