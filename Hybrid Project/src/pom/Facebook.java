package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import generic.Basepage;

public class Facebook extends Basepage {
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement log;
	
	public Facebook(WebDriver driver)
	{
		super(driver);
	}
	public void email( String mail)
	{
	email.sendKeys(mail);
	}
	public void passwrd(String pwd)
	{
		password.sendKeys( pwd);
	}
	public void login()
	{
	log.click();
	}
}
