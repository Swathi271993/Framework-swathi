package Runnerscript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;

import pom.Facebook;

public class RunnerScript2 extends BaseClass{
	@Test(dataProvider = "login")
	
	public void facebook( String email,String pwd) throws InterruptedException
	{

	Facebook f=new Facebook(driver);
f.email(email);
	Thread.sleep(5000);
	f.passwrd(pwd);
	Thread.sleep(5000);
	f.login();
	}
	
	 @DataProvider(name="login") public Object[][] get( ) { Object[][] data=
	 {{"Rahul@gmail.com","123"},
	 {"Harsh@gmail.com","456"},{"Hansh@gmail.com","789"}}; return data; }
	 
	


}
