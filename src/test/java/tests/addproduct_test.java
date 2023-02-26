package tests;

import java.sql.SQLException;
import org.testng.annotations.Test;

import Pages.addproduct_page;
import Pages.home_page;
import Pages.login_page;

public class addproduct_test extends test_base{
	
	home_page HomeObj;
	login_page LoginObj;
	addproduct_page AddProObj;
	

	@Test
	public void NavigateToStep2() throws ClassNotFoundException, SQLException, InterruptedException {
		LoginObj = new login_page(driver);
		HomeObj = new home_page (driver);
		AddProObj = new addproduct_page(driver);
		AddProObj.NavigateToStep2();
	}
}
