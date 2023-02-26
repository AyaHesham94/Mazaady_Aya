package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class step3_page extends page_base {

	public step3_page (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "duration")
	WebElement AuctionDuration;
	
	@FindBy(name = "selling_type")
	WebElement SellingType;
	
	@FindBy(id = "vs8__combobox")
	WebElement Currency;
	
	@FindBy(name = "value")
	WebElement BuyNowValue;
	
	@FindBy(name = "starting_bid")
	WebElement StartingBidValue;
	
	@FindBy(name = "bid_increase")
	WebElement BidIncrementValue;
	
	@FindBy(name = "estimated_value")
	WebElement EstimatedValue;
	
	@FindBy(id = "vs9__combobox")
	WebElement TimeZone;
	
	@FindBy(xpath = "//*[@id=\"step-3\"]/span/div/div[6]/div[2]/div")
	WebElement Date;
	
	@FindBy(xpath = "//*[@id=\"step-3\"]/span/div/div[7]/div[2]/div")
	WebElement Time;
	
	@FindBy(xpath = "//*[@id=\"step-3\"]/span/div/div[9]/span/div[1]/label")
	WebElement AudioShowType;
	
	@FindBy(xpath = "//*[@id=\"step-3\"]/span/div/div[11]/div/button[2]")
	WebElement NextStep3;

	
	public void NavigateToNextStep() {
		
		//Scroll to down
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("arguments[0].scrollIntoView();", NextStep3);
	    js.executeScript("window.scrollBy(0,350)", "");

	    //Auction Duration
		AuctionDuration.click();
		WebElement duration = AuctionDuration;
		Select duration1 = new Select(duration);
		duration1.selectByValue("3");

	    //Selling Type
		SellingType.click();
		WebElement type = SellingType;
		Select type1 = new Select(type);
		type1.selectByValue("estimation_value");
		
		//Currency
		Currency.click();
		WebElement currency = Currency;
		Select currency1 = new Select(currency);
		currency1.selectByVisibleText("Egypt (EGP)");
		
	    //Buy Now Value 
		BuyNowValue.click();
		BuyNowValue.clear();
		SetTextElementText(BuyNowValue , "2");

	    //Starting Bid Value 
		StartingBidValue.click();
		StartingBidValue.clear();
		SetTextElementText(StartingBidValue , "1");
		
	    //Bid Increment Value 
		BidIncrementValue.click();
		BidIncrementValue.clear();
		SetTextElementText(BidIncrementValue , "2");

	    //Estimated Value 
		EstimatedValue.click();
		EstimatedValue.clear();
		SetTextElementText(EstimatedValue , "2");
	   
		//TimeZone
		TimeZone.click();
		WebElement zone = TimeZone;
		Select zone1 = new Select(zone);
		zone1.selectByVisibleText("Africa/Cairo (UTC+2)");
		
		//Date
		Date.click();
		WebElement date = Date;
        date.sendKeys("28022023");

		//Time
		Time.click();
		WebElement time = Date;
        time.sendKeys("0245PM");
		
		//Auction Show Type
		AudioShowType.click();
		
		//Navigate from step 3 to step 4
		ClickButton(NextStep3);
	
	}
}

