package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class step4_page extends page_base {

	public step4_page (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "btn.btn-buy.pl-5.pr-5.pt-2.pb-2.m-auto")
	WebElement AddProduct;

	@FindBy(xpath = "/html/body/div[4]/div")
	WebElement SuccessWindow;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[2]")
	WebElement Myroducts;

	
	public void AddProduct() {
		
		//The product added successfully
		ClickButton(AddProduct);
		
		// Switch to the pop-up window
		//Alert alert = driver.switchTo().alert(); 
		//alert.accept();
		
		ClickButton(SuccessWindow);
		ClickButton(Myroducts);
	
	}
}

