package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home_page extends page_base {

	public home_page (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"mobile-menu\"]/div/div[2]/div[1]")
	WebElement ProfileIcon;
	
	@FindBy(xpath = "//*[@id=\"mobile-menu\"]/div/div[2]/div[1]/div")
	WebElement ProfileMenu;

	@FindBy(xpath = "//*[@id=\"mobile-menu\"]/div/div[2]/div[1]/div/ul/li[5]")
	WebElement AddProductBtn;

	public void NavigateToAddProduct() {
		
		ClickButton(ProfileIcon);
		ClickButton(AddProductBtn);
		
		//WebElement dropdown = ProfileMenu;
		//Select select = new Select(dropdown);
		//select.selectByIndex(4);

	}
}