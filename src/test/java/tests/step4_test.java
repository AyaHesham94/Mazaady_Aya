package tests;

import java.sql.SQLException;
import org.testng.annotations.Test;

import Pages.addproduct_page;
import Pages.home_page;
import Pages.login_page;
import Pages.step2_page;
import Pages.step3_page;
import Pages.step4_page;

public class step4_test extends test_base{
	
	home_page HomeObj;
	login_page LoginObj;
	addproduct_page AddProObj;
	step2_page Step2Obj;	
	step3_page Step3Obj;
	step4_page Step4Obj;
	

	@Test
	public void NavigateToStep2() throws ClassNotFoundException, SQLException, InterruptedException {
		LoginObj = new login_page(driver);
		HomeObj = new home_page (driver);
		AddProObj = new addproduct_page(driver);
		Step2Obj = new step2_page(driver);
		Step3Obj = new step3_page(driver);
		Step4Obj = new step4_page(driver);
		Step4Obj.AddProduct();
	}
}