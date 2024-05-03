package page;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestBase extends Util {

	public void takeScreenShot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formart = new SimpleDateFormat("MMddy_HHmmss");
		Date date = new Date();
		
		String label = formart.format(date);
		
		try {
			FileUtils.copyFile( sourceFile, new File(System.getProperty("user.dir") + "/screenshoots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
