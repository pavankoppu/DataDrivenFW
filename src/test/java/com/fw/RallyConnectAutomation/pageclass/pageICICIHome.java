package com.fw.RallyConnectAutomation.pageclass;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.fw.RallyConnectAutomation.resuable.reusableActionelib;

public class pageICICIHome extends reusableActionelib {

	public String testcasename;
	public String Browsername;

	public pageICICIHome(WebDriver driver, String Testname, String Browsername) {
		super(driver);
		this.testcasename = Testname;
		this.Browsername = Browsername;
	}
	
	String ICICIProducts_XPATH = "//a[contains(text(),'Products')]";
	String ICICIHomeLoan_XPATH = "//a[contains(text(),'Home Loan')]";
	
	
	public void App_Navigate(String URL) {
		try {
			launchUrl(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Reporter.log("able to open the browser");
		} catch (Exception e) {
			cmmnFnc_Fail("Unable to login ", this.testcasename, this.Browsername);
		}
	}
	
	public void KeyboardEventSearch(String search) throws Exception {
	try
	{
		//Verify searh box is present or not
		Boolean eleexist = cmmnFnc_ElementPresent_Verification(prop("ICICISearchTextBox_XPATH"));
		if(eleexist == true)
		{
			//enter value in the search box
		cmmnFnc_inputText(prop("ICICISearchTextBox_XPATH"), "XPATH", search);
		
		/*try {
			WebDriverWait wait = new WebDriverWait(driver, 200);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ICICISearchTextBox1_XPATH)));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		//driver.findElement(By.xpath(ICICISearchTextBox1_XPATH)).sendKeys(search); */
		waitload(5000);
		String actualtext = cmmnFnc_getTextofElement(prop("ICICISearchTextBox_XPATH"));
		System.out.println(actualtext);
		Reporter.log("Entered Text on the Search Box" + actualtext);
		}
	}
		catch(Exception e)
		{
			cmmnFnc_Fail("Failed to enter text on Search box" + e.toString(), this.testcasename, this.Browsername);
		}
	}

	//Mouse Event
	
	public void MouseEvent() 
	{
				
			try{
				Boolean eleexist = cmmnFnc_ElementPresent_Verification(prop("ICICIProducts_XPATH"));
				if(eleexist == true)
				{
				waitload(5000);
				cmmnFnc_moveToElement_mouseover(ICICIProducts_XPATH);
				Reporter.log("Clicked on Products Link");
				waitload(5000);
				Boolean eleexist1 = cmmnFnc_ElementPresent_Verification(prop("ICICIHomeLoan_XPATH"));
				if(eleexist1 == true)
				{
				cmmnFnc_clickbyXPATH_ActionClass(ICICIHomeLoan_XPATH);
				waitload(3000);
				Reporter.log("Clicked on Home Loan Link"); 
				//Get Title and Print it
				System.out.println(getWindowTitle());
				Reporter.log(getWindowTitle());
				waitload(3000);
				/*
				Actions myaction = new Actions(driver);
				WebElement Prod = this.driver.findElement(By.linkText(ICICIProducts_Link));
				myaction.moveToElement(Prod).perform();*/
				}
							}
			}
			catch(Exception e)
			{
				cmmnFnc_Fail("Failed to click on Homeloan link" + e.toString(), this.testcasename, this.Browsername);
			}
		}
	}

/*	public WebDriver switchtorallyscreen() {
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
	}*/
	
/*	
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
			cmmnFnc_clickbyXPATH_1(imgPopup_property);
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
			cmmnFnc_clickbyXPATH_1(altMedPopup_XPATH);
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
			cmmnFnc_clickbyXPATH_1(imgPopup_property);
			Reporter.log("Successfully close alert popup");
			this.driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Rally pop is not displayed");
		}
	}
	

	public void click_on_physician_and_facilitieslink() {
		
		try {
			cmmnFnc_clickbyXPATH_1(provider_phyicianlink);
			Reporter.log("clicked on phyician and facilies link successfully");
		} catch (Exception e) {
			cmmnFnc_Fail("failed to click on physicin and facilied link"+e.toString(), this.testcasename, this.Browsername);
		}

	}

	public void uhcWestPromation() throws Exception {
		try {

			this.driver.switchTo().frame(this.driver.findElement(By.xpath(popupframe)));
			cmmnFnc_clickbyXPATH_1(imgPopup_property);
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
			cmmnFnc_clickbyXPATH_1(changePCPLinkTools1_XPATH);
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
	}*/
	

