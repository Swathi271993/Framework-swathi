package generic;
import utils.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass  implements FramewrkConstants{
	public WebDriver driver;
	
	@BeforeMethod
	public void launch() throws FileNotFoundException, IOException
	{
		System.setProperty(C_key,C_value);
		 driver = new ChromeDriver();
		driver.get(FetchProp.fetch());
	}
	
	@AfterMethod
	public void close(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
		Capture.getphoto(driver);	
		
		}
		driver.close();
	}

}
