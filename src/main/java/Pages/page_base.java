package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class page_base {

	protected WebDriver driver;
	public JavascriptExecutor jse;
	
	// Create constructor
	public page_base (WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		jse=(JavascriptExecutor)driver;
	}
	
	protected static void ClickButton(WebElement Button) {
		Button.click();
	}

	protected static void SetTextElementText(WebElement textElement, String value) {
		textElement.click();
		textElement.clear();
		textElement.sendKeys(value);
	}	
}