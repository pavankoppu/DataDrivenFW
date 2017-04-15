package com.fw.RallyConnectAutomation.driverfactory;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

import com.fw.RallyConnectAutomation.pageclass.AppConst;
import com.fw.RallyConnectAutomation.suite.Acceptance;

public class driverfactory {

	
	static String URL = SauceLabConnectivity("skuma56","a1355ecb-e3ce-4790-b7a9-40c46488f81a");
	

	// ************ Sauce Lab Connectivity Method
	@Parameters({ "USERNAME", "ACCESS_KEY" })
	public static String SauceLabConnectivity(String USERNAME, String ACCESS_KEY) {
		String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		return URL;
	}

	// @purpose: Purpose of this method is to return the driver object with
	// particular device id
	public static WebDriver getWebDriver(String deviceID, String browsertype, String WinPlatform)
			throws UnsupportedEncodingException, MalformedURLException {

		String[] arr = browsertype.split("_");
		browsertype = arr[0];
		String browserVersion = arr[1];

		if (deviceID.equalsIgnoreCase("desktop")) {
			DesiredCapabilities caps = null;
			if (browsertype.contains("firefox")) {
				caps = DesiredCapabilities.firefox();
			} else if (browsertype.contains("chrome")) {
				caps = DesiredCapabilities.chrome();
			} else if (browsertype.contains("ie")) {
				caps = DesiredCapabilities.internetExplorer();
			}

			caps.setCapability("platform", WinPlatform);
			caps.setCapability("version", browserVersion);
			caps.setCapability("maxDuration", 10800);
			caps.setCapability("avoidProxy", true);
			caps.setCapability("autoAcceptAlerts", true);
			// caps.setCapability("idleTimeout", 600);

			WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
			driver.manage().window().maximize();
			return driver;
		}
		
		else if (deviceID.equalsIgnoreCase("local")) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		return null;
	}
}