package com.fw.RallyConnectAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.fw.RallyConnectAutomation.resuable.reusableActionelib;

public class pageGuestOptumRx extends reusableActionelib{

	public String testcasename;
	public String Browsername;
	public pageGuestOptumRx(WebDriver driver, String Testname, String Browsername) {
		super(driver);
		this.testcasename=Testname;
		this.Browsername=Browsername;
	}
	
	public void verificationOfPharmacy_DirectoryURL(String ExpectedURL) {
		//FindaPharmacyisdisplayedInOptumRx();
		//PharmacySearchisdisplayedInOptumRx();
		try {
			waitload(12000);
			String current_url = this.driver.getCurrentUrl();
			System.out.println(current_url);
			if (current_url.contains(ExpectedURL)) {
				Reporter.log("URL's are matched");
				System.out.println("Correct URL's are displayed");
			} else {
				cmmnFnc_Fail("URL's of Pharmacy Directory are not matched", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("URL's of Pharmacy Directory are not matched"+e.toString(), this.testcasename, this.Browsername);
		}
	}
	

	public void PharmacySearchisdisplayedInOptumRx() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchPharmacySearch_XPATH") == true) {
				Reporter.log("Pharmacy Search Is Displayed");
			} else {
				cmmnFnc_Fail("Pharmacy Search Is not Displayed", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Pharmacy SearchIs not Displayed" + e.toString(),
					this.testcasename, this.Browsername);
		}
	
	}

	public void FindaPharmacyisdisplayedInOptumRx() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchFindaPharmacy_XPATH") == true) {
				Reporter.log("Find a Pharmacy Is Displayed");
			} else {
				cmmnFnc_Fail("Find a Pharmacy Is not Displayed", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Find a Pharmacy Is not Displayed" + e.toString(),
					this.testcasename, this.Browsername);
		}

	}
	
	public void verificationOfMentalHealth_DirectoryURL(String ExpectedURL) throws Exception{
		//verifyFindProviderIsDisplayedInMentalHealthDirectoryWindow();
		try {
			waitload(10000);
			String current_url = this.driver.getCurrentUrl();
			System.out.println(current_url);
			if (current_url.contains(ExpectedURL)) {
				Reporter.log("URL's are matched");
				System.out.println("Correct URL's are displayed");
			} else {
				cmmnFnc_Fail("URL's of Mental Directory are not matched", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("URL's of Mental Directory are not matched" + e.toString());
		}
	}
	
	public void verificationOfVision_DirectoryURL(String ExpectedURL) throws Exception{
		//verifyProviderQuickSearchIsDisplayedInVisionDirectoryPage(); 
		try {
			waitload(15000);
			String current_url = this.driver.getCurrentUrl();
			System.out.println(current_url);
			if (current_url.contains(ExpectedURL)) {
				Reporter.log("URL's are matched");
				System.out.println("Correct URL's are displayed");
			} else {
				cmmnFnc_Fail("URL's of Vision Directory are not matched", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("URL's of Vision Directory are not matched" + e.toString());
		}
	}
	
	

	
	public void verificationOfDental_DirectoryURL(String ExpectedURL) {
		//verifyFindDentistIsDisplayedInDentalDirectoryPage();
		try {
			waitload(18000);
			String current_url = this.driver.getCurrentUrl();
			System.out.println(current_url);
			if (current_url.contains(ExpectedURL)) {
				Reporter.log("URL's are matched");
			} else {
				cmmnFnc_Fail("URL's of Dental Directory are not matched", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("URL's of Dental Directory are not matched" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	
	public void verifyFindProviderIsDisplayedInMentalHealthDirectoryWindow() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchFindaProvider_XPATH") == true) {
				Reporter.log("Find Provider Is Displayed In MentalHealthDirectory Window");
			} else {
				cmmnFnc_Fail("Find Provider Is not Displayed In MentalHealthDirectory Window", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Find Provider Is not Displayed In MentalHealthDirectory Window" + e.toString(),
					this.testcasename, this.Browsername);
		}
	}
	
	public void verifyFindDentistIsDisplayedInDentalDirectoryPage() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchFindaDentist_XPATH") == true) {
				Reporter.log("Find Dentist is Displayed In Dental Directory Page");
			} else {
				cmmnFnc_Fail("Find Dentist is not Displayed In Dental Directory Page", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Find Dentist is not Displayed In Dental Directory Page" + e.toString(),
					this.testcasename, this.Browsername);
		}
	}
	
	public void verifyProviderQuickSearchIsDisplayedInVisionDirectoryPage() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchProviderQuickSearch_XPATH") == true) {
				Reporter.log("Provider QuickSearch is Displayed In Dental Directory Page");
			} else {
				cmmnFnc_Fail("Provider QuickSearch is not Displayed In Dental Directory Page", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Provider QuickSearch is not Displayed In Dental Directory Page" + e.toString(),
					this.testcasename, this.Browsername);
		}
	}
	
}
