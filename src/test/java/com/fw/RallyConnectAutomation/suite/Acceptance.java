package com.fw.RallyConnectAutomation.suite;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.fw.RallyConnectAutomation.driverfactory.driverfactory;
import com.fw.RallyConnectAutomation.pageclass.pageICICIHome;


public class Acceptance {
	private WebDriver drver;
	public String Devicemodel = this.Browsername;
	private String Deviceid;
	private String testcasename;
	private String Browsername;
	private String WinPlatform;

	public Acceptance(String Deviceid, String Devicetype, String WinPlatform) {

		this.Deviceid = Deviceid;
		this.Browsername = Devicetype;
		this.WinPlatform = WinPlatform;
	}
	
	/***********************************************************************
	 * Text based Search
	 * 
	 * @throws Exception
	 ***********************************************************************/
	public String URL = "https://www.icicibank.com/";
	
	@Test(enabled = false)
	public void TESTSUITE01_TC01_Verify_Text_SearchBox_KeyboardEvent()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTSUITE01_TC01_Verify_Text_SearchBox_KeyboardEvent";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageICICIHome Ihome = new pageICICIHome(this.drver, testcasename, this.Browsername);
			Ihome.App_Navigate(URL);
			Ihome.KeyboardEventSearch("Credit Card");
					
					} finally {
			this.drver.quit();
		}
	}
	
	@Test(enabled = true)
	public void TESTSUITE01_TC02_Verify_MouseEvent()
			throws Exception {
		try {
			this.drver = driverfactory.getWebDriver(this.Deviceid, this.Browsername, this.WinPlatform);
			testcasename = "TESTSUITE01_TC02_Verify_MouseEvent";
			Reporter.log("Execution on Device:" + this.Browsername);
			pageICICIHome Ihome = new pageICICIHome(this.drver, testcasename, this.Browsername);
			Ihome.App_Navigate(URL);
			Ihome.MouseEvent();
					
					} finally {
			this.drver.quit();
		}
	}
	
	}
