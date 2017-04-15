/*
package com.fw.RallyConnectAutomation.suite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fw.RallyConnectAutomation.driverfactory.driverfactory;
import com.fw.RallyConnectAutomation.pageclass.AppConst;
import com.fw.RallyConnectAutomation.pageclass.pageGuestOptumRx;
import com.fw.RallyConnectAutomation.pageclass.pageGuestSearch;
import com.fw.RallyConnectAutomation.pageclass.pageGuidedSearch;
import com.fw.RallyConnectAutomation.pageclass.pageHome;
import com.fw.RallyConnectAutomation.pageclass.pageLoginScreen;

//import com.optum.RallyConnectAutomation.pageclass.pageRallyAssignedProviderScreen;

public class CopyOfAcceptance {
	private WebDriver drver;
	public String Devicemodel = this.Browsername;
	private String Deviceid;
	private String testcasename;
	private String Browsername;
	private String WinPlatform;

	public CopyOfAcceptance(String Deviceid, String Devicetype, String WinPlatform) {

		this.Deviceid = Deviceid;
		this.Browsername = Devicetype;
		this.WinPlatform = WinPlatform;
	}

	/***********************************************************************
	 * Text based Search
	 * 
	 * @throws Exception
	 **********************************************************************

	@Test(enabled = true)
	public void TESTCASE022_TC03_Verify_Text_Search_with_specialty_Withmorethan_1_Character_Not_full_name()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE022_TC03_Verify_Text_Search_with_specialty_Withmorethan_1_Character_Not_full_name";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.EnterTextintoSearchTextbox("Car");
			pgRally.clickOnSearchButton();
			pgRally.verifySearchResultsforGivenInputText("Car");
			pgRally.EnterTextintoSearchTextbox("Dermatol");
			pgRally.clickOnSearchButton();
			pgRally.verifySearchResultsforGivenInputText("Dermatol");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE020_TC04_Verify_Text_Search_with_place_Withmorethan_1_Character_Not_full_name()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);

			testcasename = "TESTCASE020_TC04_Verify_Text_Search_with_place_Withmorethan_1_Character_Not_full_name";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("Medi");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);

			pgRally.verifySearchResultsforGivenInputText("Medi");
			pgRally.EnterTextintoSearchTextbox("Institute");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Institute");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE017_TC05_Verify_the_Text_Search_People_Firstname_With_more_than1_Character_and_not_the_full_name()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE017_TC05_Verify_the_Text_Search_People_Firstname_With_more_than1_Character_and_not_the_full_name";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("55129");
			pgRally.EnterTextintoSearchTextbox("Jor");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Jor");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE014_TC06_Verify_the_Text_Search_People_Lastname_With_more_than1_Character_and_not_the_full_name()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE014_TC06_Verify_the_Text_Search_People_Lastname_With_more_than1_Character_and_not_the_full_name";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);

			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("55129");
			pgRally.EnterTextintoSearchTextbox("Joh");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Joh");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE013_TC07_Verify_the_TextSearch_with_specialty_With_full_name() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE013_TC07_Verify_the_TextSearch_with_specialty_With_full_name";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("Cardiology");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Cardiology");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE012_TC08_Verify_TextSearch_with_place_With_fullname() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE012_TC08_Verify_TextSearch_with_place_With_fullname";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("General Hospital");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("General Hospital");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE011_TC11_Verify_the_TextSearch_with_People_First_and_Last_name_With_fullname()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE011_TC11_Verify_the_TextSearch_with_People_First_and_Last_name_With_fullname";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("55129");
			pgRally.EnterTextintoSearchTextbox("Bergman, John");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Bergman, John");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE001_Add_Type_ahead_to_textbased_search() throws Exception {
		try {
			testcasename = "TESTCASE001_Add_Type_ahead_to_textbased_search";
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Add_Type_ahead_to_textbased_search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("Car");
			Thread.sleep(4000);
			pgRally.validateTextAheadListResultsForGivenInputText("Car");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE002_Allow_user_totype_in_City_State_for_Location_input() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE002_Allow_user_totype_in_City_State_for_Location_input";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), this.testcasename,
					this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnChangeLocation();
			Thread.sleep(5000);
			pgRally.EnterTextonUpdateLocationBox("Texa");
			int EnteredZipCode = pgRally.getEnteredZipCode();
			pgRally.clickOnZipcodeAutoList();
			Thread.sleep(4000);
			System.out.println(EnteredZipCode);
			Thread.sleep(4000);
			pgRally.clickonUpdateLocation();
			pgRally.verifyCorrectZipcodedisplayedAfterModifying(EnteredZipCode);
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true, priority = 206)
	public void TestCase044_Languages_spoken_by_Provider_and_Staff_are_not_displaying_in_Spanish() throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TestCase044_Languages_spoken_by_Provider_and_Staff_are_not_displaying_in_Spanish";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_SpanishUsername, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.click_OnEnglish_Link();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("62881");
			pgRally.EnterTextintoSearchTextbox("Garces");
			pgRally.clickOnSearchButton();
			pgRally.clickOnSpanishLink();
			pgRally.clickOnFirstResult();
			pgRally.clickOnTodaslasUbicaciones();
			pgRally.verifyIdiomashabladosporelpersonalisdisplayed();
			Thread.sleep(5000);
			pgRally.click_OnEnglish_Link();
			
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE029_Search_Results_Doctors_and_Facilities() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE029_Search_Results_Doctors_and_Facilities";
			System.out.println(Thread.currentThread().getId());
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("55129");
			pgRally.EnterTextintoSearchTextbox("Urgent Care");
			pgRally.clickOnSearchButton();
			Thread.sleep(10000);
			pgRally.selectFacility();
			pgRally.doctorsandFaclitiesVerification("DOCTORS", "FACILITIES");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE015_User_able_tosearch_Common_Conditions() throws Exception

	{
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE015_User_able_tosearch_Common_Conditions";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("Back Pain");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Back Pain");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE008_search_Common_Conditions_with_text_ahead() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE008_search_Common_Conditions_with_text_ahead";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("High Blood Pressure");
			Thread.sleep(4000);
			pgRally.validateTextAheadListResultsForGivenInputText("High Blood Pressure");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE009_search_for_CardiologyandCardiologist() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE009_search_for_CardiologyandCardiologist";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.EnterTextintoSearchTextbox("Cardiologist");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Cardiologist");
			pgRally.EnterTextintoSearchTextbox("Cardiology");
			pgRally.clickOnSearchButton();
			Thread.sleep(4000);
			pgRally.verifySearchResultsforGivenInputText("Cardiology");

		} finally {
			this.drver.quit();
		}
	}


	@Test(enabled = true)
	public void TESTCASE004_DisplayofCustomerName() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE004_DisplayofCustomerName";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.customerNameVerification("Amy");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true, priority = 201)
	public void TESTCASE043_Display_of_preferred_Provider_Name_Spanish() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE043_Display_of_preferred_Provider_Name_Spanish";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifyProviderNameInSpanishLanguageforUOM("Univ. of MO Red personalizada");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE003_Display_of_preferred_Provider_Name_English() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE003_Display_of_preferred_Provider_Name_English";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifyProviderNameInEnglishforUOM("Univ. of MO Custom Network");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE007_Preferred_provider_network_default_sort_order() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE007_Preferred_provider_network_default_sort_order";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifyDefaultSortPreferredProviderNetworkFromdropdown("Univ. of MO Custom Network");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE042_Preferred_provider_network_filter() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE042_Preferred_provider_network_filter";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifyPreferredProviderNetworkFromdropdown("Univ. of MO Custom Network");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE041_Preferred_provider_network_textandIcon_Additional_locations_tab() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE041_Preferred_provider_network_textandIcon_Additional_locations_tab";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifyPreferredProviderNetworkandIconFromAdditionallocationstab("Univ. of MO Custom Network");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE040_Preferred_provider_network_text_Icon_Provider_details_page() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE040_Preferred_provider_network_text_Icon_Provider_details_page";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifyPreferredProviderNetworkandIconFromproviderdetailspage("Univ. of MO Custom Network");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE039_Suppress_of_UHPD_Tier1() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE039_Suppress_of_UHPD_Tier1";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickOnPlacesLink();
			pgRally.clickOnclickPlace_Hospitals();
			Thread.sleep(8000);
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifySupressedTextTier1isnotdispalyedinUOM();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE038_Suppress_Hospital_Tier1_in_sort_dropdown() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE038_Suppress_Hospital_Tier1_in_sort_dropdown";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("65101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			Thread.sleep(8000);
			pageUniversityOfMissouri uom = new pageUniversityOfMissouri(this.drver, testcasename, this.Browsername);
			uom.verifySupressedTextTier1isnotdispalyedinUOMDropdown("Tier 1");

		} finally {
			this.drver.quit();
		}
	}
	// 24 test cases
	*//***************************************************************************
	 * End of University Of University of Missouri
	 ***************************************************************************//*

	*//***********************************************************************
	 * UHC West Test cases
	 * 
	 * @throws Exception
	 ***********************************************************************//*

	@Test(enabled = true,priority=15)
	public void TESTCASE037_TC_13_UHW35_Common_questions_display_translation_information_authenticated()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE037_TC_13_UHW35_Common_questions_display_translation_information_authenticated";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnCommonQuestions();
			pgRally.VerificationofCaliforniaText();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=16)
	public void TESTCASE036_Spec_1523_Display_Medical_Group_node_under_People_node_authenticated() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1 ,AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgHome.clickonUHCPCPcloseButton();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickonPeopleIcon();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pgRally.WhoareyoulookingIsDisplayed();
			pguhc.verifyMedicalTileUnderPeople();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=16)
	public void TESTCASE035_TC051_Unregistered_Login_RallyConnect() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE035_TC051_Unregistered_Login_RallyConnect";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.VerifyGuestUserNavigatedtoRally();
		} finally {
			this.drver.quit();
		}
	}

	
	// completed
	@Test(enabled = true,priority=17)
	public void TESTCASE094_Spec_539_Display_PCP_info_link() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pgRally.SearchbuttonIsDisplayed();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pguhc.verificationOfPCPLinkdisplayed();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=18)
	public void TESTCASE093_UHW13_Refine_Search_results_Hospital_Affliation() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("97045");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pguhc.clickOnHospitalAffiliations();
			pguhc.selectFirstListOfHospitalAffiliationResults();
			//pguhc.refineResultsVerification("Your primary care physician (PCP)");

		} finally {
			this.drver.quit();
		}
	}
	

	// completed
	@Test(enabled = true,priority=19)
	public void TESTCASE095_UHW_13_Refine_search_results_Language() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("97045");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pguhc.clickOnLanguageFilter();
			pguhc.selectFirstListOfLanguageResults();
			//pguhc.refineResultsVerification("Your primary care physician (PCP)");

		} finally {
			this.drver.quit();
		}
	}

	
	// completed
	@Test(enabled = true,priority=20)
	public void TESTCASE096_System_allows_users_to_see_all_plans_that_a_Provider_participates_in_PostLogin()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("97045");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pguhc.clickOnFirstResult();
			pguhc.clickOnAcceptedPlansTab();
			pguhc.verifyAllAcceptedPlansDisplayed();

		} finally {
			this.drver.quit();
		}
	}

	// completed
	@Test(enabled = true,priority=21)
	public void TESTCASE097_UHW17_View_providers_in_a_specific_Medical_group_Post_Login() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickonPeopleIcon();
			pguhc.clickOnMedicalGroup();
			pguhc.clickOnFirstResultOfMedicalGroupResults();
			pguhc.clickOnPhysicainDirectory();
			pguhc.clickOnShowPhysicians();
			pguhc.verifyAddressDetailsDisplayedforShowPhysician();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=22)
	public void TESTCASE098_UHW_20_Ability_to_Report_Incorrect_info_for_Providers() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonUHCPCPcloseButton();
			pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("97045");
			
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pguhc.clickOnFirstResult();
			pguhc.clickOnReportIncorrectInformationLink();
			pguhc.ReportIncorrectDetails();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=23)
    public void TESTCASE125_Spec830_Display_AgeRestrictionIndicatorandMessageforPhysician() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE125_Spec830_Display_AgeRestrictionIndicatorandMessageforPhysician";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.GuestLaunch(AppConst.Sys2_URL);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  lp.clickonFind_Physician_LabarotryLink();
                  pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  gs.VerifyGuestUserNavigatedtoRally();
                  Thread.sleep(5000);
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.navigateToFindCarePage();
                  Thread.sleep(3000);
                  pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                  pgRally.EnterTextZipCode("97045");
                  uhcguest.clickOnContinueButton();
                  pgRally.clickonUHCPCPcloseButton();
                  Thread.sleep(3000);
                  pgRally.clickonPeopleIcon();
                  pgRally.clickonPrimaryCareIcon();
                  pgRally.clickonPCPIcon();
                  uhcguest.clickOnFirstProvider();
                  uhcguest.clickOnPatientAgeRestriction();
                  uhcguest.verifyPatientAgeRestrictionHeaderText("Patient Age Requirement");
                  uhcguest.verifyPatientAgeRestrictionContainerText("This doctor only sees patients in certain age groups. For details, please contact customer service at the number found on the back of your member ID card.");
           } 
           finally {
                  this.drver.quit();
           }
    }
    
    @Test(enabled = true,priority=24)
    public void TESTCASE126_Suppress_ClinicsTile_fromPlacesNode() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE126_Suppress_ClinicsTile_fromPlacesNode";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.GuestLaunch(AppConst.Sys2_URL);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  lp.clickonFind_Physician_LabarotryLink();
                  pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  gs.VerifyGuestUserNavigatedtoRally();
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.navigateToFindCarePage();
                  Thread.sleep(3000);
                  pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                  pgRally.EnterTextZipCode("97045");
                  uhcguest.clickOnContinueButton();
                  pgRally.clickonUHCPCPcloseButton();
                  Thread.sleep(3000);
                  pgRally.verifyPlacesIcon();
                  uhcguest.supress_Clinics_Node();                
           } 
           finally {
                  this.drver.quit();
           }
    }
    
    @Test(enabled = true,priority=25)
    public void TESTCASE127_Spec539_Display_SelectStatePage_IfUserClicks_ChangesPlanLink() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE127_Spec539_Display_SelectStatePage_IfUserClicks_ChangesPlanLink";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.GuestLaunch(AppConst.Sys2_URL);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  lp.clickonFind_Physician_LabarotryLink();
                  pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  gs.VerifyGuestUserNavigatedtoRally();
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.navigateToFindCarePage();
                  Thread.sleep(3000);
                  pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                  pgRally.EnterTextZipCode("97045");
                  uhcguest.clickOnContinueButton();
                  pgRally.clickonUHCPCPcloseButton();
                  Thread.sleep(3000);
                  uhcguest.clickOnChangePlanLink();
                  uhcguest.clickon_MedicalDirectory();
                  uhcguest.verifyPage_whenClickedOn_ChangePlan("To search for doctors, clinics or facilities, choose the state where you live");
           } 
           finally {
                  this.drver.quit();
           }
    }
    
    
    @Test(enabled = true,priority=26)
    public void TESTCASE128_DisplayDisclaimer_whenOtherThan_CAState_isSelected() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE128_DisplayDisclaimer_whenOtherThan_CAState_isSelected";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.GuestLaunch(AppConst.Sys2_URL);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  lp.clickonFind_Physician_LabarotryLink();
                  pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  gs.VerifyGuestUserNavigatedtoRally();
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.navigateToFindCarePage();
                  Thread.sleep(3000);
                  pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                  pgRally.EnterTextZipCode("97045");
                  uhcguest.clickOnContinueButton();
                  uhcguest.verify_PCPInfo_PageHeader("Primary Care Provider Information");
                  uhcguest.verify_PCPInfo_PageText();
           } 
           finally {
                  this.drver.quit();
           }
    }
    
    @Test(enabled = true,priority=27)
    public void TESTCASE129_UHClogo_ShouldTakeUser_toSelectplan_Or_FindcarePage() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE129_UHClogo_ShouldTakeUser_toSelectplan_Or_FindcarePage";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.GuestLaunch(AppConst.Sys2_URL);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  lp.clickonFind_Physician_LabarotryLink();
                  pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  gs.VerifyGuestUserNavigatedtoRally();
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.navigateToFindCarePage();
                  Thread.sleep(3000);
                  pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                  pgRally.EnterTextZipCode("97045");
                  uhcguest.clickOnContinueButton();
                  pgRally.clickonUHCPCPcloseButton();
                  pgRally.clickonPeopleIcon();
                  pgRally.clickonPrimaryCareIcon();
                  pgRally.clickonPCPIcon();
                  uhcguest.clickOn_UHCLogo();
           } 
           finally {
                  this.drver.quit();
           }
    }
    
    @Test(enabled = true,priority=01)
    public void TESTCASE130_Def7556_Display_EnrollmentId_InPrintDirectory() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE130_Def7556_Display_EnrollmentId_InPrintDirectory";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName, AppConst.Password);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  pgHome.uhcWestPromation();
                  pgHome.click_on_physician_and_facilitieslink();
                  pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                  pagePhyscnFaclts.clickonfindproviderbutton();
                  pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  pgRally.clickonUHCPCPcloseButton();
                  pgRally.changeZip_PageRallyScreen("93504");                   
                  pgRally.clickonPeopleIcon();
                  pgRally.clickonPrimaryCareIcon();
                  pgRally.clickonPCPIcon();
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.extend_Distance();            //added this line
                  uhcguest.clickOn_PrintDirectory();
                  pageEmpire pgemp=new pageEmpire(this.drver, testcasename, this.Browsername);
                 // pgemp.HandlingPrintDirectoryPopup();
                  pgHome.switchtorallyscreen();
                  uhcguest.verify_PhysicianId_IsDisplayed();    
           } 
           finally {
                  this.drver.quit();
           }
    }

    
    @Test(enabled = true,priority=29)
    public void TESTCASE131_UHW11_Supress_UnitedHealthPremiumDesignation_Info() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE131_UHW11_Supress_UnitedHealthPremiumDesignation_Info";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  pgHome.uhcWestPromation();
                  pgHome.click_on_physician_and_facilitieslink();
                  pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                  pagePhyscnFaclts.clickonfindproviderbutton();
                  pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  pgRally.clickonUHCPCPcloseButton();
                  pgRally.click_OnEnglish_Link();
                  pgRally.clickonPeopleIcon();
                  pgRally.clickonPrimaryCareIcon();
                  pgRally.clickonPCPIcon();
                  pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
                  pguhc.verify_ifUHPD_isSupressed();
           } 
           finally {
                  this.drver.quit();
           }
    }
  
    
    @Test(enabled = true, priority = 206)
    public void TESTCASE132_UHW4_ProviderSearch_forUser_Using_SpanishVersion() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE132_UHW4_ProviderSearch_forUser_Using_Spanish";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName, AppConst.Password);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  pgHome.uhcWestPromation();
                  pgHome.click_on_physician_and_facilitieslink();
                  pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                  pagePhyscnFaclts.clickonfindproviderbutton();
                  pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  pgRally.clickonUHCPCPcloseButton();
                  pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
                  pguhc.provider_Search_InSpanish();
           } 
           finally {
             this.drver.quit();
           }
    } 
    
    @Test(enabled = true,priority=23)
    public void TESTCASE125_Spec39_Display_detailed_Medical_group_information_to_userguest() throws Exception {
           try {
                  this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                  testcasename = "TESTCASE125_Spec39_Display_detailed_Medical_group_information_to_userguest";
                  Reporter.log("Execution on Device:" + this.Browsername);
                  pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                  lp.GuestLaunch(AppConst.Sys2_URL);
                  pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                  lp.clickonFind_Physician_LabarotryLink();
                  pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                  gs.VerifyGuestUserNavigatedtoRally();
                  pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                  uhcguest.navigateToFindCarePage();
                  pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                  pgRally.EnterTextZipCode("97045");
                  uhcguest.clickOnContinueButton();
                  pgRally.clickonUHCPCPcloseButton();
                  pgRally.clickonPeopleIcon();
                  pgRally.clickonPrimaryCareIcon();
                  pgRally.clickonPCPIcon();
                  uhcguest.clickOnFirstProvider();
                  uhcguest.clickOnAlllocationsTab();
                  uhcguest.verifyservicesdetailsinAlllocationsTab();
           } 
           finally {
                  this.drver.quit();
           }
    } 
           @Test(enabled =true,priority=23)
           public void TESTCASE125_Spec_539_Ability_for_guest_user_to_select_a_network_based_on_state_selection() throws Exception {
                  try {
                         this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                         testcasename = "TESTCASE125_Spec_539_Ability_for_guest_user_to_select_a_network_based_on_state_selection";
                         Reporter.log("Execution on Device:" + this.Browsername);
                         pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                         lp.GuestLaunch(AppConst.Sys2_URL);
                         pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                         lp.clickonFind_Physician_LabarotryLink();
                         pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                         gs.VerifyGuestUserNavigatedtoRally();
                         pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, testcasename, this.Browsername);
                         uhcguest.navigateToFindCarePage();
                         pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
                         pgRally.EnterTextZipCode("97045");
                         uhcguest.clickOnContinueButton();
                         pgRally.clickonUHCPCPcloseButton();
                         pgRally.clickonPeopleIcon();
                         pgRally.clickonPrimaryCareIcon();
                         pgRally.clickonPCPIcon();
                         uhcguest.clickOnFirstProvider();
                         uhcguest.clickOnAlllocationsTab();
                         uhcguest.verifyservicesdetailsinAlllocationsTab();
                  } 
                  finally {
                         this.drver.quit();
                  }

    }
           
           @Test(enabled = true,priority=29)
           public void TESTCASE131_Spec_1401_Allow_user_to_submit_a_survey_for_a_provider() throws Exception {
                  try {
                         this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                         testcasename = "TESTCASE131_Spec_1401_Allow_user_to_submit_a_survey_for_a_provider";
                         Reporter.log("Execution on Device:" + this.Browsername);
                         pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                         lp.Login(AppConst.Sys2_URL, AppConst.UHCWest_UserName1, AppConst.Password);
                         pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                         pgHome.uhcWestPromation();
                         pgHome.click_on_physician_and_facilitieslink();
                         pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                         pagePhyscnFaclts.clickonfindproviderbutton();
                         pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                         pgRally.clickonUHCPCPcloseButton();
                         pgRally.click_OnEnglish_Link();
                         pgRally.clickonPeopleIcon();
                         pgRally.clickonPrimaryCareIcon();
                         pgRally.clickonPCPIcon();
                         pageUHCWest pguhc = new pageUHCWest(this.drver, testcasename, this.Browsername);
                         pguhc.verify_ifUHPD_isSupressed();
                  } 
                  finally {
                         this.drver.quit();
                  }
           }
           
           //

	*//***********************************************************************
	 * Guided Search
	 * 
	 * @throws Exception
	 ***********************************************************************//*

	@Test(enabled = true)
	public void TESTCASE030_Verify_the_List_of_the_options_in_Guided_Search() throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE030_Verify_the_List_of_the_options_in_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.verifyPepoleIcon();
			pgRally.verifyPlacesIcon();
			pgRally.verifyTestsandImagingIcon();
			pgRally.verifyServicesandTreatmentsIcon();
			pgRally.verifyCarebyConditionIcon();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.VerifyTextUnderPepoleicon("Doctors, medical groups, and other professionals by specialty");
			pggs.VerifyTextUnderPepoleicon("Hospitals, clinics, labs, imaging centers");
			pggs.VerifyTextUnderTextandImgaesicon("Lab tests, screenings, X-rays, scans");
			pggs.VerifyTextUnderServicesAndTreatments("Office visits, tests, treatments, surgeries");
			pggs.VerifyTextUnderCareByConditionicon("Find care for common concerns");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE031_Verify_the_displaying_of_Default_location() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE031_Verify_the_displaying_of_Default_location";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.zipcodeIsDisplayed();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE032_TC_08_Verify_the_Results_by_selecting_Find_Health_care_professional_Primary_Care_Physicians()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE032_TC_08_Verify_the_Results_by_selecting_Find_Health_care_professional_Primary_Care_Physicians";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.UOM_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			//pgRally.PCPResultsHeadingIsDisplayed();
			pggs.clickOnSpeciality();
			pggs.selectFirstListOfSpecialityResults();
			pggs.refineResultsVerification();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCAE046_TC_09_Verify_the_Results_by_selecting_Find_healthcareprofessional_Specialists()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCAE046_TC_09_Verify_the_Results_by_selecting_Find_healthcareprofessional_Specialists";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.click_OnEnglish_Link();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("77568");
			pgRally.clickonPeopleIcon();
			pgRally.clickOnSpecialityCareIcon();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.clickonPeople_SpecialityCareResult();
			pggs.verifySearchResultsForSpecialtyCareAsperSearchCriteria();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCAE047_TC_12_Verify_the_Results_by_selecting_Find_Place_Clinics() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCAE047_TC_12_Verify_the_Results_by_selecting_Find_Place_Clinics";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnPlacesLink();
			pgRally.clickOnPlaces_ClinicsButton();
			Thread.sleep(8000);
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.clickOnConvenienceClinicLink();
			Thread.sleep(4000);
			pggs.verifySearchResultsForConvenienceClinicLink();
			Thread.sleep(4000);

			
			 * //Urgent Urgnet Care Center Clinic
			 * pggs.clickOnUrgentCareClinic(); System.out.println("Deepu");
			 * Thread.sleep(4000);
			 * pggs.verifySearchResultsForUrgentCareClinicLink();
			 * System.out.println("Dev");
			 

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCAE048_TC_15_Verify_the_Results_by_selecting_Find_a_Place_SpecialtyCare() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCAE048_TC_15_Verify_the_Results_by_selecting_Find_a_Place_SpecialtyCare";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnPlacesLink();
			pgRally.clickOnPlaces_SpecialityCenter();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.verifySearchResultsForPlace_SpecialityCenter();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCAE049_TC_16_Verify_the_Results_by_selecting_Find_Place_PharmaceuticalMedicalSupplies()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCAE049_TC_16_Verify_the_Results_by_selecting_Find_Place_PharmaceuticalMedicalSupplies";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnPlacesLink();
			pgRally.clickOnPlace_MedicalSuppliers();
			Thread.sleep(8000);
			pageGuidedSearch pggs = new pageGuidedSearch(pgHome.switchtorallyscreen(), this.testcasename,
					this.Browsername);
			pggs.verifySearchResultsForMedicalSuppliers();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCAE050_TC_20_Verify_the_Results_by_selecting_Find_provider_for_Lab_XRays_and_Screenings_XRayimaging()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCAE050_TC_20_Verify_the_Results_by_selecting_Find_provider_for_Lab_XRays_and_Screenings_XRayimaging";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnTestsandImagingIcon();
			pgRally.clickOnTestsandImaging_ImageIcon();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.verifySearchResultsForTestsandImaging_ImageXRayetc();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE033_TC023_Verify_the_Results_by_selecting_Find_a_doctor_for_common_condition()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE033_TC023_Verify_the_Results_by_selecting_Find_a_doctor_for_common_condition";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnclickOnCareByCondition();
			pgRally.clickOnCommonConditionResult();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.verifySearchResultsForCareByCondition_CommonCondition();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE052_TC024_Verify_the_Results_by_selecting_Find_a_Care_for_prevention_treatment_Procedure_Office_Visits()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE052_TC024_Verify_the_Results_by_selecting_Find_a_Care_for_prevention_treatment_Procedure_Office_Visits";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnServicesAndTreatments();
			pgRally.clickOnclickOnServicesAndTreatments_OfficeVisits();
			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.clickOnWellVisits();
			pggs.clickOnGuidedPCP();
			pggs.verifySearchResultsForPCPLink();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCAE051_TC_27_Verify_the_Results_by_Selecting_Find_a_Care_for_preventiontreatment_Procedure_Surgeries()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCAE051_TC_27_Verify_the_Results_by_Selecting_Find_a_Care_for_preventiontreatment_Procedure_Surgeries";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnServicesAndTreatments();
			pgRally.clickOnclickOnServicesAndTreatments_OfficeVisits();

			pageGuidedSearch pggs = new pageGuidedSearch(this.drver, this.testcasename, this.Browsername);
			pggs.clickOnServiceAndTreatments_OfficeVisits_SickVisit();
			pggs.clickOnServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctors();
			pggs.verifySearchResultsForServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctor();

		} finally {
			this.drver.quit();
		}
	}

	*//***********************************************************************
	 * WalMart
	 * 
	 * @Exception
	 ***********************************************************************//*

	@Test(enabled = true)
	public void TESTCASE068_WalMart_Display_of_preferred_Provider_Name_English() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE068_WalMart_Display_of_preferred_Provider_Name_English";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_WalMart_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.walmart();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("88101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageWalMart pgwm = new pageWalMart(this.drver, testcasename, this.Browsername);
			//pgRally.PCPResultsHeadingIsDisplayed();
			pgwm.verifyProviderNameInEnglishforWalMart("Walmart Preferred Network");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE068_Display_of_UHPDTier1() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE068_Display_of_UHPDTier1";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_WalMart_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.walmart();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("88101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageWalMart pgwm = new pageWalMart(this.drver, testcasename, this.Browsername);
			//pgRally.PCPResultsHeadingIsDisplayed();
			pgwm.verifyUPHDTier1forWalMart("TIER");

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE069_preferred_Provider_Name_Informational_text_in_English() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE069_preferred_Provider_Name_Informational_text_in_English";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_WalMart_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.walmart();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("88101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageWalMart pgwm = new pageWalMart(this.drver, testcasename, this.Browsername);
			//pgRally.PCPResultsHeadingIsDisplayed();
			pgwm.verificationOfProviderNameInformationalText_English_WalMart("Walmart  Preferred Network",
					"You can lower your out-of-packet expenses by using a Walmart Preferred Network");

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true, priority = 22)
	public void TESTCASE042_Preferred_provider_network_filter_WalMart() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE042_Preferred_provider_network_filter";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_WalMart_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.walmart();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("88101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageWalMart pgwm = new pageWalMart(this.drver, testcasename, this.Browsername);
			//pgRally.PCPResultsHeadingIsDisplayed();
			pgwm.verifyPreferredProviderNetworkFromdropdown_WalMart("Walmart Preferred Network");

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE070_Preferred_provider_network_text_Icon_Additional_locations_WalMart() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE070_Preferred_provider_network_text_Icon_Additional_locations_WalMart";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_WalMart_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.walmart();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("88101");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageWalMart pgwm = new pageWalMart(this.drver, testcasename, this.Browsername);
			//pgRally.PCPResultsHeadingIsDisplayed();
			pgwm.verifyPreferredProviderNetworkandIconFromAdditionallocationstab_WalMart("Walmart  Preferred Network");
		} finally {
			this.drver.quit();
		}
	}

	*//***********************************************************************
	 * End of WalMart
	 ***********************************************************************//*

	*//***********************************************************************
	 * M2R Test cases
	 * 
	 * @throws Exception
	 ***********************************************************************//*
	
	@Test(enabled = true)
	public void TESTCASE072_MnR_Accepted_Plans_list_under_All_Plans_tab_in_provider_details_page() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE072_MnR_Accepted_Plans_list_under_All_Plans_tab_in_provider_details_page";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgRally.clickOnFirstResult();
			pgmr.acceptedPlansTabIsdisplayed();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE073_MnR_Display_of_Accepts_Medicaid_filter() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE071_MnR_Date_stamp";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgmr.verificationOfAcceptsMedicadDisplay();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true,priority=1)
	public void TESTCASE034_TC_22_M2R_ContactUs_Link_RallyConnect() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE034_TC_22_M2R_ContactUs_Link_RallyConnect";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgmr.contactUslink_Verification("Please call the customer service number listed on the back of your member ID card.");
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=3)
	public void TESTCASE071_MnR_Date_stamp() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE071_MnR_Date_stamp";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgmr.verifyM2RRallyDateFormatIsDisplayed();
			// pgmr.verifyM2RRallyDateFormatDisplayedasPertheRequirement("06/27/2016
			// 6:00pm CT");

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true,priority=11)
	public void TESTCASE080_MnR_Display_diclaimer_when_Member_is_linking_to_external_site() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE080_MnR_Display_diclaimer_when_Member_is_linking_to_external_site";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnPlacesLink();
			pgRally.clickOnclickPlace_Hospitals();
			pgRally.clickOnFirstResult();
			pgmr.clickOnPatientSafety();
			pgmr.clickOnLeapFrogGroup();
			pgmr.LeafFrogDiscaimerTextVerfication();
			//pgmr.verificationOfLeafFrogGroupURL("http://www.leapfroggroup.org/survey-materials");

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true,priority=10)
	public void TESTCASE079_MnR_Display_Leapfrogdata() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE079_MnR_Display_Leapfrogdata";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnPlacesLink();
			pgRally.clickOnclickPlace_Hospitals();
			pgRally.clickOnFirstResult();
			pgmr.clickOnPatientSafety();
			pgmr.clickOnLeapFrogGroup();
			pgmr.clickOnLeafFrogContinueButton();
			pgHome.switchtorallyscreen();
			pgmr.verificationOfLeafFrogGroupURL("leapfrog");

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true,priority=9)
	public void TESTCASE081_MnR_Display_Tiering_level_for_a_Provider() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE081_MnR_Display_Tiering_level_for_a_Provider";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			//pgRally.ZipcodeTextIsDisplayed();
			//pgRally.EnterTextZipCode("32806");
			pgRally.changeZip_PageRallyScreen("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			//pgmr.clickOnMandRContinueButton();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgmr.verificationOfTier2Display();
			pgmr.verificationOfTier1Display();
		} finally {
			this.drver.quit();
		}
	}
	
	  @Test(enabled = true,priority=8)
	    public void TESTCASE081_MnR_Filter_providers_based_on_Patient_satisfaction_reviews() throws Exception {
	        try {
	            this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	            testcasename = "TESTCASE081_MnR_Filter_providers_based_on_Patient_satisfaction_reviews";
	            Reporter.log("Execution on Device:" + this.Browsername);
	            pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	            lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
	            pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
	            pgRally.ZipcodeTextIsDisplayed();
	            pgRally.EnterTextZipCode("32806");
	            pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
	            pgmr.clickOnMandRContinueButton();
				pgRally.clickonPeopleIcon();
				pgRally.clickonPrimaryCareIcon();
				pgRally.clickonPCPIcon();
				pageCustomerRatings pagecr=new pageCustomerRatings(this.drver, this.testcasename, this.Browsername);
				pagecr.clickOnPatientReviewTab();
				pagecr.clickOn5starRating();
				pagecr.verifyReviewsdisplayedInSearchResultsPage();

	        } finally {
	            this.drver.quit();
	        }
	    }
	
	@Test(enabled = true,priority=2)
	public void TESTCASE061_MnR_Help_page_Footer() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE061_MnR_Help_page_Footer";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgmr.clickOnCommonQuestionsLink();
			pgmr.verifyListofQuestionsisdisplayedAfterClickingOnCommonQuestions();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true,priority=6)
	public void TESTCASE0123_MnR_version_of_cost_transparency_TndC() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0123_MnR_version_of_cost_transparency_TndC";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgmr.costtransparencyTndCTextVerification("Plans are insured through UnitedHealthcare Insurance Company or one of its affiliated companies, a Medicare Advantage organization with a Medicare contract");
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true,priority=12)
	public void TESTCASE081_MnR_Modal_window_for_Out_patient_surgery() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE081_MnR_Modal_window_for_Out_patient_surgery";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			//pgRally.ZipcodeTextIsDisplayed();
			//pgRally.EnterTextZipCode("32806");
			pgRally.changeZip_PageRallyScreen("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			//pgmr.clickOnMandRContinueButton();
			pgRally.EnterTextintoSearchTextbox("Surgical centers");
			pgRally.clickOnSearchButton();
			pgRally.clickOnFirstResult();
			pgmr.SelectType1("Type 1");
			//pgmr.clickOnType1();
			pgmr.ExplanationOfTypeTextValiadtion();

		} finally {
			this.drver.quit();
		}
	}
	
	 @Test(enabled = true,priority=7)
		public void TESTCASE081_MnR_Placement_of_Type1and2_under_Preferred_Provider_Label() throws Exception {
			try {
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				testcasename = "TESTCASE081_MnR_Placement_of_Type1and2_under_Preferred_Provider_Label";
				Reporter.log("Execution on Device:" + this.Browsername);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
				pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
				//pgRally.ZipcodeTextIsDisplayed();
				//pgRally.EnterTextZipCode("32806");
				pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
				//pgmr.clickOnMandRContinueButton();
				
				pgRally.changeZip_PageRallyScreen("32806");
				pgRally.clickonPeopleIcon();
				pgRally.clickonPrimaryCareIcon();
				pgRally.clickonPCPIcon();
				pgRally.clickOnFirstResult();
				pgRally.clickonAllLocationsTab();
				pgmr.verificationOfTier1orTier2InProviderDetailsPage();

			} finally {
				this.drver.quit();
			}
		}
	
	@Test(enabled = true,priority=5)
	public void TESTCASE0123_MnR_Supress_UHPD_label_icon() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0123_MnR_Supress_UHPD_label_icon";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2R_URL_DeepLink2);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			pgRally.EnterTextZipCode("32806");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgmr.supressUPHDLabel();
		} finally {
			this.drver.quit();
		}
	}
	
	*//***********************************************************************
	 * 08. Consumer Ratings By Devendra
	 * 
	 * @throws Exception
	***********************************************************************//*

	@Test(enabled = true)
	public void TESTCASE151_TC04_Display_Consumer_rating_When_provider_has_a_profile_match_nd_ratings_on_Healthgradescom() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE151_TC04_Display_Consumer_rating_When_provider_has_a_profile_match_nd_ratings_on_Healthgradescom";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("77590");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageCustomerRatings pagecr=new pageCustomerRatings(this.drver, this.testcasename, this.Browsername);
			pagecr.clickOnPatientReviewTab();
			pagecr.clickOn5starRating();
			pgRally.clickOnFirstResult();
			String provider=pagecr.getNameOfProvider();
			pagecr.clickOnLearnMoreLink();
			pagecr.clickOnHealthGrade();
			HealthGrades pagehg=new HealthGrades(pgHome.switchtorallyscreen(), this.testcasename, this.Browsername);
			pagehg.HealthGradeNearByisDisplayed();
			Thread.sleep(5000);
			pagehg.clickOnChangeLocationInHelathGradePage();
			Thread.sleep(5000);
			pagehg.clickOnChangeLocationInHelathGradePage();
			Thread.sleep(3000);
			pagehg.clickOnChangeLocationCloseIconInHelathGradePage();
			Thread.sleep(5000);
			pagehg.EnterZipCodeInNewLocationBox("77590"); 
			Thread.sleep(5000);
			pagehg.clickOnFirstItemfromAutoListInHealthGradePage();
			pagehg.EnterProviderNameinHelathGradeTextBox(provider);
			pagehg.clickOnSearchButtonInHelathGradePage();
			Thread.sleep(5000);
			pagehg.verifyProviderIsPresentIntheHealthGradePage(provider);
					
		} finally {
			this.drver.quit();
		}
	}
	
	//needs to be run in jenkins
		@Test(enabled = true)
		public void TESTCASE151_TC06_guest_user_canbe_able_to_submit_survey() throws Exception {
			try {
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				testcasename = "TESTCASE151_TC06_guest_user_canbe_able_to_submit_survey";
				Reporter.log("Execution on Device:" + this.Browsername);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.GuestLaunch(AppConst.Sys2_URL);
				lp.clickonFind_Physician_LabarotryLink();
				pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				gs.clickonAll_UnitedHealthCare_plan();
				gs.SelectUHCPlan("Core Essential");
				gs.clickonCurrentProvidersLink();
				pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
				pgRally.ZipcodeTextIsDisplayed();
				gs.EnterTextZipCode("75224");
				gs.clickonContinue_Button();
				pgRally.clickonPeopleIcon();
				pgRally.clickonPrimaryCareIcon();
				pgRally.clickonPCPIcon();
				pageCustomerRatings pagecr=new pageCustomerRatings(this.drver, this.testcasename, this.Browsername);
				Thread.sleep(5000);
				pagecr.clickOnPatientReviewTab();
				Thread.sleep(5000);
				pagecr.clickOn5starRating();
				Thread.sleep(5000);
				pagecr.verifyReviewsdisplayedInSearchResultsPage();
			} finally {
				this.drver.quit();
			}
		}
		
	
		//need to look
		@Test(enabled = true)
		public void TESTCASE151_TC06_Display_of_Highest_Patient_Rating_in_sort_drop_down() throws Exception {
			try {
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				testcasename = "TESTCASE151_TC06_Display_of_Highest_Patient_Rating_in_sort_drop_down";
				Reporter.log("Execution on Device:" + this.Browsername);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("75224");
				pgRally.clickonPeopleIcon();
				pgRally.clickonPrimaryCareIcon();
				pgRally.clickonPCPIcon();
				pageCustomerRatings pagecr=new pageCustomerRatings(this.drver, this.testcasename, this.Browsername);
				pagecr.selectDistanceDropdownas1Mile();
				pagecr.selectHighestPatientRatingfromDropdown();
				Thread.sleep(6000);
				pagecr.verifySearchResultsaredisplayedasPerHighestRating();
		} finally {
				this.drver.quit();
			}
		}
	
	@Test(enabled = true)
	public void TESTCASE151_TC06_Display_of_Highest_Patient_Rating_in_sort() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE151_TC06_Display_of_Highest_Patient_Rating_in_sort";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("75224");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageCustomerRatings pagecr=new pageCustomerRatings(this.drver, this.testcasename, this.Browsername);
			pagecr.clickOnPatientReviewTab();
			pagecr.clickOn5starRating();
			Thread.sleep(6000);
			pagecr.VerificationOf5starRatingResults();
	} finally {
			this.drver.quit();
		}
	}
	

	@Test(enabled = true)
	public void TESTCASE151_TC10_Allow_user_to_submit_a_survey() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE151_TC10_Allow_user_to_submit_a_survey";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("77590");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageCustomerRatings pagecr=new pageCustomerRatings(this.drver, this.testcasename, this.Browsername);
			pagecr.clickOnPatientReviewTab();
			pagecr.clickOn5starRating();
			pgRally.clickOnFirstResult();
			pagecr.clickOnPatientReviewsInProviderPage();
			pagecr.clickOnTakeSurveyButton();
			pagecr.HowwasyourexperienceIsDisplayed();
			pagecr.clickOn5starOfFirstQuestion();
			
	} finally {
			this.drver.quit();
		}
	}
	
	
	   @Test(enabled = true, priority = 01)
	   public void TC02_Display_PatientReviewTab_ProviderDetailsPage() throws Exception {
	          try 
	          {
	                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                 testcasename = "TC03_Display_PatientReviewTab_ProviderDetailsPage";
	                 Reporter.log("Execution on Device:" + this.Browsername);
	                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                 lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
	                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                 pgHome.Rallyclosealertpopup();
	                 pgHome.click_on_physician_and_facilitieslink();
	                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
	                 pagePhyscnFaclts.clickonfindproviderbutton();
	                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                 pgRally.SearchbuttonIsDisplayed();
	                 pgRally.changeZip_PageRallyScreen("77590");
	                 pgRally.clickonPeopleIcon();
	                 pgRally.clickonPrimaryCareIcon();
	                 pgRally.clickonPCPIcon();
	                 pageCustomerRatings cust = new pageCustomerRatings(this.drver,this.testcasename,this.Browsername);
	                 cust.Display_PatientReviewTab_ProviderDetailsPage("PATIENT REVIEWS");
	          }
	          finally
	          {
	                 this.drver.quit();
	          }
	   }
	   
	   @Test(enabled = true, priority = 02)
	   public void TC03_Display_CosumerRatings_forAllianceMarkets_Medica() throws Exception {
	          try 
	          {
	                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                 testcasename = "TC10_CosumerRatings_forAllianceMarkets_Medica";
	                 Reporter.log("Execution on Device:" + this.Browsername);
	                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                 lp.Login(AppConst.Sys2_URL, AppConst.Medica_Sys5_User, AppConst.Password);
	                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                 pgHome.Rallyclosealertpopup();
	                 pageCustomerRatings cust = new pageCustomerRatings(this.drver,this.testcasename,this.Browsername);
	                 cust.market_Selection_Medica();
	                 pgHome.click_on_physician_and_facilitieslink();
	                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
	                 pagePhyscnFaclts.clickonfindproviderbutton();
	                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                 pgRally.SearchbuttonIsDisplayed();
	                 pgRally.changeZip_PageRallyScreen("77590");
	                 pgRally.clickonPeopleIcon();
	                 pgRally.clickonPrimaryCareIcon();
	                 pgRally.clickonPCPIcon();
	                 cust.clickOnPatientReviewTab();
	                 cust.clickOn5starRating();
	                 cust.verify_PatientReviews_Display();                              
	          }
	          finally
	          {
	                 this.drver.quit();
	          }
	   }
	   
	   @Test(enabled = true, priority = 03)
	   public void TC08_Suppress_CosumerRatings_forAllianceMarkets_HP() throws Exception {
	          try 
	          {
	                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                 testcasename = "TC10_CosumerRatings_forAllianceMarkets_Medica";
	                 Reporter.log("Execution on Device:" + this.Browsername);
	                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                 lp.Login(AppConst.Sys2_URL, AppConst.HP_Sys5_User, AppConst.Password);
	                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                 pgHome.Rallyclosealertpopup();
	                 pageCustomerRatings cust = new pageCustomerRatings(this.drver,this.testcasename,this.Browsername);
	                 cust.market_Selection_HP();
	                 pgHome.click_on_physician_and_facilitieslink();
	                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
	                 pagePhyscnFaclts.clickonfindproviderbutton();
	                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                 pgRally.SearchbuttonIsDisplayed();
	                 pgRally.changeZip_PageRallyScreen("99505");
	                 pgRally.clickonPeopleIcon();
	                 pgRally.clickonPrimaryCareIcon();
	                 pgRally.clickonPCPIcon();
	                 cust.clickOnPatientReviewTab();
	                 cust.clickOn5starRating();
	                 cust.Empire_Supress_PatientReviews();                              
	          }
	          finally
	          {
	                 this.drver.quit();
	          }
	   }
	   
	   @Test(enabled = true, priority = 04)
	   public void TC07_Suppress_CosumerRatings_forEmpire() throws Exception {
	          try 
	          {
	                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                 testcasename = "TC04_Suppress_CosumerRatings_forEmpire";
	                 Reporter.log("Execution on Device:" + this.Browsername);
	                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                 lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
	                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                 pgHome.click_on_physician_and_facilitieslink();
	                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
	                 pagePhyscnFaclts.clickonfindproviderbutton();
	                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                 pgRally.clickonPeopleIcon();
	                 pgRally.clickonPrimaryCareIcon();
	                 pgRally.clickonPCPIcon();
	                 pageCustomerRatings cust = new pageCustomerRatings(this.drver,this.testcasename,this.Browsername);
	                 cust.Empire_Supress_PatientReviews();
	          }
	          finally
	          {
	                 this.drver.quit();
	          }
	   }
	   
	   @Test(enabled = true, priority = 05)
	   public void TC01_Display_Disclaimer_forPatientReviews() throws Exception {
	          try 
	          {
	                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                 testcasename = "TC01_Display_Disclaimer_forPatientReviews";
	                 Reporter.log("Execution on Device:" + this.Browsername);
	                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                 lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
	                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                 pgHome.Rallyclosealertpopup();
	                 pgHome.click_on_physician_and_facilitieslink();
	                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
	                 pagePhyscnFaclts.clickonfindproviderbutton();
	                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                 pgRally.SearchbuttonIsDisplayed();
	                 pgRally.changeZip_PageRallyScreen("77590");
	                 pgRally.clickonPeopleIcon();
	                 pgRally.clickonPrimaryCareIcon();
	                 pgRally.clickonPCPIcon();
	                 pageUHCWestGuest uhcguest = new pageUHCWestGuest(this.drver, this.testcasename, this.Browsername);
	                 uhcguest.clickOnFirstProvider();
	                 pageCustomerRatings cust = new pageCustomerRatings(this.drver,this.testcasename,this.Browsername);
	                 cust.verify_Display_Disclaimer_ofHealthGrades();
	          }
	          finally
	          {
	                 this.drver.quit();
	          }
	   }

	   
	

	*//***********************************************************************
	 * WA Disclaimer
	 * 
	 * @throws Exception
	 ***********************************************************************//*

	@Test(enabled = true)
	public void TESTCASE001_Common_Question_information_how_Limited_English_Proficiency_speakers_can_access_plan_information()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE001_Common_Question_information_how_Limited_English_Proficiency_speakers_can_access_plan_information";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("20049");
			pageWADisclaimer pagewa = new pageWADisclaimer(this.drver, testcasename, this.Browsername);
			pagewa.clickOnCommonQuestions();
			pagewa.languageQuestionIsDisplayed();
			pagewa.verificationOfLanguagesDisplayed();
			pagewa.clickOnAnyLanguage();
			pgHome.switchtorallyscreen();
			pagewa.multiLanguageInterpreterServicesIsDisplayed();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE002_CommonQuestion_Information_on_the_referral_prior_authorization_Practice()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE002_CommonQuestion_Information_on_the_referral_prior_authorization_Practice";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("20049");
			pageWADisclaimer pagewa = new pageWADisclaimer(this.drver, testcasename, this.Browsername);
			pagewa.clickOnCommonQuestions();
			pagewa.verificationOfreferralpriorauthorizationpracticesQuestionisDisplayed();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE003_WADisclaimer_Not_applicable_EmpirePlan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE003_WADisclaimer_Not_applicable_EmpirePlan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.walmart();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("20049");
			pageWADisclaimer pagewa = new pageWADisclaimer(this.drver, testcasename, this.Browsername);
			pagewa.clickOnCommonQuestions();
			pagewa.questionsarenotdisplayedforEmpireUser();

		} finally {
			this.drver.quit();
		}
	}

	*//***********************************************************************
	 * End of WA Disclaimer Test Cases
	 ***********************************************************************//*

	// 50 test cases
		*//***********************************************************************
		 * DVCN Test cases - Starting
		 * 
		 * @throws Exception
		 ***********************************************************************//*
		
		//needs to run in jenkins
		@Test(enabled = true)
		public void TESTCASE110_TC01_Virtual_Visits_CareByCondition_Search() throws Exception {
			try {
				testcasename = "TESTCASE110_TESTCASE_02_Virtual_Visits_CareByCondition_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.changeZip_PageRallyScreen("32024");
				pgRally.clickOnCarebyConditionIcon();
				pgRally.clickonAllergiesLink();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.clickOnAllergies_VirtualvisitsLink();
				
				pgdc.verificationofAmwellLink();
				pgdc.verificationOfdoctorOnDemandLink();
								
				pgdc.clickOnDoctoronDemandLink();
				pgHome.switchtorallyscreen();
				pgdc.verificationDoctorOnDemand_URL("www.doctorondemand.com");
				pgdc.SwitchToPrviousScreen();
				
				//pgdc.SelectAmWellLink("Amwell");
			
				pgdc.clickOnAmwellLink();
				pgHome.switchtorallyscreen();				
				pgdc.verificationOfAmwell_URL("amwell.com");

			} finally {
				this.drver.quit();
			}
		}

		//need to run in jenkins 
		@Test(enabled = true)
		public void TESTCASE111_TC02_Virtual_Visits_People_Search() throws Exception {
			try {
				testcasename = "TESTCASE111_TC02_Virtual_Visits_People_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				Thread.sleep(7000);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				//pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("32024");
				
				pgRally.clickOnChangeLocation();
				Thread.sleep(5000);
				pgRally.EnterTextZipCode("32024");
				pgRally.clickonUpdateLocation();

				pgRally.verifyPepoleIcon();
				pgRally.clickonPeopleIcon();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				//pgdc.verificationOfVirtualvisitsLink();
				pgdc.clickOnVirtualvisitsLink();
				// pgdc.verificationofAmwellLink();
				//pgdc.verificationOfdoctorOnDemandLink();
				pgdc.clickOnDoctoronDemandLink();
				pgHome.switchtorallyscreen();
				pgdc.verificationDoctorOnDemand_URL("www.doctorondemand.com");
				pgdc.SwitchToPrviousScreen();
				Thread.sleep(5000);
				//pgdc.SelectAmWellLink("Amwell");
				pgdc.clickOnAmwellLink();
				Thread.sleep(6000);
				//pgdc.clickOnAmwellLink();
				pgHome.switchtorallyscreen();
				pgdc.verificationOfAmwell_URL("amwell.com");
			} finally {
				this.drver.quit();
			}
		}

		//need to run in jenkins 
		@Test(enabled = true)
		public void TESTCASE112_TC03_Virtual_Visits_Services_Treatments_Search() throws Exception {
			try {
				testcasename = "TESTCASE112_TC03_Virtual_Visits_Services_Treatments_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				Thread.sleep(7000);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("32024");
				Thread.sleep(5000);
				pgRally.clickOnServicesAndTreatments();
				pgRally.clickOnOfficeVisitIcon();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.clickOnVirtualvisitsLink();
				pgdc.clickOnDoctoronDemandLink();
				pgHome.switchtorallyscreen();
				Thread.sleep(5000);
				pgdc.verificationDoctorOnDemand_URL("www.doctorondemand.com");
				Thread.sleep(5000);
				pgdc.SwitchToPrviousScreen();
				pgdc.clickOnAmwellLink();
				//pgdc.SelectAmWellLink("Amwell");
				pgHome.switchtorallyscreen();
				pgdc.verificationOfAmwell_URL("amwell.com");

			} finally {
				this.drver.quit();
			}
		}

		//need to run in jenkins 
		@Test(enabled = true)
		public void TESTCASE113_TC04_Virtual_Visits_Places_Search() throws Exception {
			try {
				testcasename = "TESTCASE113_TC04_Virtual_Visits_Places_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				Thread.sleep(7000);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("32024");
				pgRally.verifyPlacesIcon();
				pgRally.clickOnPlacesLink();
				pgRally.clickOnPlaces_ClinicsButton();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				System.out.println("we are at VirtualvisitsLink icon ");
			
				pgdc.clickOnVirtualvisitsLink();
				pgdc.clickOnDoctoronDemandLink();
				pgHome.switchtorallyscreen();
				pgdc.verificationDoctorOnDemand_URL("www.doctorondemand.com");
				pgdc.SwitchToPrviousScreen();
				pgdc.clickOnAmwellLink();
				pgHome.switchtorallyscreen();
				pgdc.verificationOfAmwell_URL("amwell.com");

			} finally {
				this.drver.quit();
			}
		}
		
		//need to change Javascript
		
		//need to run in jenkins
		// DVCN Test case-Swathi
		@Test(enabled = true)
		public void TESTCASE113_TC05_Supress_Virtual_Visits_Places_Search() throws Exception {
			try {
				testcasename = "TESTCASE113_TESTCASE_05_Supress_Virtual_Visits_Places_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				Thread.sleep(7000);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("99504");
				
				pgRally.clickOnChangeLocation();
				Thread.sleep(5000);
				pgRally.EnterTextZipCode("99504");
				pgRally.clickonUpdateLocation();
				
				
				
				
				Thread.sleep(2000);
				pgRally.verifyPlacesIcon();
				pgRally.clickOnPlacesLink();
				pgRally.clickOnPlaces_ClinicsButton();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.verifySupressedVirtualVisitsforAK_AR();

			} finally {
				this.drver.quit();
			}
		}

		//Need to be run in jenkins
		@Test(enabled = true)
		public void TC06_Supress_Virtual_Visits_People_Search_AK_AR() throws Exception {
			try {
				testcasename = "TESTCASE_06_Supress_Virtual_Visits_People_Search_AK_AR";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("71611");
				
				
				// pgRally.clickOnChangeLocationLink();
				pgRally.clickOnChangeLocation();
				Thread.sleep(5000);
				pgRally.EnterTextZipCode("71611");
				pgRally.clickonUpdateLocation();
				
				
				Thread.sleep(3000);
				pgRally.VerificationOfPeopleicon();
				pgRally.clickonPeopleIcon();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.verifySupressedVirtualVisitsforAK_AR();

			} finally {
				this.drver.quit();
			}
		}

		
		
		//needs to be run in jenkins
		
		// DVCN test case -Swathi
		@Test(enabled = true)
		public void TC07_Supress_Virtual_Visits_CareByCondition_Search() throws Exception {
			try {
				testcasename = "TESTCASE_07_Supress_Virtual_Visits_CareByCondition_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("99504");
				
				// pgRally.clickOnChangeLocationLink();
				pgRally.clickOnChangeLocation();
				Thread.sleep(5000);
				pgRally.EnterTextZipCode("99504");
				pgRally.clickonUpdateLocation();
				
				Thread.sleep(2000);
				pgRally.verifyCarebyConditionIcon();
				pgRally.clickOnCarebyConditionIcon();
				pgRally.clickonAllergiesLink();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.verifySupressedVirtualVisitsforAK_AR();

			} finally {
				this.drver.quit();
			}
		}

		//needs to be run jenkins
		// DVCN test case -Swathi
		@Test(enabled = true)
		public void TC08_Supress_Virtual_Visits_Services_Treatments_Search() throws Exception {
			try {
				testcasename = "TESTCASE_08_Supress_Virtual_Visits_Services&Treatments_Search";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("99504");
				
				pgRally.clickOnChangeLocationLink();
				Thread.sleep(5000);
				pgRally.EnterTextZipCode("99504");
				pgRally.clickonUpdateLocation();
				
				
				Thread.sleep(2000);
				pgRally.verifyServicesandTreatmentsIcon();
				pgRally.clickOnServicesAndTreatments();
				pgRally.clickOnOfficeVisitIcon();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.verifySupressedVirtualVisitsforAK_AR();

			} finally {
				this.drver.quit();
			}
		}
		
		//need to run jenkins

		// DVCN Test case -Swathi
		@Test(enabled = true)
		public void TESTCASE114_TC09_Supress_Amwell_CareByCondition_Search_TX() throws Exception {
			try {
				testcasename = "TESTCASE114_TC_09_Supress_Amwell_CareByCondition_Search_TX";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("75056");
				
				// pgRally.clickOnChangeLocationLink();
				pgRally.clickOnChangeLocation();
				Thread.sleep(5000);
				pgRally.EnterTextZipCode("75056");
				pgRally.clickonUpdateLocation();
				
				
				Thread.sleep(2000);
				pgRally.verifyCarebyConditionIcon();
				pgRally.clickOnCarebyConditionIcon();
				pgRally.clickonAllergiesLink();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				// pgdc.verificationOfVirtualvisitsLink();
				pgdc.clickOnAllergies_VirtualvisitsLink();
				//pgdc.verificationOfdoctorOnDemandLink(); needs to be updated once defect id #3486 is fixed 
				// pgdc.verificationofAmwellLink();
				
				//needs to be uncommeneted once defect id #3486 is fixed
				pgdc.clickOnDoctoronDemandLink();
				pgHome.switchtorallyscreen();
				Thread.sleep(4000);
				pgdc.SwitchToPrviousScreen();
				pgdc.SuppressAmwellforTX();

			} finally {
				this.drver.quit();
			}
		}
		
		//need to run in jenkins - Bug is present raised in QC - Defect ID - 6745
		// DVCN Test case -Swathi
		@Test(enabled = true)
		public void TESTCASE115_TC10_Supress_DoctorOnDemand_CareByCondition_Search_LA() throws Exception {
			try {
				testcasename = "TESTCASE115_TESTCASE_10_Supress_DoctorOnDemand_CareByCondition_Search_LA";
				Reporter.log("Execution on Device:" + this.Browsername);
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("90008");
				
				pgRally.clickOnChangeLocationLink();

				Thread.sleep(5000);
				pgRally.EnterTextZipCode("90008");
				pgRally.clickonUpdateLocation();
				
				
				
				Thread.sleep(2000);
				pgRally.verifyCarebyConditionIcon();
				pgRally.DVCN_clickonCarebyCondition();
				pgRally.clickonAllergiesLink();
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);

				pgdc.clickOnAllergies_VirtualvisitsLink();

				pgdc.verificationofAmwellLink();
				pgdc.clickOnAmwellLink();
				pgHome.switchtorallyscreen();
				Thread.sleep(4000);
				pgdc.SwitchToPrviousScreen();
				pgdc.SuppressDoctorOnDemandforLA();

			} finally {
				this.drver.quit();
			}
		}
	
		//need to look into it
		
		//needs to run in jenkins
		@Test(enabled = true)
		public void TESTCASE_TC11_VirtualVisits_TextSearchKeywordCondition()
				throws Exception {
			try {
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				testcasename = "ESTCASE_TC11_VirtualVisits_TextSearchKeywordCondition";
				Reporter.log("Execution on Device:" + this.Browsername);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("77590");
				
				//pgRally.validatePlaceholderMsgOnSearchtextbox();
				pgRally.EnterTextintoSearchTextbox("Flu");
				Thread.sleep(4000);
				pgRally.clickOnSearchButton();
				Thread.sleep(4000);
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.clickOnArrowButtonforPageNavigation();
				pgRally.verifySearchResultsforGivenInputText("VirtualVisits");
				pgdc.clickOnAllergies_VirtualvisitsLink();
				pgdc.verificationOfdoctorOnDemandLink();
			//	pgdc.verificationofAmwellLink();
				pgdc.clickOnDoctoronDemandLink();
				pgHome.switchtorallyscreen();
				Thread.sleep(6000);
				pgdc.SwitchToPrviousScreen();
				pgdc.SuppressAmwellforTX();
			} finally {
				this.drver.quit();
			}
		}
		
		//needs to be run in jenkins
		@Test(enabled = true)
		public void TESTCASE_TC12_Suppress_VirtualVisits_TextSearch_AK_AR()
				throws Exception {
			try {
				this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
				testcasename = "TESTCASE_TC12_Suppress_VirtualVisits_TextSearch_AK_AR";
				Reporter.log("Execution on Device:" + this.Browsername);
				pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
				lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
				pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
				pgHome.Rallyclosealertpopup();
				pgHome.click_on_physician_and_facilitieslink();
				pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
						this.Browsername);
				pagePhyscnFaclts.clickonfindproviderbutton();
				pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
				pgRally.click_OnEnglish_Link();
				pgRally.SearchbuttonIsDisplayed();
				pgRally.changeZip_PageRallyScreen("99501");
				
	            pgRally.clickOnChangeLocationLink();
		        Thread.sleep(5000);
				pgRally.EnterTextZipCode("99501");
				pgRally.clickonUpdateLocation();
				
				pgRally.EnterTextintoSearchTextbox("Flu");
				Thread.sleep(3000);
				pgRally.clickOnSearchButton();
				Thread.sleep(3000);
				pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
				pgdc.clickOnArrowButtonforPageNavigation();
				pgdc.verifySupressedVirtualVisitsforAK_AR();
				
				
			} finally {
				this.drver.quit();
			}
		}
				@Test(enabled = true)
				public void TESTCASE_TC13_Supress_Virtual_Visits_for_guest()
						throws Exception {
					try {
						this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
						testcasename = "TESTCASE_TC13_Supress_Virtual_Visits_for_guest";
						Reporter.log("Execution on Device:" + this.Browsername);
						pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
						pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
						lp.GuestLaunch(AppConst.Sys2_URL);
						lp.clickonFind_Physician_LabarotryLink();
						pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
						gs.clickonAll_UnitedHealthCare_plan();
						gs.SelectUHCPlan("Core Essential");
						//gs.clickonPlan_Core_Essentials();
						pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
						pgRally.ZipcodeTextIsDisplayed();
						gs.EnterTextZipCode("99501");
						gs.clickonContinue_Button();
						pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
						pgdc.verifyVirtualvisitsIconisSupressedInPepoleICon();
						pgdc.verifyVirtualvisitsIconisSupressedInPlacesICon();
						pgdc.verifyVirtualvisitsIconisSupressedInSpecalityCentersICon();
						
					} finally {
						this.drver.quit();
					}
				}
				
				@Test(enabled = true)
				public void TESTCASE110_Virtual_visit_provider_groups_Display_speciifc_information() throws Exception {
					try {
						testcasename = "TESTCASE110_Virtual_visit_provider_groups_Display_speciifc_information";
						Reporter.log("Execution on Device:" + this.Browsername);
						this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
						pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
						lp.Login(AppConst.Sys2_URL, AppConst.DVCN_Sys5_UserName, AppConst.Password);
						pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
						pgHome.Rallyclosealertpopup();
						pgHome.click_on_physician_and_facilitieslink();
						pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
								this.Browsername);
						pagePhyscnFaclts.clickonfindproviderbutton();
						pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
						pgRally.click_OnEnglish_Link();
						pgRally.changeZip_PageRallyScreen("32024");
						pgRally.clickOnCarebyConditionIcon();
						pgRally.clickonAllergiesLink();
						pageDVCN pgdc = new pageDVCN(this.drver, testcasename, this.Browsername);
						pgdc.clickOnAllergies_VirtualvisitsLink();
						pgdc.verifyGroupsDisplayspeciifcinformationforDoctorOnDemond("Average Visit Length", "Physicians that Meet Premium Quality Criteria*", "Estimated Cost", "Estimated Out-of-Pocket Cost");
						pgdc.verifyGroupsDisplayspeciifcinformationforAmWell("Average Visit Length", "Physicians that Meet Premium Quality Criteria*", "Estimated Cost", "Estimated Out-of-Pocket Cost");
						pgdc.verifyAVLandPQCAttributesinVirtualVisitsPage();
						pgdc.verifyEstimatedCostAttributeisdisplayed();
						pgdc.verifyEstimatedOutofPocketCostAttributeisdisplayed();
					
						
						
						pgdc.verificationofAmwellLink();
						pgdc.verificationOfdoctorOnDemandLink();
										
						pgdc.clickOnDoctoronDemandLink();
						pgHome.switchtorallyscreen();
						pgdc.verificationDoctorOnDemand_URL("www.doctorondemand.com");
						pgdc.SwitchToPrviousScreen();
						
						//pgdc.SelectAmWellLink("Amwell");
					
						pgdc.clickOnAmwellLink();
						pgHome.switchtorallyscreen();				
						pgdc.verificationOfAmwell_URL("amwell.com");

					} finally {
						this.drver.quit();
					}
				}	
		
		
		*//***************************************************************************************
		 * End of DVCN Test Cases
		 ***************************************************************************************//*


	*//***************************************************************************************
	 * Start of Well Med
	 ***************************************************************************************//*
	  @Test(enabled = true)
	     public void TESTCASE_TC_01_WellMed_DefaultSort_PreferredProvider_ProviderResults() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TESTCASE_TC_01_WellMed_DefaultSort_PreferredProvider_ProviderResults";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                   pgRally.clickOnChangeLocationLink();
	       	           Thread.sleep(5000);
	       			   pgRally.EnterTextZipCode("73301");
	       			   pgRally.clickonUpdateLocation();
	                   pgRally.clickonPeopleIcon();
	                   pgRally.clickonPrimaryCareIcon();
	                   pgRally.clickonPCPIcon();
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   Thread.sleep(5000);
	                   pgWellMed.WellMed_DefaultSort_PreferredProvider("WellMed Affiliated Providers");
	            }
	            finally
	            {
	                   this.drver.quit();
	            }
	     }
	  
	  @Test(enabled = true)
	     public void TESTCASE_TC_02_WellMed_VerificationOfText_Icon_ProviderResults() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TC_02_WellMed_VerificationOfText_Icon_ProviderResults";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                   pgRally.clickOnChangeLocationLink();
	       	           Thread.sleep(5000);
	       			   pgRally.EnterTextZipCode("73301");
	       			   pgRally.clickonUpdateLocation();
	                   pgRally.clickonPeopleIcon();
	                   pgRally.clickonPrimaryCareIcon();
	                   pgRally.clickonPCPIcon();
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   Thread.sleep(5000);
	                   pgWellMed.validationOfWellMed_ProviderText("WellMed Affiliated Providers");
	                   pgWellMed.verificationOfWellMed_ProviderIcon();
	            }
	            finally
	            {
	                   this.drver.quit();
	            }
	     }
	  
	  @Test(enabled = true)
	     public void TESTCASE_TC_03_WellMed_PreferedProvider_Filter() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TC_03_WellMed_VerificationOfText_Icon_ProviderDetailPage";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                   pgRally.clickOnChangeLocationLink();
	       	           Thread.sleep(5000);
	       			   pgRally.EnterTextZipCode("73301");
	       			   pgRally.clickonUpdateLocation();
	                   pgRally.clickonPeopleIcon();
	                   pgRally.clickonPrimaryCareIcon();
	                   pgRally.clickonPCPIcon();
	                   Thread.sleep(3000);
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   pgWellMed.clickOnPreferedProvider_Filter();
	                   pgWellMed.validationOfWellMedProvider_Filter("WellMed Affiliated Providers");
	                   
	                 }
	            finally
	            {
	                   this.drver.quit();
	            }
	  }
	  
	  @Test(enabled = true)
	     public void TESTCASE_TC_04_WellMed_PreferedProvider_Text_Icon_ProviderDetailPage() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TC_04_WellMed_PreferedProvider_ProviderDetailPage";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                   pgRally.clickOnChangeLocationLink();
	       	           Thread.sleep(5000);
	       			   pgRally.EnterTextZipCode("73301");
	       			   pgRally.clickonUpdateLocation();
	                   pgRally.clickonPeopleIcon();
	                   pgRally.clickonPrimaryCareIcon();
	                   pgRally.clickonPCPIcon();
	                   Thread.sleep(3000);
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   Thread.sleep(5000);
	                   pgWellMed.clickOnFirstProviderFromResultsPage();
	                   pgWellMed.clickOnAllLocationsTab();
	                   System.out.println("We are at Results page");
	                   pgWellMed.validationOfWellMed_ProviderText("WellMed Affiliated Providers");
	                   System.out.println("refered provider text is validated");
	                   pgWellMed.verificationOfWellMed_ProviderIcon();
	            }
	            finally
	            {
	                   this.drver.quit();
	            }
	  }
	  
	  
	  @Test(enabled = true)
	     public void TESTCASE_TC_05_WellMed_PreferedProvider_ProviderDetailPage_AllLocationsTab() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TC_05_WellMed_PreferedProvider_ProviderDetailPage_AllLocationsTab";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	                   pgRally.clickOnChangeLocationLink();
	       	           Thread.sleep(5000);
	       			   pgRally.EnterTextZipCode("73301");
	       			   pgRally.clickonUpdateLocation();
	                   pgRally.clickonPeopleIcon();
	                   pgRally.clickonPrimaryCareIcon();
	                   pgRally.clickonPCPIcon();
	                   Thread.sleep(3000);
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   Thread.sleep(5000);
	                   pgWellMed.clickOnFirstProviderFromResultsPage();
	                   pgWellMed.clickOnAllLocationsTab();
	                   pgWellMed.validationOfWellMed_ProviderText("WellMed Affiliated Providers");
	                   System.out.println("Prefered provider text is validated");
	                   pgWellMed.verificationOfWellMed_ProviderIcon();
	            }
	            finally
	            {
	                   this.drver.quit();
	            }
	  }
	  
	  @Test(enabled = true)
	     public void TESTCASE_TC_06_WellMed_PreferedProvider_Suppress_DefaultSort_Tier1Hospitals() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TC_06_WellMed_PreferedProvider_Suppress_DefaultSort_Tier1Hospitals";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	       			   pgRally.changeZip_PageRallyScreen("73301");
	       			   
	                   pgRally.clickOnChangeLocationLink();
	       	           Thread.sleep(5000);
	       			   pgRally.EnterTextZipCode("73301");
	       			   pgRally.clickonUpdateLocation();
	       			   
	                   pgRally.clickOnPlacesLink();
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   Thread.sleep(5000);
	                   pgWellMed.clickOnPlaces_Hospitals();
	                   pgWellMed.verifySupressedTier1Hospitals();
	            }
	            finally
	            {
	                   this.drver.quit();
	            }
	  }
	  
	  @Test(enabled = true)
	     public void TESTCASE_TC_07_WellMed_Suppress_Tier2Designation() throws Exception {
	            try 
	            {
	                   this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
	                   testcasename = "TESTCASE_TC_07_WellMed_Suppress_Tier2Designation";
	                   Reporter.log("Execution on Device:" + this.Browsername);
	                   pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
	                   lp.Login(AppConst.Sys2_URL, AppConst.WellMed_Sys5_UserName, AppConst.Password);
	                   pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
	                   pgHome.Rallyclosealertpopup();
	                   pgHome.click_on_physician_and_facilitieslink();
	       			   pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
	       					this.Browsername);
	       			   pagePhyscnFaclts.clickonfindproviderbutton();
	       			   pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
	       			   pgRally.changeZip_PageRallyScreen("73301");
	       			   pgRally.clickOnPlacesLink();
	                   pageWellMed pgWellMed = new pageWellMed(this.drver, this.testcasename, this.Browsername);
	                   Thread.sleep(5000);
	                   pgWellMed.clickOnPlaces_Hospitals();
	                   pgWellMed.verifySupressedTier2Hospitals();
	            }
	            finally
	            {
	                   this.drver.quit();
	            }
	  }  
	  
	  *//***************************************************************************************
		 * End of WellMedd
		 ***************************************************************************************//*

	*//***************************************************************************************
     *                                                                         Centura
     ***************************************************************************************//*
   @Test(enabled = true, priority = 100)
   public void TC_01Centura_CustomContent_WhenNoProviderResults() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "TC_01Centura_CustomContent_when_no_ProviderResults";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Centura_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.Rallyclosealertpopup();
                 pgHome.prerquisite_to_navigate_to_rallyconnect();
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pgRally.changeZip_PageRallyScreen("86021");
                 pgRally.clickonPeopleIcon();
                 pgRally.clickonPrimaryCareIcon();
                 pgRally.clickonPCPIcon();
                 pageCentura cent = new pageCentura(this.drver, this.testcasename, this.Browsername);
                 cent.ContentForNoProviderResults("This search tool will only return results for Colorado network providers. Utilization of network providers outside of Colorado is limited to members who reside outside of Colorado and those who have prior authorization from UnitedHealthcare. If you wish to search for providers outside of Colorado, please search the.");
          }
          finally 
          {
                 this.drver.quit();
          }
   }
   
   
   //corrected
   @Test(enabled = true, priority = 101)
   public void TC_02Centura_DefaultSort_PreferredProvider() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "TC_02Centura_DefaultSort_PreferredProvider";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Centura_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.Rallyclosealertpopup();
                 pgHome.prerquisite_to_navigate_to_rallyconnect();
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pgRally.changeZip_PageRallyScreen("80120");
                 pgRally.clickonPeopleIcon();
                 pgRally.clickonPrimaryCareIcon();
                 pgRally.clickonPCPIcon();
                 pageCentura cent = new pageCentura(this.drver, this.testcasename, this.Browsername);
                 Thread.sleep(5000);
                 cent.Centura_DefaultSort_PreferredProvider("CENTURA PREFERRED PROVIDERS");
          }
          finally
          {
                 this.drver.quit();
          }
   }
   
          @Test(enabled =true, priority = 102)
          public void TC_03Centura_PreferredProvider_Filter() throws Exception {
                 try 
                 {
                       this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                       testcasename = "TC_03Centura_PreferredProvider_Filter";
                       Reporter.log("Execution on Device:" + this.Browsername);
                       pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                       lp.Login(AppConst.Sys2_URL, AppConst.Centura_UserName, AppConst.Password);
                       pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                       pgHome.Rallyclosealertpopup();
                       pgHome.prerquisite_to_navigate_to_rallyconnect();
                       pgHome.click_on_physician_and_facilitieslink();
                       pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                       pagePhyscnFaclts.clickonfindproviderbutton();
                       pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                       pgRally.changeZip_PageRallyScreen("80120");
                       pgRally.clickonPeopleIcon();
                       pgRally.clickonPrimaryCareIcon();
                       pgRally.clickonPCPIcon();
                       pageCentura cent = new pageCentura(this.drver, this.testcasename, this.Browsername);
                       cent.Centura_PreferredProvider_Filter("Centura Preferred Providers");
                 } 
                 finally
                 {
                       this.drver.quit();
                 }
   }

          @Test(enabled = true, priority = 103)
          public void TC_04Centura_PreferredProviderTextIcon_AdditionalLocations() throws Exception {
                 try 
                 {
                       this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                       testcasename = "TC_04Centura_PreferredProviderTextIcon_AdditionalLocations";
                       Reporter.log("Execution on Device:" + this.Browsername);
                       pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                       lp.Login(AppConst.Sys2_URL, AppConst.Centura_UserName, AppConst.Password);
                       pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                       pgHome.Rallyclosealertpopup();
                       pgHome.prerquisite_to_navigate_to_rallyconnect();
                       pgHome.click_on_physician_and_facilitieslink();
                       pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                       pagePhyscnFaclts.clickonfindproviderbutton();
                       pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                       pgRally.changeZip_PageRallyScreen("80120");
                       pgRally.clickonPeopleIcon();
                       pgRally.clickonPrimaryCareIcon();
                       pgRally.clickonPCPIcon();
                       pageCentura cent = new pageCentura(this.drver, this.testcasename, this.Browsername);
                       cent.Centura_PreferredProvider_TextICon_AdditionalLocations("Centura Preferred Providers");
                 } 
                 finally
                 {
                       this.drver.quit();
                 }
   }
          
          @Test(enabled = true, priority = 104)
          public void TC_05Centura_PreferredProvider_TextIcon_ProviderDetailsPage() throws Exception {
                 try 
                 {
                       this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                       testcasename = "TC_05Centura_PreferredProvider_TextIcon_ProviderDetailsPage";
                       Reporter.log("Execution on Device:" + this.Browsername);
                       pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                       lp.Login(AppConst.Sys2_URL, AppConst.Centura_UserName, AppConst.Password);
                       pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                       pgHome.Rallyclosealertpopup();
                       pgHome.prerquisite_to_navigate_to_rallyconnect();
                       pgHome.click_on_physician_and_facilitieslink();
                       pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                       pagePhyscnFaclts.clickonfindproviderbutton();
                       pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                       pgRally.changeZip_PageRallyScreen("80120");
                       pgRally.clickonPeopleIcon();
                       pgRally.clickonPrimaryCareIcon();
                       pgRally.clickonPCPIcon();
                       pageCentura cent = new pageCentura(this.drver, this.testcasename, this.Browsername);
                       cent.Centura_PreferredProvider_TextICon_ProviderDetailsPage("Centura Preferred Providers");
                 } 
                 finally
                 {
                       this.drver.quit();
                 }
   }



   *//***************************************************************************************
   *                                                            CARE TEAM
  ***************************************************************************************//*

   @Test(enabled = true, priority = 10)
   public void CareTeam_Display_GalleryPage() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "CareTeam_Display_GalleryPage";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.Rallyclosealertpopup();
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pgRally.SearchbuttonIsDisplayed();
                 pgRally.changeZip_PageRallyScreen("77568");
                 pgRally.clickonPeopleIcon();
                 pgRally.clickonPrimaryCareIcon();
                 pgRally.clickonPCPIcon();
                 pageCareTeam careteam = new pageCareTeam(this.drver,this.testcasename,this.Browsername);
                 
                 // Adding a Provider that has single location
                  careteam.clickOnSingleLocation();
                  careteam.savingOfProviderwithSingleLocation();
                  careteam.closeSavedProviderWindow();
                  pgRally.clickOnBackButtonToPreviousPage();
                             
                             // Adding a Provider that has multiple location
                  careteam.clickOnAdditionalLocations();
                  careteam.savingOfProviderwithAdditionalLocation();
                  careteam.closeSavedProviderWindow();
                             
          }
          finally
          {
                 this.drver.quit();
          }
   }
   
   //needs to be relook
   @Test(enabled = true, priority = 106)
   public void CareTeam_Sort_SavedProviders() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "CareTeam_Sort_SavedProviders";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.Rallyclosealertpopup();
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pgRally.SearchbuttonIsDisplayed();
                 pgRally.clickonPeopleIcon();
                 pgRally.clickonPrimaryCareIcon();
                 pgRally.clickonPCPIcon();
                 pageCareTeam careteam = new pageCareTeam(this.drver,this.testcasename,this.Browsername);
                 
                 //Multilple saved providers
                 careteam.clickOnAdditionalLocations();
                 careteam.savingOfProviderwithAdditionalLocation();
                 careteam.closeSavedProviderWindow();
                 
                 careteam.clickOnSavedProviderHeaderButton();
                 careteam.clickOnDefaultDropDown();
                 careteam.Verify_DefaultSort_forSavedProvider("DISTANCE");
          }
          finally
          {
                 this.drver.quit();
          }
   }
   
   
   @Test(enabled = true, priority = 107)
   public void CareTeam_Editing_SavedProvider() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "CareTeam_Editing_SavedProvider";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.Rallyclosealertpopup();
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pgRally.clickonPeopleIcon();
                 pgRally.clickonPrimaryCareIcon();
                 pgRally.clickonPCPIcon();
                 pageCareTeam careteam = new pageCareTeam(this.drver,this.testcasename,this.Browsername);
                 careteam.clickOnAdditionalLocations();
                 careteam.savingOfProviderwithAdditionalLocation();
                 careteam.closeSavedProviderWindow();
                 careteam.clickOnSavedProviderHeaderButton();
                 
                 // caret.Editing_SavedProvider();
                 careteam.clickOnEditButtonOfAnyProvider();
                 careteam.clickOnDeleteButtonInEditWindow();
                 careteam.closeSavedProviderWindow();
          }
          finally
          {
                 this.drver.quit();
          }
   }
   
   @Test(enabled = true, priority = 108)
   public void CareTeam_Header_SavedProvidersButton() throws Exception {
       try 
       {
              this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
              testcasename = "CareTeam_Header_SavedProvidersButton";
              Reporter.log("Execution on Device:" + this.Browsername);
              pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
              lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
              pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
              pgHome.Rallyclosealertpopup();
              pgHome.click_on_physician_and_facilitieslink();
              pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
              pagePhyscnFaclts.clickonfindproviderbutton();
              pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
              pgRally.SearchbuttonIsDisplayed();
              pageCareTeam caret = new pageCareTeam(this.drver,this.testcasename,this.Browsername);
              caret.clickOn_Header_SavedProviders_Button();
              caret.verify_Display_ofSavedProvider_Page("Saved Providers");
       }
       finally
       {
              this.drver.quit();
       }
}
   
   @Test(enabled = true)
   public void CareTeam_Footer_SavedProvidersLink() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "CareTeam_Footer_SavedProvidersLink";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.Rallyclosealertpopup();
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageCareTeam caret = new pageCareTeam(this.drver,this.testcasename,this.Browsername);
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pgRally.PepoleIconIsDisplayed();
                 caret.clickOn_Footer_SavedProviders_Link();
                 caret.verify_Display_ofSavedProvider_Page("Saved Providers");
          }
          finally
          {
                 this.drver.quit();
          }
   }
   
   @Test(enabled = true, priority = 110)
   public void CareTeam_Empire_Supress() throws Exception {
          try 
          {
                 this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
                 testcasename = "CareTeam_Empire_Supress";
                 Reporter.log("Execution on Device:" + this.Browsername);
                 pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
                 lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
                 pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
                 pgHome.click_on_physician_and_facilitieslink();
                 pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,this.Browsername);
                 pagePhyscnFaclts.clickonfindproviderbutton();
                 pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
                 pageCareTeam caret = new pageCareTeam(this.drver,this.testcasename,this.Browsername);
                 caret.Empire_Supress_CareTeam();
          }
          finally
          {
                 this.drver.quit();
          }
   }

   *//***********************************************************************
     * End of Centura & CareTeam
     ***********************************************************************//*


	*//***********************************************************************
	 * Change PCP
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 ***********************************************************************//*

	// Change PCP - Surendra

	@Test(enabled = true)
	public void TC01_VerifyChangePCPlinkisdisplayed() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE018_TC01_VerifyChangePCPlinkisdisplayed";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			//pgHome.prerquisite_to_navigate_to_rallyconnect();
			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ValidateChangePCPhysicianLink();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC02_VerifyChangePCPlinkisredirectingtowhichtypeofprimarycareprovider() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE017_TC02_VerifyChangePCPlinkisredirectingtowhichtypeofprimarycareprovider";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_04_VerifythatproviderdetailsaresameasthatofdetailsdisplayedinRally() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE004_TC_04_VerifythatproviderdetailsaresameasthatofdetailsdisplayedinRally";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonMemberRecords_PCP();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonAssignPCPButton();
			pgRally.clickonAssignPCPLocationRadioOption();
			pgRally.ClickonContinueButton();
			pgRally.ValidateConfirmationtextforAssignedPCP(
					"We are now sending your selection to myuhc.com to complete the process");
			pgRally.ClickonContinueButton2();

		}

		finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_10_Verifythattheuserisabletochangethezipcode_Guided_Search() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE010_TC_10_Verifythattheuserisabletochangethezipcode_Guided_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPCPIcon();
			pgRally.clickOnChangeLocationLink();
			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			changeloc.ValidateWhatLocationFindtext("What location do you want to find a provider in");
			changeloc.EnterTextZipCode("55129");
			changeloc.clickOnbtnUpdateLocationLink();
			pgRally.ValidateZipCodetext(55129);

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_Def_7569_AssignedPCPshouldbedisplayedonthetopofsearchresults() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE012_TC_Def_7569_AssignedPCPshouldbedisplayedonthetopofsearchresults";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonMemberRecords_PCP();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			Thread.sleep(6000);
			pgRally.ValidateDoctorHeaderText("Family Practice");

		}

		finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_Def_7571_DisplayofCostbandingwhennavigatingfromChangePCP() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE012_TC_Def_7571_DisplayofCostbandingwhennavigatingfromChangePCP";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.ClickonChangeDoctorLink();
			 pgHome.ClickonChangePCPLink();
			 pageRallyPCPScreen PCPScreen = new pageRallyPCPScreen(pgHome.switchtorallyscreen(),testcasename, this.Browsername);
			 PCPScreen.clickOnPCPLink();
			// PCPScreen.ValidateCostBrandingText();
		}

		finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_11_Verifythattheuserisabletochangethezipcode_Text_Search() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE011_TC_11_Verifythattheuserisabletochangethezipcode_Text_Search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.EnterProviderSearchText("Muldoon,Robert");
			pgRally.clickOnbtnSearchLink();
			pgRally.clickOnChangeLocationLink();
			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			changeloc.ValidateWhatLocationFindtext("What location do you want to find a provider in");
			changeloc.EnterTextZipCode("55129");
			changeloc.clickOnbtnUpdateLocationLink();
			pgRally.ValidateZipCodetext(55129);

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_12_VerifyifthememberisabletodoTextbasedsearchforaprovider() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE012_TC_12_VerifyifthememberisabletodoTextbasedsearchforaprovider";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.EnterTextintoSearchTextbox("Ranjit");
			pgRally.clickOnSearchButton();

		}

		finally {
			this.drver.quit();
		}
	}

	
	@Test(enabled = true)
	public void TC_13_Verifyiftheuserisnotabletoassigntheproviderwhoisnotacceptingpatients() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE012_TC_13_Verifyiftheuserisnotabletoassigntheproviderwhoisnotacceptingpatients";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.EnterTextintoSearchTextbox("MD");
			pgRally.clickOnSearchButton();

		}

		finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_15_VerifyiftheRallyisvalidatingtheCityandStateEnteredbytheuser() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE015_TC_15_VerifyiftheRallyisvalidatingtheCityandStateEnteredbytheuser";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.clickonPCPIcon();
			pgRally.clickOnChangeLocationLink();
			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			changeloc.EnterTextZipCode("Texas City, TX 77590");
			changeloc.clickOnbtnUpdateLocationLink();
			pgRally.ValidateZipCodetext(77590);

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_16_VerifyiftheRallyisvalidatingtheZipcodeenteredbytheuser() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE016_TC_16_VerifyiftheRallyisvalidatingtheZipcodeenteredbytheuser";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.clickonPCPIcon();
			pgRally.clickOnChangeLocationLink();

			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			changeloc.ValidateWhatLocationFindtext("What location do you want to find a provider in");
			changeloc.EnterTextZipCode("55129");
			changeloc.clickOnbtnUpdateLocationLink();
			
			pgRally.ValidateZipCodetext(55129);

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_06_Verifyingthattheproviderisassignedtothememberifsubmitbuttonisclicked() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE006_TC_06_Verifyingthattheproviderisassignedtothememberifsubmitbuttonisclicked";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangepcpMemberRecords_PCP();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPCPIcon();
			pgRally.clickonAssignPCPButton();
			pgRally.clickonAssignPCPLocationRadioOption();
			pgRally.ClickonContinueButton();
			pgRally.ValidateConfirmationtextforAssignedPCP(
					"We are now sending your selection to myuhc.com to complete the process");
			pgRally.ClickonContinueButton2();
			pgRally.clickOnSubmitButtonofChangePCP();

		}

		finally {
			this.drver.quit();
		}
	}

	//once Defect 9288 is fixed need to look into this 
	
	@Test(enabled = true)
	public void TC_18_VerifytheProviderlinkinCurrentSelectionPCP() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE018_TC_18_VerifytheProviderlinkinCurrentSelectionPCP";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.EnterTextintoSearchTextbox("John");
			pgRally.clickOnSearchButton();
			pgRally.Click_on_Identified_ProviderRecords(2);

		}

		finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC_19_VerifytheProviderlinkinChangePCPlink() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE017_TC_19_VerifytheProviderlinkinChangePCPlink";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ClickonProvider_PhysFacilityLink();

		} finally {
			this.drver.quit();
		}
	}
	//new
	@Test(enabled = true)
	public void TC_20_VerifytheProviderlinkinSelectmember() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE020_TC_20_VerifytheProviderlinkinSelectmember";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateProviderNameasHyperLink();
			pgHome.ClickonProvider_PhysFacilityLink();

		} finally {
			this.drver.quit();
		}
	}
	
	
	@Test(enabled = true)
	public void TC_21_VerifytheProviderlinkinChangePCPConfirmation() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
    		testcasename = "TESTCASE017_TC_21_VerifytheProviderlinkinChangePCPConfirmation";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPCPIcon();
			//pgRally.Click_on_Identified_ProviderRecords_One();
			//pgRally.Click_on_Identified_ProviderRecords(2);
			pgRally.click_on_Identified_ProviderRecords_FirstResult();
			pgRally.clickonAssignPCPButton();			
			pgRally.clickonAssignPCPLocationRadioOption();
			pgRally.ClickonContinueButton();
			pgRally.ValidateConfirmationtextforAssignedPCP(
					"We are now sending your selection to myuhc.com to complete the process");
			pgRally.ClickonContinueButton2();

		} finally {
			this.drver.quit();
		}
	}
	

	@Test(enabled = true)
	public void TC_21_VerifytheProviderlinkinPersonscovered() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE017_TC_21_VerifytheProviderlinkinPersonscovered";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.ClickonMoreDetailsLink();
			pgHome.ValidatePersonCoveredText();
			pgHome.ClickExpandAllLink();
			//pgHome.ClickonProvider_PhysFacilityLink();

		} finally {
			this.drver.quit();
		}
	}
	
	
	@Test(enabled = true)
	public void TC_23_VerifyiftheZipcodeisdisplayingasdefaultforthememberwhologgedinafterupdatingtheZipcode() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
    		testcasename = "TESTCASE017_TC_23_VerifyiftheZipcodeisdisplayingasdefaultforthememberwhologgedinafterupdatingtheZipcode";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pgHome.ClickonChangePCPToolsLink();
			pgHome.ValidateChangePCPText("Change Primary Care Physician");
			pgHome.ClickonChangePCPLink();

			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox_PCP();
			pgRally.clickonPCPIcon();
			pgRally.clickOnChangeLocationLink();
			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			changeloc.ValidateWhatLocationFindtext("What location do you want to find a provider in");
			changeloc.EnterTextZipCode("55129");
			changeloc.clickOnbtnUpdateLocationLink();
			pgRally.ValidateZipCodetext(55129);
			

		} finally {
			this.drver.quit();
		}
	}
	

	*//***********************************************************************
	 * End of Change PCP
	 ***********************************************************************//*

	// Change Locations -Surendra

	@Test(enabled = true)
	public void TC01_VerifythePrepopulatedzipcodedisplayedonGuidedsearchscreenisfromtheeligibilityfile()
			throws Exception {
		try {

			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE017_TC01_VerifythePrepopulatedzipcodedisplayedonGuidedsearchscreenisfromtheeligibilityfile";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC08_VerifyzipcodeupdationfromSearchResultspage() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE017_TC08_VerifyzipcodeupdationfromSearchResultspage";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.EnterProviderSearchText("orthopedic surgery");
			pgRally.clickOnbtnSearchLink();
			pgRally.clickOnChangeLocationLink();
			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			changeloc.ValidateWhatLocationFindtext("What location do you want to find a provider in");
			changeloc.EnterTextZipCode("55129");
			changeloc.clickOnbtnUpdateLocationLink();
			pgRally.ValidateZipCodetext(55129);

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE019_TC04_Verifyifupdatedzipcodeisreflectedonguidedsearchscreen_UpdateZipcodebuttonfunctionalityonthechangelocation()
			throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE019_TC04_Verifyifupdatedzipcodeisreflectedonguidedsearchscreen_UpdateZipcodebuttonfunctionalityonthechangelocation";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.clickOnChangeLocationLink();

			pageRallyChangeLocationScreen changeloc = new pageRallyChangeLocationScreen(this.drver, testcasename,
					this.Browsername);
			Thread.sleep(3000);
			changeloc.ValidateWhatLocationFindtext("What location do you want to find a provider in");
			changeloc.EnterTextZipCode("55129");
			changeloc.clickOnbtnUpdateLocationLink();
			pgRally.verifyCorrectZipcodedisplayedAfterModifying(55129);

		} finally {
			this.drver.quit();
		}
	}

	// Refine Search Results 
	
	@Test(enabled = true)
	public void TESTCASE024_TC02_Verifyuserabletonarrowtheresultsinrefineresults_HealthcareprofessionalsTextbasedsearch()
			throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE024_TC02_Verifyuserabletonarrowtheresultsinrefineresults_HealthcareprofessionalsTextbasedsearch";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.EnterProviderSearchText("orthopedic surgery");
			pgRally.clickOnbtnSearchLink();
			Thread.sleep(5000);
			pageRallyRefineSearchScreen refineSearch = new pageRallyRefineSearchScreen(this.drver, testcasename,
					this.Browsername);

			refineSearch.ValidateRefineSearchtext("Refine Results");
			refineSearch.ValidatehealthCareProfessionaltext("Health Care Professionals");
			refineSearch.ValidateClinicandFacilitiestext("Clinics and Facilities");
			refineSearch.ValidateSpecialitiestext("Specialties");
			refineSearch.ValidateMedicalGrouptext("Medical Groups");
			refineSearch.clickOnHealthCareProfessLink();
		} finally {
			this.drver.quit();
		}
	}

	
	@Test(enabled = true)
	public void TESTCASE021_TC03_VerifyifuserisabletonarrowtheresultsinrefineresultsSpecialtiesTextbasedsearch()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE021_TC03_VerifyifuserisabletonarrowtheresultsinrefineresultsSpecialtiesTextbasedsearch";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			// pgHome.prerquisite_to_navigate_to_rallyconnect();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();

			pgRally.EnterTextintoSearchTextbox("orthopedic surgery");
			pgRally.clickOnSearchButton();
			Thread.sleep(5000);

			pageRallyRefineSearchScreen refineSearch = new pageRallyRefineSearchScreen(this.drver, testcasename,
					this.Browsername);

			refineSearch.ValidateRefineSearchtext("Refine Results");
			refineSearch.ValidatehealthCareProfessionaltext("Health Care Professionals");
			refineSearch.ValidateClinicandFacilitiestext("Clinics and Facilities");
			refineSearch.ValidateSpecialitiestext("Specialties");
			refineSearch.ValidateMedicalGrouptext("Medical Groups");
			refineSearch.clickOnSpecialityLink();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE018_TC04_Verifythefiltersupdateddynamicallyinrefineresults() throws Exception

	{
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE018_TC04_Verifythefiltersupdateddynamicallyinrefineresults";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			// pgHome.prerquisite_to_navigate_to_rallyconnect();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.EnterTextintoSearchTextbox("Muldoon,Robert");
			pgRally.clickOnSearchButton();

			pageRallyRefineSearchScreen refineSearch = new pageRallyRefineSearchScreen(this.drver, testcasename,
					this.Browsername);
			refineSearch.ValidateRefineSearchtext("Refine Results");
			refineSearch.ValidateLocationtext();
			refineSearch.ValidateZipCodeText();
			refineSearch.ValidatelabelWithinText();
			refineSearch.ValidateDropDownMilesValuetext("20 Miles");

		} finally {
			this.drver.quit();
		}
	}


	@Test(enabled = true)
	public void TESTCASE016_TC05_VerifythefiltersLocation() throws Exception {
		try {
		this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
		testcasename = "TESTCASE016_TC05_VerifythefiltersLocation";
		Reporter.log("Execution on Device:" + this.Browsername);
		pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
		lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
		pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
		pgHome.Rallyclosealertpopup();

		pgHome.click_on_physician_and_facilitieslink();
		pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
				this.Browsername);

		pagePhyscnFaclts.clickonfindproviderbutton();
		pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
		pgRally.validatePlaceholderMsgOnSearchtextbox();
		pgRally.EnterTextintoSearchTextbox("Muldoon,Robert");
		pgRally.clickOnSearchButton();
		Thread.sleep(5000);
		pageRallyRefineSearchScreen refineSearch = new pageRallyRefineSearchScreen(this.drver, testcasename,
				this.Browsername);
		refineSearch.FieldExist_Location();
		refineSearch.FieldExist_ZipCode();
		refineSearch.FieldExist_labelWithin();
		refineSearch.ValidateDropDownMilesValuetext("20 Miles");

		} finally {
			this.drver.quit();
		}
	}
	// need to work 
	@Test(enabled = true)
	public void TESTCASE015_TC15_VerifytheSearchResultsSortingbyName_A_Z() throws Exception {
		try {
		this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
		testcasename = "TESTCASE015_TC15_VerifytheSearchResultsSortingbyName_A_Z";
		Reporter.log("Execution on Device:" + this.Browsername);
		pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
		lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
		pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
		pgHome.Rallyclosealertpopup();

		pgHome.click_on_physician_and_facilitieslink();
		pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
				this.Browsername);

		pagePhyscnFaclts.clickonfindproviderbutton();
		pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
		pgRally.validatePlaceholderMsgOnSearchtextbox();
		pgRally.clickonPeopleIcon();
		pgRally.clickonPrimaryCareIcon();
		pgRally.clickonPCPIcon();
		pgRally.ValidateDropDownMilesValuetext();

	} finally {
		this.drver.quit();
	}
}
	
	 
		@Test(enabled = true)
		public void TESTCASE016_TC16_VerifytheSearchResultsRefined_NewPatientStatus() throws Exception {
			try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE016_TC16_VerifytheSearchResultsRefined_NewPatientStatus";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgRally.clickonNewPatientFilter();
			pgRally.clickonAcceptingNewPatientOption();
			
			pgRally.ClickBacktoNavigateRallyScreenArrow();
			pgRally.clickonPCPIcon();
			//pgRally.clickonNewPatientFilter();			
			pgRally.clickonNOTAcceptingNewPatientOption();

			
		} finally {
			this.drver.quit();
		}
	}
		

	*//***********************************************************************
	 * River Valley TC's -Ankita/Surendra
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 ***********************************************************************//*

	// River Valley TC's -Ankita/Surendra

	@Test(enabled = true)
	public void TESTCASE027_TC010_RV_Deeplink_Heritage_Plus() throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE027_TC010_RV_Deeplink_Heritage_Plus";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pageRiverValley rv = new pageRiverValley(this.drver, testcasename, this.Browsername);

			rv.LauncURLwithOutUserName(AppConst.Sys2_URL);
			rv.clickonFindLaboratoryorFacultyLink();
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(pgHome.switchtorallyscreen(),
					testcasename, this.Browsername);
			rvRally.clickonRallyonUnitedHealthCarePlanLink();
			rvRally.clickonPlanListHeritagePlusLink();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE025_TC02_RV_Deeplink_HeritageSelectAdvantage_NClocation() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE025_TC02_RV_Deeplink_HeritageSelectAdvantage_NClocation";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pageRallyScreen pgRally = new pageRallyScreen(this.drver,
			// testcasename, this.Browsername);
			pageRiverValley rv = new pageRiverValley(this.drver, testcasename, this.Browsername);
			rv.LauncURLwithOutUserName(AppConst.Sys2_URL);
			rv.clickonFindLaboratoryorFacultyLink();
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(pgHome.switchtorallyscreen(),
					testcasename, this.Browsername);

			rvRally.clickonRallyonUnitedHealthCarePlanLink();
			rvRally.clickonPlanListHeritageSelectAdvantageLink();
			//rvRally.CheckZipEntryHSA_NCLocation();

		} finally {
			this.drver.quit();
		}
	}
	@Test(enabled = true)
	public void TESTCASE023_TC03_RV_Deeplink_Heritage_Select_POS_HMO() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE023_TC03_RV_Deeplink_Heritage_Select_POS_HMO";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageRiverValley rv = new pageRiverValley(this.drver, testcasename, this.Browsername);
			rv.LauncURLwithOutUserName(AppConst.Sys2_URL);
			rv.clickonFindLaboratoryorFacultyLink();
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(pgHome.switchtorallyscreen(),
					testcasename, this.Browsername);
			rvRally.clickonRallyonUnitedHealthCarePlanLink();
			rvRally.clickonPlanListHeritagePlusLink();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC05_RV_CSPGSPCustomization_PreferredProvider_HSA_English() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC05_RV_CSPGSPCustomization_PreferredProvider_HSA_English";
			Reporter.log("Execution on Device:" + this.Devicemodel);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys1_URL, AppConst.Sys3_CSPGSP_RV_Username, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("28208");
			pgRally.clickOnPeopleLink();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("28208");
			pgRally.clickonUpdateLocation();
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(this.drver,
					testcasename, this.Browsername);
			rvRally.ValidateTier2Designation();


		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true,priority=208)
	public void TC06_RV_CSPGSPCustomization_TIER2Text_Spanish() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC06_RV_CSPGSPCustomization_TIER2Text_Spanish";
			Reporter.log("Execution on Device:" + this.Devicemodel);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys1_URL, AppConst.Sys3_CSPGSP_RV_Username, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnPeopleLink();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("28208");
			pgRally.clickonUpdateLocation();
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(this.drver,
					testcasename, this.Browsername);
			rvRally.ValidateTier2Designation();
			pgRally.clickOnSpanishLink();
			rvRally.ValidateTier2DisclaimerSpanish();
			pgRally.click_OnEnglish_Link();
			
			} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC07_RV_HeritageSelectAdvantage_IOWALocation() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC07_RV_HeritageSelectAdvantage_IOWALocation";
			Reporter.log("Execution on Device:" + this.Devicemodel);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys1_URL, AppConst.Sys3_CSPGSP_RV_Username, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.changeZip_PageRallyScreen("52246");
			//pgRally.clickonUpdateLocation();
			pgRally.clickOnPeopleLink();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			//pgRally.clickOnChangeLocationLink();
			
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(this.drver,
					testcasename, this.Browsername);
			rvRally.ValidatePlanNameHeritageSelectAdvantageIALocation(); 
			
			} finally {
			this.drver.quit();
		}
	}
	
	
	@Test(enabled = true)
	public void TC06_RV_Plan_name_NHP_HMO_POS_Access() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC06_RV_Plan_name_NHP_HMO_POS_Access";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys1_URL, AppConst.Sys3_RV_NHP_HMO_POSUsername, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			Thread.sleep(6000);
			pgRally.changeZip_PageRallyScreen("52246");
			pgRally.VerificationOfPlanheader("NHP POS");
			} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC06_RV_Provider_Search_post_Login() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC06_RV_Provider_Search_post_Login";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys1_URL, AppConst.Sys3_CSPGSP_RV_Username, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("52246");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageGuidedSearch gs = new pageGuidedSearch(this.drver, testcasename, this.Browsername);
			gs.verifySearchResultsForPCPLink();
			pgRally.clickOnStartOverButton();
			pgRally.EnterTextintoSearchTextbox("Medical Center");
			pgRally.clickOnSearchButton();
			gs.verifySearchResultsForTextSearch();
			} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC04_RV_ProviderSearchPreloginPlanNames() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC04_RV_ProviderSearchPreloginPlanNames";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageRiverValley rv = new pageRiverValley(this.drver, testcasename, this.Browsername);
			rv.LauncURLwithOutUserName(AppConst.Sys2_URL);
			rv.clickonFindLaboratoryorFacultyLink();
			pageRiverValleyRallyScreen rvRally = new pageRiverValleyRallyScreen(pgHome.switchtorallyscreen(),
					testcasename, this.Browsername);

			rvRally.clickonRallyonUnitedHealthCarePlanLink();
			rvRally.ValidatePlanListHeritagePlus();
			rvRally.ValidatePlanListHeritageSelectPOSHMO();
			rvRally.ValidatePlanListHeritageSelectEPO();
			rvRally.ValidatePlanListHeritageSelectAdvantageIA();
			rvRally.ValidateHeritageSelectAdvantageListOption();
			rvRally.ValidatePlanListNHPPOSHMO();
			rvRally.ValidatePlanListNHPPOSHMOAccess();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC06_RV_Heritage_Select_Advantage_custom_default_sort_NOT_available() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC06_RV_Heritage_Select_Advantage_custom_default_sort_NOT_available";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys1_URL, AppConst.Sys3_CSPGSP_RV_Username, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.uhcWestPromation();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("52246");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageRiverValley pageRiver = new pageRiverValley(this.drver, testcasename, this.Browsername);
			pageRiver.verifyDefaultDropdownasUPHDfromDropdown();
			} finally {
			this.drver.quit();
		}
	}
	
	
	
	
	
	
	*//***********************************************************************
	 * End of River Valley TC's -Ankita/Surendra
	 ***********************************************************************//*

	*//***********************************************************************
	 * Report Incorrect Info Feedback
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 ***********************************************************************//*

	// Report Incorrect Info Feedback - Surendra

	// corrected

	@Test(enabled = true)
	public void TESTCASE028_TC01_SendSingleFeedbackonProviderDetailspageforPhysicianwithincorrectName()
			throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE028_TC01_SendSingleFeedbackonProviderDetailspageforPhysicianwithincorrectName";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.changeZip_PageRallyScreen("71631");

			pgRally.clickOnPeopleLink();
			pageRallyPrimaryCareScreen primaryCareScreen = new pageRallyPrimaryCareScreen(this.drver, testcasename,
					this.Browsername);
			primaryCareScreen.clickOnPrimaryCareLink();
			pageRallyPCPScreen PCPScreen = new pageRallyPCPScreen(this.drver, testcasename, this.Browsername);
			PCPScreen.clickOnPCPLink();
			pgRally.clickOnViewSerCostPropertyLink();
			pageRallyReportIncorrectInfo ReportIncorrectInfo = new pageRallyReportIncorrectInfo(this.drver,
					testcasename, this.Browsername);
			ReportIncorrectInfo.clickOnReportIncorrectLink();
			ReportIncorrectInfo.clickOnNameFeedbackCheckbox();
			ReportIncorrectInfo.EnterFeedBack("Automation Test for Multiple Options");
			ReportIncorrectInfo.clickOnbtnSendButton();
			ReportIncorrectInfo.ValidateThanksforSendingConfirmationtext();
			ReportIncorrectInfo.clickOnbtnCloseButton();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE026_TC015_SendMultipleFeedbackonProviderDetailspageforPhysicianwithincorrectNameandGender()
			throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE026_TC015_SendMultipleFeedbackonProviderDetailspageforPhysicianwithincorrectNameandGender";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();

			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			// pgRally.clickOnPeopleLink();
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.changeZip_PageRallyScreen("71631");
			pgRally.clickonPeopleIcon();
			pageRallyPrimaryCareScreen primaryCareScreen = new pageRallyPrimaryCareScreen(this.drver, testcasename,
					this.Browsername);
			primaryCareScreen.clickOnPrimaryCareLink();
			pageRallyPCPScreen PCPScreen = new pageRallyPCPScreen(this.drver, testcasename, this.Browsername);
			PCPScreen.clickOnPCPLink();
			pgRally.clickOnViewSerCostPropertyLink();
			pageRallyReportIncorrectInfo ReportIncorrectInfo = new pageRallyReportIncorrectInfo(this.drver,
					testcasename, this.Browsername);
			ReportIncorrectInfo.clickOnReportIncorrectLink();
			ReportIncorrectInfo.clickOnNameFeedbackCheckbox();
			ReportIncorrectInfo.clickOnWebSiteCheckbox();
			ReportIncorrectInfo.EnterFeedBack("Automation Test for Multiple Options");
			ReportIncorrectInfo.clickOnbtnSendButton();
			ReportIncorrectInfo.ValidateThanksforSendingConfirmationtext();
			ReportIncorrectInfo.clickOnbtnCloseButton();

		} finally {
			this.drver.quit();
		}
	}

	// corrected
	@Test(enabled = true)
	public void TESTCASE010_TC23_SelectAllReportIncorrectInformationcheckboxes() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE010_TC23_SelectAllReportIncorrectInformationcheckboxes";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);

			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.changeZip_PageRallyScreen("71631");
			pgRally.clickOnPeopleLink();
			pageRallyPrimaryCareScreen primaryCareScreen = new pageRallyPrimaryCareScreen(this.drver, testcasename,
					this.Browsername);
			primaryCareScreen.clickOnPrimaryCareLink();
			pageRallyPCPScreen PCPScreen = new pageRallyPCPScreen(this.drver, testcasename, this.Browsername);
			PCPScreen.clickOnPCPLink();
			pgRally.clickOnViewSerCostPropertyLink();
			pageRallyReportIncorrectInfo ReportIncorrectInfo = new pageRallyReportIncorrectInfo(this.drver,
					testcasename, this.Browsername);
			ReportIncorrectInfo.clickOnReportIncorrectLink();
			ReportIncorrectInfo.clickOnNameFeedbackCheckbox();
			ReportIncorrectInfo.clickOnWebSiteCheckbox();
			ReportIncorrectInfo.EnterFeedBack("Automation Test for Multiple Options");
			ReportIncorrectInfo.clickOnbtnSendButton();
			ReportIncorrectInfo.ValidateThanksforSendingConfirmationtext();
			ReportIncorrectInfo.clickOnbtnCloseButton();

		} finally {
			this.drver.quit();
		}
	}

	*//***********************************************************************
	 * Report Incorrect Info Feedback
	 ***********************************************************************//*


	*//***********************************************************************
	 * Guest Search Test cases Start
	 * 
	 * @throws Exception
	 ***********************************************************************//*
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_California_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_California_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("California");
			gs.SelectPlan("Core Essential EPO");
			//gs.clickonCore_Essential_EPO();
			gs.verifyPlan_CoreEssentialEPO_Text("Core Essential EPO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("dentalsearch.yourdentalplan.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Michigan_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Michigan_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.SelectState("Michigan");
			
			gs.SelectPlan("Compass HMO");
			gs.verifyPlanHeader("COMPASS HMO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			Thread.sleep(4000);
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
			
			
			//gs.clickonState_Maryland();
			gs.clickonPlan_CompassHMO();
			gs.verifyPlanHeader("COMPASS HMO");
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("https://www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("provider.wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Massachusetts_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Massachusetts_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			
			//gs.clickonState_Massachusetts();
			gs.SelectState("Massachusetts");
			gs.SelectPlan("Choice EPO");
			//gs.clickonChoice_EPO();
			gs.verifyPlan_ChoiceEPO_Text("Choice EPO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Illinois_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Illinois_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("Illinois");
	
			//gs.SelectPlan("Compass HMO");
			
			//gs.clickonState_Illinois();
			//gs.clickonPlan_CompassHMO();
		
			
			gs.SelectPlan("Compass HMO");
			gs.verifyPlanHeader("COMPASS HMO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			Thread.sleep(4000);
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Indiana_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Indiana_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("Indiana");
			
			//gs.clickonState_Indiana();
			//gs.clickonChoice_EPO();
			gs.SelectPlan("Choice EPO");
			gs.verifyPlan_ChoiceEPO_Text("Choice EPO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("https://www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Oklahoma_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Oklahoma_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("Oklahoma");
			gs.SelectPlan("Compass HMO");
			gs.verifyPlanHeader("COMPASS HMO");
			
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			Thread.sleep(4000);
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
			
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Iowa_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Iowa_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("Iowa");
			gs.SelectPlan("Compass HMO");
			gs.verifyPlanHeader("COMPASS HMO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			Thread.sleep(4000);
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
			
			
			//gs.clickonState_Iowa();
			gs.clickonPlan_CompassHMO();
			gs.verifyPlanHeader("COMPASS HMO");
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("https://www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("provider.wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Maryland_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_Maryland_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("Maryland");
			
			gs.SelectPlan("Compass HMO");
			gs.verifyPlanHeader("COMPASS HMO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			Thread.sleep(4000);
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
			
			
			
			
			//gs.clickonState_Maryland();
			gs.clickonPlan_CompassHMO();
			gs.verifyPlanHeader("COMPASS HMO");
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("provider.wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE036_GuestSearch_UHC_Plan_Core_Essentials() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE036_GuestSearch_UHC_Plan_Core_Essentials";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan("Core Essential");
			gs.clickonCurrentProvidersLink();
			
			//gs.clickonPlan_Core_Essentials();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("55129");
			gs.clickonContinue_Button();
			gs.VerificationOfCoreEssentialsPlanheader();
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE037_GuestSearch_UHC_Plan_Core() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);

			testcasename = "TESTCASE037_GuestSearch_UHC_Plan_Core";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			
			//gs.clickonPlan_Core();
			gs.SelectUHCPlan("Core");
			gs.clickonCurrentProvidersLink();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("90012");
			gs.clickonContinue_Button();
			gs.VerificationOfCorePlanheader();
			// gs.verifyPlanHeader("Core");
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE038_GuestSearch_UHC_Plan_Options_PPO() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);

			testcasename = "TESTCASE038_GuestSearch_UHC_Plan_Options_PPO";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan1("Options PPO");
			
			//gs.clickonOptions_PPO();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerificationOfOptionsPPOPlanheader();
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE042_GuestSearch_UHC_Plan_Compass() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE042_GuestSearch_UHC_Plan_Compass";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys5_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan("Compass Plus");
			gs.clickonCurrentProvidersLink();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.Verification_OfCompassPlus_Planheader();
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE040_GuestSearch_UHC_Plan_Choice_Plus() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE040_GuestSearch_UHC_Plan_Choice_Plus";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan1("Choice Plus");
	
			//gs.clickonChoice_Plus();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerificationOfChoicePlusPlanheader();
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE041_GuestSearch_UHC_Plan_Navigate_Plus() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE041_GuestSearch_UHC_Plan_Navigate_Plus";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan("Navigate Plus");
			gs.clickonCurrentProvidersLink();
			//gs.clickonNavigate_Plus();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerificationOfNavigatePlusPlanheader("NAVIGATE PLUS");
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_ShopExchange_Pennsylvania_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_ShopExchange_Pennsylvania_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonShopIcon();
			gs.InWhichStateTextIsDisplayed();
			//gs.clickonState_Pennsylvania();
			gs.SelectState("Pennsylvania");
			gs.SelectPlan("Navigate Plus");
			//gs.clickonNavigate_Plus_Pennsylvania();
			gs.verifyPlan_NavigatePlus_Text("Navigate Plus");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("https://www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("dentalsearch.yourdentalplan.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_ShopExchange_RhodeIsland_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_ShopExchange_RhodeIsland_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonShopIcon();
			gs.InWhichStateTextIsDisplayed();
			//gs.clickonState_Rhode_Island();
			gs.SelectState("Rhode Island");
			gs.SelectPlan("Choice HMO");
			//gs.clickonChoice_HMO();
			gs.verifyPlan_ChoiceHMO_Text("Choice HMO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("https://www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("https://dentalsearch.yourdentalplan.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}	
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_ShopExchange_Connecticut_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_ShopExchange_Connecticut_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonShopIcon();
			gs.InWhichStateTextIsDisplayed();
			//gs.clickonState_Connecticut();
			gs.SelectState("Connecticut");
		//	gs.clickonChoice_Plus_POS();
			gs.SelectPlan("Choice Plus POS");
			gs.verifyPlan_ChoicePlusPOS_Text("Choice Plus POS");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("https://www.optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("dentalsearch.yourdentalplan.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_NewJersey_2016_Plan() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_GuestSearch_StateExchanges_InDiv_and_Family_NewJersey_2016_Plan";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.InWhichStateTextIsDisplayed();
			gs.SelectState("New Jersey");
			
			gs.SelectPlan("Compass HMO");
			gs.verifyPlanHeader("COMPASS HMO");
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonPharmacy_Directory();
			pageGuestOptumRx pgor = new pageGuestOptumRx(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgor.verificationOfPharmacy_DirectoryURL("optumrx.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMentalHealth_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfMentalHealth_DirectoryURL("www.liveandworkwell.com");
			
			
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonDental_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfDental_DirectoryURL("uhc.secure.force.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonVision_Directory();
			pgHome.switchtorallyscreen();
			pgor.verificationOfVision_DirectoryURL("wf.myuhcvision.com");
			gs.SwitchToPrviousScreen();
			gs.verifyWhatAreYouLookingTextIsPresent();
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			Thread.sleep(4000);
			gs.clickonContinue_Button();
			gs.VerifyTextUnderPepoleicon();
			
		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE039_GuestSearch_UHC_Plan_Compass_HMO_Compassed_Balanced_HMO_Compass_Plus_HMO()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE039_GuestSearch_UHC_Plan_Compass_HMO_Compassed_Balanced_HMO_Compass_Plus_HMO";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan("Compass HMO / Compassed Balanced HMO / Compass Plus HMO");
			gs.clickonCurrentProvidersLink();
			//gs.clickonCompass_HMO_Compassed_Balanced_HMO_Compass_Plus_HMO();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("75224");
			gs.clickonContinue_Button();
			gs.VerificationOfCompassPlusHMOPlanheader();
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE005_Spec1471_Saved_Providers_Guestsearch() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE005_Spec1471_Saved_Providers_Guestsearch";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonState_Exchanges();
			gs.clickonIndvidual_Family();
			gs.clickonState_Alabama();
			gs.clickonPlan_CompassHMO();
			gs.verifyPlanHeader("COMPASS HMO");
			
			gs.clickonMedical_Directory();
			gs.MedicalDirectoryZipTextIsDisplayed();
			gs.EnterTextZipCode("35019");
			gs.clickonContinue_Button();
			gs.SavedProvidersforAlbamaStateisdisplayed();
			
		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTCASE036_GuestSearch_UHC_Plan_Heritage_Plus() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE036_GuestSearch_UHC_Plan_Heritage_Plus";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageGuestSearch gs = new pageGuestSearch(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			gs.clickonAll_UnitedHealthCare_plan();
			gs.SelectUHCPlan1("Heritage Plus");
			//gs.clickonPlan_Core_Essentials();
			pageRallyScreen pgRally = new pageRallyScreen(this.drver, testcasename, this.Browsername);
			pgRally.ZipcodeTextIsDisplayed();
			gs.EnterTextZipCode("55129");
			gs.clickonContinue_Button();
			gs.VerificationOfHeritagePlusPlanheader();
			gs.VerifyTextUnderPepoleicon();
			gs.VerifyTextUnderPlacesicon();
			gs.VerifyTextUnderTextandImgaesicon();
			gs.VerifyTextUnderServicesAndTreatments();
			gs.VerifyTextUnderCareByConditionicon();
			gs.VerifyChangePlanText();
		} finally {
			this.drver.quit();
		}
	}
	
	*//***********************************************************************
	 * End of Guest Search Test cases
	 ***********************************************************************//*
	*//***********************************************************************
	 * Empire Test cases Start Point
	 * 
	 * @throws Exception
	 ***********************************************************************//*

	@Test(enabled = true, priority = 200)
	public void TC01_AcceptingNewPatIndicatorSuppressed_FTN() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC01_AcceptingNewPatIndicatorSuppressed_FTN";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.AcceptNewPatIndicator_FTN();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC02_EmpireLogo_ProviderSearch() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC02_EmpireLogo_ProviderSearch";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pageEmpire pgEmpire = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmpire.Empire_Logo();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgEmpire.Empire_Logo();
			
			//pgNewRally.Empire_Logo();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC03_EmpireCustom_Logo_URL_TEXT() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC03_EmpireCustom_Logo_URL_TEXT";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.changeZip_PageRallyScreen("13417");
			
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("13417");
			pgRally.clickonUpdateLocation();
			
			
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.clickonPrintDirectory();
			pgEmp.HandlingPrintDirectoryPopup();
			pageEmpire pgNewRally = new pageEmpire(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgNewRally.Empire_Logo();
			pgNewRally.PrintDirLink1();
			pgNewRally.ValidationPrintDirDisclaimer();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC04_FamilyPracticeRemoveVerbiage_Psychiatry() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC04_FamilyPracticeRemoveVerbiage_Psychiatry()";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pgRally.EnterTextintoSearchTextbox("Family Practice");
			pgRally.clickOnbtnSearchLink();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.ValidateFamilyPracticeVerbiage();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC05_EmpireHospitalAffiliationDisclaimerText() throws Exception {
		try {

			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC05_EmpireHospitalAffiliationDisclaimerText";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10010");
			pgRally.clickonUpdateLocation();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgRally.clickOnFirstResult();
			pgEmp.ValidationHospAffiliationDisclaimer();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC06_PCPID_ReferenceSuppressed() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC06_PCPID_ReferenceSuppressed";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("10001");
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgRally.clickOnFirstResult();
			pgEmp.PCPIDSuppressed_FTN();
			pgRally.clickOnBackButtonToPreviousPage();
			pgEmp.clickonPrintDirectory();
			pageEmpire pgEmp1 = new pageEmpire(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgEmp1.HandlingPrintDirectoryPopup();
			pgEmp1.PrintDirPCPIDSuppressed_FTN();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC07PrintDirectoryAllLinksupdated() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC07PrintDirectoryAllLinksupdated";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			//pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("10001");
			
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			
			
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.clickonPrintDirectory();
			pageEmpire pgNewRally = new pageEmpire(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgEmp.HandlingPrintDirectoryPopup();
			pgNewRally.PrintDirLink1();
			pgNewRally.PrintDirLink2();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC08SpecialtyFacility() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC08SpecialtyFacility";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			//pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgRally.EnterTextintoSearchTextbox("Audiology Hearing Centers");
			pgRally.clickOnSearchButton();
			pgEmp.ValidateSpecialtyFacility("Audiology");
			pgRally.EnterTextintoSearchTextbox("Hyperbaric Oxygen Treatment Centers");
			pgRally.clickOnSearchButton();
			pgEmp.ValidateSpecialtyFacility("Hyperbaric");
			pgRally.EnterTextintoSearchTextbox("Diabetes Education Centers");
			pgRally.clickOnSearchButton();
			pgEmp.ValidateSpecialtyFacility("Diabetes");
			pgRally.EnterTextintoSearchTextbox("Sleep Study Centers");
			pgRally.clickOnSearchButton();
			pgEmp.ValidateSpecialtyFacility("Sleep Study");
			
			//pgEmp.ValidateOutpatientSurgicalLocaions();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TC09_SuppressCost() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC09_SuppressCost";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			//pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.CostandServiceSuppressed_FTN();
			// Click on 1st provider in provider list, click function
			pgRally.clickOnFirstResult();
			pgEmp.PCPDetailsCostServiceTab_FTN();

		} finally {
			this.drver.quit();
		}
	}
	
	
	@Test(enabled = true)
 	public void TC10_OutpatientLaboratoryRadiologyDisclaimer_facility() throws Exception {
 		try {
 			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
 			testcasename = "TC10_OutpatientLaboratoryRadiologyDisclaimer_facility";
 			Reporter.log("Execution on Device:" + this.Browsername);
 			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
 			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
 			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
 			//pgHome.Rallyclosealertpopup();
 			pgHome.click_on_physician_and_facilitieslink();
 			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
 					this.Browsername);
 			pagePhyscnFaclts.clickonfindproviderbutton();
 			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
 			pgRally.clickOnChangeLocationLink();
 			pgRally.EnterTextZipCode("10001");
 			pgRally.clickonUpdateLocation();
 			pgRally.clickOnPlacesLink();
 			pgRally.clickOnSpecialtyLink();
 			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
 			pgEmp.ValidateOutpatientLaboratoryRadiologyDisclaimer();
 			
 		}finally {
 			this.drver.quit();
 		}
 	}
 		

 	@Test(enabled = true)
 	public void TC11_AttorneyGeneralDisclaimer() throws Exception {
 		try {
 			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
 			testcasename = "TC11_AttorneyGeneralDisclaimer";
 			Reporter.log("Execution on Device:" + this.Browsername);
 			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
 			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
 			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
 			//pgHome.Rallyclosealertpopup();
 			pgHome.click_on_physician_and_facilitieslink();
 			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
 					this.Browsername);
 			pagePhyscnFaclts.clickonfindproviderbutton();
 			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
 			pgRally.clickOnChangeLocationLink();
 			pgRally.EnterTextZipCode("10001");
 			pgRally.clickonUpdateLocation();
 			pgRally.clickonPeopleIcon();
 			pgRally.clickonPrimaryCareIcon();
 			pgRally.clickonPCPIcon();
 			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
 			pgEmp.AttorneyGeneralDisclaimer();

 		} finally {
 			this.drver.quit();
 		}
 	}

 	
 	
 	
	// 100 test cases
	@Test(enabled = true, priority = 205)
	public void TC12_SuppressSpanish() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC12_SuppressSpanish";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			//pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("10001");
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.SpanishSuppressed_FTN();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC13_SuppressUHPD() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC13_SuppressUHPD";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			//pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.changeZip_PageRallyScreen("10001");
			
			
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			
			
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.UHPDLinkSuppressed_FTN();

		} finally {
			this.drver.quit();
		}
	}


	@Test(enabled = true)
	public void TC14_DisplayBreastPumpProvidersNarrative() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC14_DisplayBreastPumpProvidersNarrative";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Empire_sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			// pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickOnChangeLocationLink();
			pgRally.EnterTextZipCode("10001");
			pgRally.clickonUpdateLocation();
			pgRally.clickOnPlacesLink();
			pgRally.clickOnPlace_MedicalSuppliers();
			//pgRally.clickonPCPIcon();
			pageEmpire pgEmp = new pageEmpire(this.drver, testcasename, this.Browsername);
			pgEmp.ValidateBreastPumpSupplier();
			pgEmp.ValidateBreastPumpSupplierNarrative();

		} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TC15_GuestSearchPlanList() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TC15_GuestSearchPlanList";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.GuestLaunch(AppConst.Sys2_URL);
			lp.clickonFind_Physician_LabarotryLink();
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageEmpire pgEmp = new pageEmpire(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgEmp.clickonAll_UnitedHealthCare_plan();
			pgEmp.clickonTheEmpireplan();
			pgHome.switchtorallyscreen();
			pgEmp.verificationOfEmpirePlan("https://www.myuhc.com/member/prewelcome.do?currentLanguageFromPreCheck=en");

		} finally {
			this.drver.quit();
		}
	}

	*//***********************************************************************
	 * End of Empire Test cases
	 * 
	 * @throws Exception
	 ***********************************************************************//*

	//////////////////// Surendra - Alt Med ///////////////////
	@Test(enabled = true)
	public void TESTCASE0110_AltMedSpecialitiesunderspecialitycare_IsuanceotherresidenceWA() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0110_AltMedSpecialitiesunderspecialitycare_IsuanceotherresidenceWA";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.AltMed_NonWA_Sys5_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			//pgHome.RallyAltMed_closeAlertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPeopleIcon();
			pgRally.clickOnSpecialityCareIcon();
			pgRally.Validate_AltMed_AcupuncturistLinkText();
			pgRally.Validate_AltMed_MassagetherapyLinkText();
			pgRally.Validate_AltMed_NutritionistLinkText();
			pgRally.Click_AltMed_Acupuncturist_Link();
			pgRally.Validate_AltMedSecond_LicensedAcupunctureOption();
			pgRally.ClickBacktoNavigateRallyScreenArrow();
			pgRally.Click_AltMed_Message_Therapist_Link();
			// pgRally.Validate_AltMedSecond_MassageTherapyOption();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE0111_AltMedSpecialitiesunderspecialitycare_Isuance_WA_ResidenceWA() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0110_AltMedSpecialitiesunderspecialitycare_Isuance_WA_ResidenceWA";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.AltMed_WA_Sys5_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.RallyAltMed_closeAlertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPeopleIcon();
			pgRally.clickOnSpecialityCareIcon();
			pgRally.Validate_AltMed_AcupuncturistLinkText();
			pgRally.Validate_AltMed_MassagetherapyLinkText();
			pgRally.Validate_AltMed_NutritionistLinkText();
			pgRally.Click_AltMed_Acupuncturist_Link();
			pgRally.Validate_AltMedSecond_LicensedAcupunctureOption();
			pgRally.ClickBacktoNavigateRallyScreenArrow();
			pgRally.Click_AltMed_Message_Therapist_Link();
			// pgRally.Validate_AltMedSecond_MassageTherapyOption();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE0112_Alt_Med_speciality_Acupuncturist() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0112_Alt_Med_speciality_Acupuncturist";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.AltMed_WA_Sys5_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.RallyAltMed_closeAlertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPeopleIcon();
			pgRally.clickOnSpecialityCareIcon();
			pgRally.Validate_AltMed_AcupuncturistLinkText();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE0113_Alt_Med_speciality_Massage_therapy() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0112_Alt_Med_speciality_Acupuncturist";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.AltMed_WA_Sys5_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.RallyAltMed_closeAlertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPeopleIcon();
			pgRally.clickOnSpecialityCareIcon();
			pgRally.Validate_AltMed_MassagetherapyLinkText();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE0114_Alt_Med_speciality_Nutritionist() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0112_Alt_Med_speciality_Nutritionist";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.AltMed_WA_Sys5_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.RallyAltMed_closeAlertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.clickonPeopleIcon();
			pgRally.clickOnSpecialityCareIcon();
			pgRally.Validate_AltMed_NutritionistLinkText();

		} finally {
			this.drver.quit();
		}
	}

	@Test(enabled = true)
	public void TESTCASE0115_Alt_Med_speciality_Naturopathy() throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0112_Alt_Med_speciality_Naturopathy";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.AltMed_WA_Sys5_User, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.RallyAltMed_closeAlertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.EnterProviderSearchText("Naturopathy");
			pgRally.clickOnbtnSearchLink();
			pgRally.clickOnChangeLocationLink();

		} finally {
			this.drver.quit();
		}
	}
	
///////////////    Well Med 
	// need to update with different data - sheshu	
	
		@Test(enabled = true)
		public void TESTCASE0140_TC2_Printdirectoryfunctionality() throws Exception {
			try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0140_TC2_Printdirectoryfunctionality";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys5_UserName, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgRally.Validate_WellMedAffiliatedProviderChoice();
			
			} finally {
				this.drver.quit();
			}
		}		
		
		
	
///////////////    Provider Details Page 
	// need to update after having discussion with SHeshu	
	@Test(enabled = true)
	public void TESTCASE0132_TC02_VerifytheAboutmeinFirsttab_R() throws Exception {
		try {
		this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
		testcasename = "TESTCASE0132_TC02_VerifytheAboutmeinFirsttab_R";
		Reporter.log("Execution on Device:" + this.Browsername);
		pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
		lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
		pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
		pgHome.Rallyclosealertpopup();

		pgHome.click_on_physician_and_facilitieslink();
		pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
				this.Browsername);
// need 
		pagePhyscnFaclts.clickonfindproviderbutton();
		pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
		pgRally.validatePlaceholderMsgOnSearchtextbox();
		pgRally.clickonPeopleIcon();
		pgRally.clickonPrimaryCareIcon();
		pgRally.clickonPCPIcon();
		pgRally.clickonNewPatientFilter();
		pgRally.clickonAcceptingNewPatientOption();
		pgRally.clickOnFirstResult();
		
		//pgRally.Click_on_Identified_ProviderRecords(2);
		
		pgRally.clickonAboutMeTab();
		
	} finally {
		this.drver.quit();
	}
}
// need to update	
	@Test(enabled = true)
	public void TESTCASE0133_TC03_VerifytheServiceandCostinSecondtab_R() throws Exception {
		try {
		this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
		testcasename = "TESTCASE0133_TC03_VerifytheServiceandCostinSecondtab_R";
		Reporter.log("Execution on Device:" + this.Browsername);
		pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
		lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
		pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
		pgHome.Rallyclosealertpopup();
		pgHome.click_on_physician_and_facilitieslink();
		pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
				this.Browsername);
		pagePhyscnFaclts.clickonfindproviderbutton();
		pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
		pgRally.clickonPeopleIcon();
		pgRally.clickonPrimaryCareIcon();
		pgRally.clickonPCPIcon();
		pgRally.clickonNewPatientFilter();
		pgRally.clickonAcceptingNewPatientOption();
		pgRally.Click_on_Identified_ProviderRecords(2);
		pgRally.clickonServiceandCostTab();
		
		
	} finally {
		this.drver.quit();
	}
}
		@Test(enabled = true)
		public void TESTCASE0134_TC04_VerifytheAllLocationsinThirdtab_R() throws Exception {
			try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTCASE0134_TC04_VerifytheAllLocationsinThirdtab_R";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.Login(AppConst.Sys2_URL, AppConst.Sys2ChangePCPUser, AppConst.Password);
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pgHome.Rallyclosealertpopup();
			pgHome.click_on_physician_and_facilitieslink();
			pagePhysicianandFacilities pagePhyscnFaclts = new pagePhysicianandFacilities(this.drver, testcasename,
					this.Browsername);
			pagePhyscnFaclts.clickonfindproviderbutton();
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.validatePlaceholderMsgOnSearchtextbox();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
			pgRally.clickonNewPatientFilter();
			pgRally.clickonAcceptingNewPatientOption();
			pgRally.Click_on_Identified_ProviderRecords(2);
			pgRally.clickonAllLocationsTab();
		} finally {
			this.drver.quit();
		}
	}
		
	@Test(enabled=true)	
	public void MnR_Find_a_Provider_NoPreference_search() throws Exception {

		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "MnR_Find_a_Provider_NoPreference_search";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageLoginScreen lp = new pageLoginScreen(this.drver, testcasename, this.Browsername);
			lp.MnR_Login(AppConst.M2RACQ_URL);
			pageM2rAcqHome pgm2racr = new pageM2rAcqHome(this.drver, testcasename, this.Browsername);
			pgm2racr.clickOnFindaProviderButton();
			pageHome pgHome = new pageHome(this.drver, testcasename, this.Browsername);
			pageRallyScreen pgRally = new pageRallyScreen(pgHome.switchtorallyscreen(), testcasename, this.Browsername);
			pgRally.EnterTextZipCode("75224");
			pageM2R pgmr = new pageM2R(this.drver, this.testcasename, this.Browsername);
			pgmr.clickOnMandRContinueButton();
			pageM2rAcq pgM2RAcq = new pageM2rAcq(this.drver, this.testcasename, this.Browsername);
			pgM2RAcq.verifyplanTabsinM2RAcq();
			String planname = pgM2RAcq.getPlanName();
			System.out.println(planname);
			pgM2RAcq.clickOnM2RAcqPlan();
			pgRally.SearchbuttonIsDisplayed();
			pgRally.clickonPeopleIcon();
			pgRally.clickonPrimaryCareIcon();
			pgRally.clickonPCPIcon();
		} finally {
			this.drver.quit();
		}
		
		
	}
	
}
*/
