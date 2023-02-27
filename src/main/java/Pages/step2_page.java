package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class step2_page extends page_base {

	public step2_page (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"step-2\"]/span/div[2]/div[3]/div/span[2]/input")
	WebElement AuctionName;
	
	@FindBy(id = "vs3__combobox")
	WebElement MainCategory;
	
	@FindBy(id = "vs4__combobox")
	WebElement SubCategory;
	
	@FindBy(xpath = "//*[@id=\"step-2\"]/span/div[2]/div[5]/div/span[2]/input")
	WebElement Quantity;
	
	@FindBy(id = "vs5__combobox")
	WebElement Country;
	
	@FindBy(id = "vs6__combobox")
	WebElement Region;
	
	@FindBy(id = "vs7__combobox")
	WebElement City;
	
	@FindBy(css = "form-control")
	WebElement Address;
	
	@FindBy(id = "tinymce_description_ifr")
	WebElement AuctionDetails;
	
	@FindBy(id = "tinymce_policy_ifr")
	WebElement ExchangePolicy;
	
	@FindBy(xpath = "//*[@id=\"step-2\"]/span/div[2]/div[10]/div/div/div[1]/div/div[3]")
	WebElement MainImage;
	
	@FindBy(xpath = "//*[@id=\"step-2\"]/span/div[2]/div[13]/div/button[2]")
	WebElement NextStep2;

	
	public void NavigateToStep3() {

		//Scroll to down
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("arguments[0].scrollIntoView();", Quantity);
	    js.executeScript("window.scrollBy(0,250)", "");

	    //Fill step 2 data
	    
	    //Auction Name
		AuctionName.click();
		AuctionName.clear();
		SetTextElementText(AuctionName, "Test Aya");
		
		//Main Category
		MainCategory.click();
		SetTextElementText(MainCategory, "Information");
		WebElement maincategory = MainCategory;
		Select main = new Select(maincategory);
		main.selectByVisibleText("Information Tecnology");
		
		//Sub Category
		SubCategory.click();
		WebElement subcategory = SubCategory;
		Select sub = new Select(subcategory);
		sub.selectByVisibleText("Applications");

		//Quantity
		Quantity.click();
		Quantity.clear();
		SetTextElementText(Quantity, "10");
		
		//Scroll to down
	    js.executeScript("window.scrollBy(0,250)", "");
	    
		//Country
		Country.click();
		WebElement country = Country;
		Select country1 = new Select(country);
		country1.selectByVisibleText("Egypt");
		
		//Region
		Region.click();
		WebElement region = Region;
		Select region1 = new Select(region);
		region1.selectByVisibleText("Al Jizah");
		
		//City
		City.click();
		WebElement city = City;
		Select city1 = new Select(city);
		city1.selectByVisibleText("Giza");
		
	    //Auction Details
		AuctionDetails.click();
		AuctionDetails.clear();
		SetTextElementText(AuctionDetails, "Test Aya");

	    //Exchange Policy
		ExchangePolicy.click();
		ExchangePolicy.clear();
		SetTextElementText(ExchangePolicy, "Test Aya");
		
		//Scroll to down
	    js.executeScript("arguments[0].scrollIntoView();", NextStep2);
	    js.executeScript("window.scrollBy(0,250)", "");

	    //Main Image
	    MainImage.click();
	    WebElement image = MainImage;
	    image.sendKeys("C:\\Users\\hp\\Downloads\\eclipse-workspace\\Mazaady\\Uploads\\Aya.JPG");
	    
		//Navigate from step 2 to step 3
		ClickButton(NextStep2);

	}
}