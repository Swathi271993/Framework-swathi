package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture {
	public static void getphoto(WebDriver driver) {
		Date d = new Date();
		String d1 = d.toString();
		String da = d1.replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tmp = ts.getScreenshotAs(OutputType.FILE);
		File pmt = new File("./Screenshot/"+da+".jpg");
		try {
			FileHandler.copy(tmp, pmt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		}

}
}
