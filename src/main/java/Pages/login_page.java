package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page extends page_base  {

	public login_page (WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "email")
	WebElement userName;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(xpath = "//*[@id=\"app\"]/section[1]/div/form/div[4]/div/button")
	WebElement loginBtn;

	public void LoginToModdakir(String username, String password) {
		
		userName.click();
		userName.clear();
		SetTextElementText(userName, username);
		
		passWord.click();
		passWord.clear();
		SetTextElementText(passWord, password);
		
		ClickButton(loginBtn);
	}
}