package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class addproduct_page extends page_base {

	public addproduct_page (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[3]/div/button")
	WebElement NextStep1;
	
	public void NavigateToStep2() {
		
		//Navigate from step 1 to step 2
		ClickButton(NextStep1);
		
	}
}