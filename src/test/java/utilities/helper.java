package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helper {

	// create method to take screenshot while test cases fail

	public static void CaptureScreenshot(WebDriver driver, String screenShotName) {
		Path destination = Paths.get("./Screenshots", screenShotName + ".png");

		try {
			Files.createDirectories(destination.getParent());
			FileOutputStream out = new FileOutputStream(destination.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
	}
}
