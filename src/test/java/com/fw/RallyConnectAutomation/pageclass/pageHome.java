/*package com.fw.RallyConnectAutomation.pageclass;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.fw.RallyConnectAutomation.resuable.reusableActionelib;

public class pageHome extends reusableActionelib {

	public String testcasename;
	public String Browsername;

	public pageHome(WebDriver driver, String Testname, String Browsername) {
		super(driver);
		this.testcasename = Testname;
		this.Browsername = Browsername;
	}

	String imgPopup_property = "//img[@src='themes/html/portal/images/myuhc/myUHC_RallyInterstitial_X-Close.jpg']";
	String imgPopup_locator = "XPATH";
	String rallyProvider_property = "//input[@name='RALLY_PROVIDER']";
	String rallyProvider_locator = "XPATH";
	String rallybtn_property = "//input[@name='update' and @value='UPDATE']";
	String rallybtn_locator = "XPATH";
	String rallylinkGoback_property = "//a[contains(text(),'go back to pilot home')]";
	String rallylinkGoback_locator = "XPATH";
	String Signout_button = "//a[@href='signOut.do?psnName=link.nav.top.signout&requestor=/topNav']";
	String NewUser_Promotion_Popup = "//td[@class='EU2Headline']";
	String NewUser_Promotion_Popup_Continuebutton = "//a[contains(text(),'Continue')]";
	String popupframe = "//div[@id='fixed-screen']/iframe";
	String provider_phyicianlink = "//a[contains(text(),'Physicians & Facilities')]";

	String changePCPLinkTools1_XPATH = "//a[(contains(text(),'Change Primary Care Physician')) and @class='link_tools']";
	String changePCPLink_XPATH="//a[contains(text(),'   Change PCP                     ')]";
    String altMedPopup_XPATH="//img[@src='themes/html/portal/images/myuhc/myUHC_RallyInterstitial_X-Close.jpg']";
	
	public void SignoutButton() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 200);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Signout_button)));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		List<WebElement> signout = driver.findElements(By.xpath(Signout_button));
		signout.get(1).click();
		Thread.sleep(5000);

	}

	public WebDriver switchtorallyscreen() {
		Set<String> windows = this.driver.getWindowHandles();
		String firstwindow =  this.driver.getWindowHandle();
		
		
		for (String winHandle : windows) {
			if (winHandle.toString().equals(firstwindow.toString())) {

			} else {
				this.driver.switchTo().window(winHandle);
				this.driver.manage().window().maximize();
			}
		}
		return this.driver;
	}
	
	
	public void prerquisite_to_navigate_to_rallyconnect() throws IOException {
		// THis entire code to handle new form to correct the user data
		driver.navigate().to(AppConst.Sys5_URL + "/member/editSession.do");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cmmnFnc_inputText("rallyProvider_XPATH", "true"); // setting value as
		// TRUE
		try {
			cmmnFnc_clickbyXPATH("rallybtn_XPATH");
			Reporter.log("clicked on rally button ");
		} catch (Exception e) {
			cmmnFnc_Fail("Failed to click on rally button  ", testcasename, this.Browsername);
		}
		try {
			cmmnFnc_clickbyXPATH("rallylinkGoback_XPATH");
			Reporter.log("clicked on Go back link ");
		} catch (Exception e) {
			cmmnFnc_Fail("Failed to click on Go back link ", testcasename, this.Browsername);
		}
	}

	public void Rallyclosealertpopup() {

		try {
			WebElement we = this.driver.findElement(By.xpath(popupframe));
			this.driver.switchTo().frame(we);
			cmmnFnc_clickbyXPATH(imgPopup_property);
			Reporter.log("Successfully close alert popup");
			this.driver.switchTo().defaultContent();
		
		} catch (Exception e) {
				cmmnFnc_Fail("Failed to close Alert Popup" + e.toString(), this.testcasename, this.Browsername);
				this.driver.switchTo().defaultContent();
		}
	}
	
	
	public void RallyAltMed_closeAlertpopup() {

		try {
			WebElement we = this.driver.findElement(By.xpath(popupframe));
			this.driver.switchTo().frame(we);
			cmmnFnc_clickbyXPATH(altMedPopup_XPATH);
			Reporter.log("Successfully close alert popup");
			this.driver.switchTo().defaultContent();
		
		} catch (Exception e) {
				cmmnFnc_Fail("Failed to close Alert Popup" + e.toString(), this.testcasename, this.Browsername);
				this.driver.switchTo().defaultContent();
		}
	}
	
	
	public void walmart() throws Exception {
		try {
			
			this.driver.switchTo().frame(this.driver.findElement(By.xpath(popupframe)));
			cmmnFnc_clickbyXPATH(imgPopup_property);
			Reporter.log("Successfully close alert popup");
			this.driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Rally pop is not displayed");
		}
	}
	

	public void click_on_physician_and_facilitieslink() {
		
		try {
			cmmnFnc_clickbyXPATH(provider_phyicianlink);
			Reporter.log("clicked on phyician and facilies link successfully");
		} catch (Exception e) {
			cmmnFnc_Fail("failed to click on physicin and facilied link"+e.toString(), this.testcasename, this.Browsername);
		}

	}

	public void uhcWestPromation() throws Exception {
		try {

			this.driver.switchTo().frame(this.driver.findElement(By.xpath(popupframe)));
			cmmnFnc_clickbyXPATH(imgPopup_property);
			Reporter.log("Successfully close alert popup");
			this.driver.switchTo().defaultContent();
		} catch (Exception e) {
			Reporter.log("Rally pop is not displayed");
			try {
				cmmnFnc_clickbyXPATH("UHCPromotion_XPATH");
			} catch (Exception et) {

			}
		}
	}
	public void clickonUHCPCPcloseButton() {
		try {
			cmmnFnc_clickbyXPATH("PCPclosebutton_XPATH");
			Reporter.log("able to click on UHC west PCP close button");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on UHC west PCP closeclose button", this.testcasename, this.Browsername);
		}
	}

	public void ClickonChangePCPToolsLink() {

		try {
			cmmnFnc_clickbyXPATH(changePCPLinkTools1_XPATH);
			Reporter.log("successfully found Change Primary Care Link");
			Thread.sleep(2000);
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on PCP link", this.testcasename, this.Browsername);
		}
	}
	public void ClickonChangePCPLink() {

		try {
			cmmnFnc_clickbyXPATH("ChangePCPLink_XPATH");
			Reporter.log("successfully clicked on Change PCP Link");
            Thread.sleep(7000);
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on PCP link", this.testcasename, this.Browsername);
		}
	}

	public void ValidateChangePCPhysicianLink() {

		try {
			cmmnFnc_TextVaidation("changePCPLinkTools_XPATH", "Change Primary Care Physician");
			Reporter.log("successfully found Change Primary Care Link");

		} catch (Exception e) {
			cmmnFnc_Fail("PCP link not Found", this.testcasename, this.Browsername);
		}
	}

	public void ValidateChangePCPText(String Expected) {

		try {
			cmmnFnc_TextVaidation("PCPValidation_XPATH", Expected);
			Reporter.log("successfully found Change Primary Care Link");

		} catch (Exception e) {
			cmmnFnc_Fail("Unable to find PCP validation text", this.testcasename, this.Browsername);
		}
	}
	public void ClickonMoreDetailsLink() {

		try {
			cmmnFnc_clickbyXPATH("MoreDetailsLink_XPATH");
			Reporter.log("Clicked on MoreDetails Link");

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to Click on MoreDetails Link", this.testcasename, this.Browsername);
		}
	}
	
	public void ClickonChangeDoctorLink() {

		try {
			cmmnFnc_clickbyXPATH("ChangeDoctorLink_XPATH");
			Reporter.log("Clicked on Change Doctor Link");

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to Click on Change Doctor Link", this.testcasename, this.Browsername);
		}
	}
	
	public void ValidatePersonCoveredText() {
		
		try {
			cmmnFnc_TextVaidation("PersonCoveredText_XPATH", "Persons Covered");
			Reporter.log("successfully found Persons Covered text");

		} catch (Exception e) {
			cmmnFnc_Fail("Unable to find Persons Covered text", this.testcasename, this.Browsername);
		}
	}
	
public void ValidateProviderNameasHyperLink() {
		
		try {
			cmmnFnc_ElementPresent_Verification("ProviderNameHyperLink_XPATH");
			Reporter.log("Provider Name is Present in the form of HyperLink");

		} catch (Exception e) {
			cmmnFnc_Fail("Provider Name is not Present in the form of HyperLink", this.testcasename, this.Browsername);
		}
	}
	
	
	public void ClickExpandAllLink() {

		try {
			cmmnFnc_clickbyXPATH("ExpandAllLink_XPATH");
			Reporter.log("Clicked on Expand All Link");

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to Click on Expand All Link", this.testcasename, this.Browsername);
		}
	}
	public void ClickonProvider_PhysFacilityLink() {

		try {
			cmmnFnc_clickbyXPATH("ProviderNameHyperLink_XPATH");
			Reporter.log("successfully click on Provider Link");

		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on Provider link", this.testcasename, this.Browsername);
		}
	}
	
	public void ClickonMemberRecords_PCP()  {
		try {
			cmmnFnc_clickbyXPATH("MemberSelection_XPATH");
			Reporter.log("Clicked on Member for the Change PCP ");
			Thread.sleep(9000);
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on Member for the Change PCP " + e.toString(), this.testcasename, this.Browsername);

		}
	}
	
	public void ClickonChangepcpMemberRecords_PCP()  {
		try {
			cmmnFnc_clickbyXPATH("FirstChangePCPuser_XPATH");
			Reporter.log("Clicked on Member for the Change PCP ");
			Thread.sleep(9000);
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to click on Member for the Change PCP " + e.toString(), this.testcasename, this.Browsername);

		}
	}
	
}
*/