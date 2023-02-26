package tests;

import java.sql.SQLException;
import org.testng.annotations.Test;

import Pages.home_page;
import Pages.login_page;

public class home_test extends test_base {
	
	home_page HomeObj;
	login_page LoginObj;

	@Test
	public void OpenAddProduct() throws ClassNotFoundException, SQLException, InterruptedException {
		LoginObj = new login_page(driver);
		HomeObj = new home_page (driver);
		HomeObj.NavigateToAddProduct();
	}
}
