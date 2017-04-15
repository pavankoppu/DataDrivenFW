/*package com.fw.RallyConnectAutomation.pageclass;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import com.fw.RallyConnectAutomation.resuable.reusableActionelib;
public class pageLoginScreen extends reusableActionelib {

	public String testcasename;
	public String Browsername;
	public pageLoginScreen(WebDriver driver, String Testname, String Browsername) {
		super(driver);
		this.testcasename=Testname;
		this.Browsername=Browsername;
	}
//

*//**********************************************************
 * AARP Login
 **********************************************************//*

String Signin_Link = "//a[@id='fd_memberSignInButton']";
String Signin_username = "//input[@id='loginPOPUPuser']";
String Signin_password = "//input[@id='loginPOPUPpass']";
String Signin_button = "//button[@class='iso_footerBTN floatLeft margin_left_15px memSignPopup']";




public boolean Login(String URL, String UserName, String Password) {
	try {

		launchUrl(URL);
		Thread.sleep(5000);
		Enterusername(UserName);
		Enterpassword(Password);
		clickonloginbutton();

		return true;
	} catch (Exception e) {
		Reporter.log(e.toString());
		return false;
	}
}

private void resetapplicationstate() {
	Set<String> windows = driver.getWindowHandles();
	String firstwindow = driver.getWindowHandle();
	String wndowneedtobeactive = "";
	
	if (windows.size() > 1) {
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
			if (driver.getTitle().contains("myuhc")) {
				wndowneedtobeactive = winHandle;

			} else {
				
				driver.close();
			}
		}
		if (wndowneedtobeactive == "") {
			
		} else {
			driver.switchTo().window(wndowneedtobeactive);
		}
	}
	try {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//a[@href='signOut.do?psnName=link.nav.top.signout&requestor=/topNav']")));

		List<WebElement> signout = driver
				.findElements(By.xpath("//a[@href='signOut.do?psnName=link.nav.top.signout&requestor=/topNav']"));
		signout.get(1).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(userid_property)));

	} catch (Exception e) {

	}
}
// ============================================================================

public void Enterusername(String UserName) {

	try {
		cmmnFnc_inputText(userid_property, "XPATH", UserName);
		Reporter.log("Enter username successfully ");
	} catch (Exception e) {
		Reporter.log("Failed to enter user name ");
		Reporter.log(e.toString());
	}

}

public void Enterpassword(String Password) {

	try {
		cmmnFnc_inputText(password_property, "XPATH", Password);

		Reporter.log("Enter password successfully ");
	} catch (Exception e) {
		// TODO Auto-generated catch block

		Reporter.log("Failed to enter password ");
		Reporter.log(e.toString());
	}

}

public void clickonloginbutton() {
	try {
		cmmnFnc_clickbyXPATH_1(btnSignin_property);
		Reporter.log("clicked on login button successfully");

	} catch (Exception e) {
		// TODO Auto-generated catch block
		Reporter.log("Failed to click on login button");
		Reporter.log(e.toString());
	}
}
// ============================================================================

public void clickonFind_Physician_LabarotryLink() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchFindPhysician_XPATH");
		Reporter.log("Find Physician Labarotry Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("Find_Physician_Labarotry Link is not clicked", this.testcasename, this.Browsername);
		//Assert.fail("");
	}
}

public boolean GuestLaunch(String URL) {
	try {
		//resetapplicationstate();
		launchUrl(URL);
		Thread.sleep(2000);
		return true;
	} catch (Exception e) {
		Reporter.log(e.toString());
		return false;
	}
}

*//********************M2RLogin*****************//*

public void MnR_Login(String M2RURL)
{
	launchUrl(M2RURL);
}


	public void aARP_Login(String URL, String UserName, String Password) {
		try {
			launchUrl(URL);
			Thread.sleep(2000);
			clickonM2RSignInbutton();
			EnterM2RUserName(UserName);
			EnterM2RPassword(Password);
			clickonM2RLoginbutton();
			Reporter.log("able to login into M2R");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to login into M&R", this.testcasename, this.Browsername);
		}
	}

	public void clickonM2RSignInbutton() {
		try {
			cmmnFnc_clickbyXPATH("M2RSignin_XPATH");
			Reporter.log("SignIn button in M2R page is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on SignIn button in M2R pag", this.testcasename, this.Browsername);
		}
	}

	public void EnterM2RUserName(String UserName) {
		try {
			cmmnFnc_inputText("M2RSigninusername_XPATH", UserName);
			Reporter.log("Able to enter user name in UserName Textbox");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to enter user name in UserName Textbox", this.testcasename, this.Browsername);
		}
	}
	
	public void EnterM2RPassword(String Password) {
		try {
			cmmnFnc_inputText("M2RSigninpassword_XPATH",Password);
			Reporter.log("Able to enter password in password text box");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to enter password in password text boxx", this.testcasename, this.Browsername);
		}
	}
	
	public void clickonM2RLoginbutton() {
		try {
			cmmnFnc_clickbyXPATH("M2RLoginbutton_XPATH");
			Reporter.log("Login button in M2R page is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on Login button in M2R pag", this.testcasename, this.Browsername);
		}
	}

}
*/