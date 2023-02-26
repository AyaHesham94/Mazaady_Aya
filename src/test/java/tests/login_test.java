package tests;

import java.sql.SQLException;

import org.testng.annotations.Test;

import Pages.home_page;
import Pages.login_page;

public class login_test extends test_base {

	home_page HomeObj;
	login_page LoginObj;

	@Test
	public void Login() throws ClassNotFoundException, SQLException, InterruptedException {
		HomeObj = new home_page (driver);
		LoginObj = new login_page (driver);
		LoginObj.LoginToModdakir("tester@task.com","11111111");
	}
}