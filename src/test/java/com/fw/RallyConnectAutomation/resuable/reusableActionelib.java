package com.fw.RallyConnectAutomation.resuable;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.fw.RallyConnectAutomation.driverfactory.driverfactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reusableActionelib {

	public WebDriver driver;
	public WebDriverWait wd;
	// public static String AppURL;
	public static String USERNAME;
	public static String PASSWORD;
	public SoftAssert soft_Assert = new SoftAssert();

	public reusableActionelib(WebDriver driver) {
		try {
			this.driver = driver;
			this.wd = new WebDriverWait(this.driver, 200);
		} catch (Exception e) {

		}
	}

	//public String URL = "https://www.icicibank.com/";
	
//Browser functions
	public void launchUrl(String URL) {

		driver.get(URL);
		Reporter.log(URL + "has been launched");
	}
	public void closebrowser() {

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browsername = cap.getBrowserName();
		System.out.println(browsername);
		Map<String, Object> params = new HashMap();
		params.put("name", browsername);
		((RemoteWebDriver) driver).executeScript("mobile:application:close", params);

	}
	public String getWindowTitle() {
		return driver.getTitle();
	}
	public void SetBrowserSize() {
		driver.manage().window().setSize(new Dimension(600, 400));
	}
	public void waitload(long timevalue) throws Exception
	{
		Thread.sleep(timevalue);
	}
	
	
	
//Handling Link
	public Boolean cmmnFnc_clickonlink(String lnktext) {

		wd.until(ExpectedConditions.elementToBeClickable(By.linkText(lnktext)));
		try {
			driver.findElement(By.linkText(lnktext)).click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

//Handling Text Box	
	public Boolean cmmnFnc_sendkeysbyID(String id, String text) {

		try {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(text);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public void cmmnFnc_inputText(String element, String type, String inputvalue) {

		if (type.equalsIgnoreCase("ID") == true) {
			driver.findElement(By.id(element)).clear();
			driver.findElement(By.id(element)).sendKeys(inputvalue);
			Reporter.log(element + "has been Found");
		}
		if (type.equalsIgnoreCase("XPATH") == true) {
			driver.findElement(By.xpath(element)).clear();
			driver.findElement(By.xpath(element)).sendKeys(inputvalue);
			//Reporter.log(element + "has been Found");
		}
		if (type.equalsIgnoreCase("LINKTEXT") == true) {
			driver.findElement(By.linkText(element)).clear();
			driver.findElement(By.linkText(element)).sendKeys(inputvalue);
			Reporter.log(element + "has been Found");
		}
	}
	public void cmmnFnc_inputText(String element_Locator, String inputvalue) throws IOException {

		String element = prop(element_Locator);
		String[] arr = element_Locator.split("_");
		// String element= arr[0];
		String type = arr[1];
		
		if (type.contains("ID") == true) {
			driver.findElement(By.id(element)).clear();
			driver.findElement(By.id(element)).sendKeys(inputvalue);
			Reporter.log(element + "has been Found");
		}
		if (type.contains("XPATH") == true) {
			wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
			
			driver.findElement(By.xpath(element)).clear();
			driver.findElement(By.xpath(element)).sendKeys(inputvalue);
			Reporter.log(element + "has been Found");
		}
		if (type.contains("LINKTEXT") == true) {
			driver.findElement(By.linkText(element)).clear();
			driver.findElement(By.linkText(element)).sendKeys(inputvalue);
			Reporter.log(element + "has been Found");
		}
	}

//Handling Buttons	
	public void cmmnFnc_clickbyid(String id) {
        WebDriverWait wd = new WebDriverWait(driver, 120);
        wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(id)));
            driver.findElement(By.id(id)).click();
      }
	public void cmmnFnc_clickbyXPATH_EnterKey(String xpath) throws Exception {
		//xpath = prop(xpath);
		WebDriverWait wd = new WebDriverWait(driver, 150);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}
	public void cmmnFnc_clickbyXPATH(String xpath) throws Exception {
		//xpath = prop(xpath);
		WebDriverWait wd = new WebDriverWait(driver, 150);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();
	}
	public Boolean cmmnFnc_clickbyCSS(String css) {
		WebDriverWait wd = new WebDriverWait(driver, 90);
		try {
			wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(css)));
			driver.findElement(By.cssSelector(css)).click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
//Handling Action Class	
	public void cmmnFnc_clickbyXPATH_ActionClass(String xpath) throws Exception {
		//xpath = prop(xpath);
		WebDriverWait wd = new WebDriverWait(driver, 150);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		Actions myaction=new Actions(driver);
		
		  myaction.moveToElement(driver.findElement(By.xpath(xpath))).perform();
		  myaction.click();
		  myaction.perform();	
		}
	
	public void cmmnFnc_doubleclickByXpath_ActionClass(String xpath) throws Exception
	{
		//xpath = prop(xpath);
		WebDriverWait wd = new WebDriverWait(driver, 60);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).doubleClick().build().perform();
	}
	public void cmmnFnc_moveToElement_ClickbyLink_ActionClass(String link) throws Exception {
		//xpath = prop(xpath);
		WebDriverWait wd = new WebDriverWait(driver, 150);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(link)));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText(link))).click().build().perform();
		}
	public void cmmnFnc_moveToElement_mouseover(String xpathloc) throws InterruptedException {
		// Mouse Over and Clicking the element inside the list.
		WebDriverWait wd = new WebDriverWait(driver, 150);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathloc)));
		WebElement newsobj = driver.findElement(By.xpath(xpathloc));
		Actions actobj = new Actions(driver);
		//actobj.keyDown(Keys.CONTROL).click(newsobj);
		//actobj.keyUp(Keys.CONTROL);

		actobj.moveToElement(newsobj).perform();
	}
	
//Field Validations
	public boolean cmmnFnc_isFieldExist(String locator, String elementidentifier) {
		try {

			if (locator.equalsIgnoreCase("ID")) {
				wd.until(ExpectedConditions.presenceOfElementLocated(By.id(elementidentifier)));

			}

			else if (locator.equalsIgnoreCase("xpath")) {
				wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementidentifier)));

			} else if (locator.equalsIgnoreCase("classname")) {
				wd.until(ExpectedConditions.presenceOfElementLocated(By.className(elementidentifier)));

			}

			return true;
		} catch (Exception e) {
			return false;
		}

	}
	public boolean cmmnFnc_isFieldExist(String element_Locator) {
		try {

			String element = prop(element_Locator);
			String[] arr = element_Locator.split("_");
			// String element= arr[0];
			String locator = arr[1];

			if (locator.contains("ID")) {
				wd.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));

			}

			else if (locator.contains("XPATH")) {
				wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));

			} else if (locator.contains("classname")) {
				wd.until(ExpectedConditions.presenceOfElementLocated(By.className(element)));

			}

			return true;
		} catch (Exception e) {
			return false;
		}

	}
	public boolean cmmnFnc_TextMatch(String elementXpath, String ActualText) throws Exception {

		elementXpath = prop(elementXpath);

		WebDriverWait wd = new WebDriverWait(driver, 120);

		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
		String textval = driver.findElement(By.xpath(elementXpath)).getText();
		if (textval.trim().equalsIgnoreCase(ActualText)) {
			Reporter.log("Element is Present. Actual value is: " + textval);
			return true;
		} else {
			Reporter.log("Element is not Present. Actual value is: " + textval);
			return false;
		}
	}
	public void cmmnFnc_TextVaidation(String elementXpath, String ActualText) throws Exception {
		elementXpath = prop(elementXpath);
		WebDriverWait wd = new WebDriverWait(driver, 90);

		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
		String textval = driver.findElement(By.xpath(elementXpath)).getText();
		if (textval.trim().contains(ActualText)) {

			Reporter.log("Element is Present. Actual value is: " + textval);
		} else {
			
			Reporter.log("Element is Present. Actual value is: " + textval);
		}
	}
	public boolean cmmnFnc_ElementPresent_Verification(String elementXpath) throws Exception {
		
		WebDriverWait wd = new WebDriverWait(driver, 120);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
		if (driver.findElement(By.xpath(elementXpath)).isDisplayed() == true) {
			Reporter.log("Element is present");
			return true;
		} else {
			Reporter.log("Element is not present");
			return false;
		}
	}
	
//Handling WebElement	
	public WebElement cmmnFnc_FindElement(String element) throws InterruptedException {
		// type=type.toUpperCase();

		String[] arr = element.split("_");
		System.out.println(arr[1]);
		WebElement we = null;
		if (arr[1].equalsIgnoreCase("ID") == true) {
			System.out.println("ID ELement is Identified");
			we = driver.findElement(By.id(arr[0]));
		}
		if (arr[1].equalsIgnoreCase("XPATH") == true) {
			System.out.println("XPATH ELement is Identified");
			we = driver.findElement(By.xpath(arr[0]));
		}
		if (arr[1].equalsIgnoreCase("LINKTEXT") == true) {
			System.out.println("LINKTEXT ELement is Identified");
			we = driver.findElement(By.linkText(arr[0]));
		}
		return we;
	}
	public String cmmnFnc_getTextofElement(String xpath) throws Exception {
		WebDriverWait wd = new WebDriverWait(driver, 90);
		wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		return driver.findElement(By.xpath(xpath)).getText();
	}
	public List<WebElement> cmmFnc_ReturnList(String xpath) throws Exception {
		WebDriverWait wd = new WebDriverWait(driver, 90);
		wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		return driver.findElements(By.xpath(xpath));
	}
	public boolean cmmnFnc_elementPresent(String Elementxpath) throws Exception {
		if (this.driver.findElement(By.xpath(Elementxpath)).isDisplayed() == true) {
			return true;
		} else {
			return false;
		}
	}
	public boolean cmmnFnc_isElementPresent(String elementXpath) throws Exception {
	          try {
	            WebDriverWait wd = new WebDriverWait(driver, 100);
	            wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By
	                    .xpath(elementXpath)));
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	 
	    }
	public boolean cmmnFnc_ParitialTextMatch(String elementXpath, String ActualText) throws Exception {
		elementXpath = prop(elementXpath);

		WebDriverWait wd = new WebDriverWait(driver, 90);

		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
		String textval = driver.findElement(By.xpath(elementXpath)).getText();

		if (textval.trim().contains(ActualText)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean cmmnFnc_ElementIsVisable(String elementXpath) throws Exception {
		elementXpath = prop(elementXpath);

		try {
			WebDriverWait wd = new WebDriverWait(driver, 40);
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public void cmmnFnc_clickbyXPATH_JS(String xpath) throws Exception {
		xpath = prop(xpath);
		WebDriverWait wd = new WebDriverWait(driver, 135);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", xpath);
		//driver.findElement(By.xpath(xpath)).click();
	}
 	
//Handling Alertbox	
	public Boolean cmmnFnc_Alert() {
		try {
			Alert alertObj = driver.switchTo().alert(); 
			//(Alert) driver.switchTo().activeElement().findElement(By.cssSelector(css));
			alertObj.accept();
			Thread.sleep(5000);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
//Handling ListBox	
	
	public void cmmnFnc_listboxCheck_unselectedItems(String elementXpath) throws IOException {
		//elementXpath = prop(elementXpath);

		List<WebElement> lstele = driver.findElements(By.xpath(elementXpath));
		int sizeval = lstele.size();

		for (int t = 0; t < sizeval; t++) {
			if (lstele.get(t).isSelected() == false && lstele.get(t).isEnabled() == true) {
				lstele.get(t).click();
			}
		}
	}
	public void cmmnFnc_listboxCheck(String elementXpath, int indexvalue) throws IOException {
		//elementXpath = prop(elementXpath);
		List<WebElement> lstele = driver.findElements(By.xpath(elementXpath));
		int sizeval = lstele.size();
		lstele.get(indexvalue).click();
		}
	public boolean cmmnFnc_listboxIndexCheck(String XPATH, int index) {
		try {
			List<WebElement> lstele = driver.findElements(By.xpath(XPATH));
			if (lstele.get(index).isSelected() == false && lstele.get(index).isEnabled() == true) {
				lstele.get(index).click();
			}
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	public void cmmnFnc_Select(String element, String valueToBeSeleted) throws InterruptedException {

		WebElement we = cmmnFnc_FindElement(element);

		// Select Code
		String arr1[] = valueToBeSeleted.split("_");
		if (arr1[1].equalsIgnoreCase("INDEX") == true) {
			Select selobj = new Select(we);
			int indexval = Integer.parseInt(valueToBeSeleted);
			selobj.selectByIndex(indexval);
		}
		if (arr1[1].equalsIgnoreCase("VALUE") == true) {
			Select selobj = new Select(we);
			selobj.selectByValue(arr1[0]);
		}
		if (arr1[1].equalsIgnoreCase("VisibleText") == true) {
			Select selobj = new Select(we);
			selobj.selectByVisibleText(arr1[0]);
		}
	}

//Handling Properties File
	// ********************** Properties Method for any file given in parameters
	public String propertiesValue(String returnval, String filename) throws IOException {

		Properties prop = new Properties();
		File fle = new File("target/classes/testdata/" + filename + ".Properties");
		// "target/classes/testdata/Validation.Properties");
		InputStream fis = new FileInputStream(fle);

		prop.load(fis);
		String returnval1 = prop.getProperty(returnval);

		return returnval1;
	}
	// ********************** Properties Method for Shared Object Repositories
	public String prop(String key) throws IOException {
		Properties prop = new Properties();
		File fle = new File("src/test/java/com/fw/RallyConnectAutomation/ElementCollection/ObjRepo.Properties");		
		
		InputStream fis = new FileInputStream(fle);
		prop.load(fis);
		String returnval = prop.getProperty(key);
		return returnval;
	}

//Handling Time zone and Date	
	// *************************** Time Zone
	public void timeZone() {

		DateFormat DF = DateFormat.getDateTimeInstance();
		DF.setTimeZone(TimeZone.getTimeZone("CST"));
		String DateVal = DF.format(new Date());
		System.out.println("Time in CST is :- " + DateVal);
	}

//Handling Screenshot
	public void cmmnFnc_capturescreenShot(String TestName,String browsername) {
		try {
			
			File f= new File("target/Screenshots/"+browsername);
			if (f.exists()){
				
			}
			else
			{
				f.mkdir();
				}
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			File source = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,
					new File("target/Screenshots/"+browsername +"/"+ TestName + "_"+timestamp+".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void cmmnFnc_Fail(String msg, String testcasename, String browsername){
		
		cmmnFnc_capturescreenShot(testcasename, browsername);
		Assert.fail(msg);
		
	}

//Get Attribute of the Element
	public String cmmnFnc_getAttribute(String elementXpath, String Attribute) throws Exception {

		//elementXpath = prop(elementXpath);
		WebDriverWait wd = new WebDriverWait(driver, 150);

		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
		String textval = driver.findElement(By.xpath(elementXpath)).getAttribute(Attribute);
		return textval;
	}
			
// Handling List Validation
	public void appFnc_AutoCompleteListValidation(String elementXpath, String EnteredText) throws Exception {

		//elementXpath = prop(elementXpath);
		WebDriverWait wd = new WebDriverWait(driver, 100);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
		List<WebElement> searchlist = driver.findElements(By.xpath(elementXpath));

		for (WebElement auto : searchlist) {
			if (auto.getText().trim().contains(EnteredText)) {
				Reporter.log(auto.getText().trim() + "contains the value::" + EnteredText);
			} else {
				Reporter.log(auto.getText().trim() + "contains the value::" + EnteredText);
			}
		}
	}
	public boolean cmmnFnc_List_VerificationWithSameText(String elementXpath, String EnteredText)
			throws InterruptedException {

		WebDriverWait wd = new WebDriverWait(driver, 100);
		try {
			wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(elementXpath)));
			List<WebElement> searchlist = driver.findElements(By.xpath(elementXpath));
			for (int list = 0; list < searchlist.size(); list++) {
				if (searchlist.get(list).getText().trim().equalsIgnoreCase(EnteredText)) {
					System.out.println("Text matched");
				}
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return false;
	}

//Handling DropDown boxes
	public void cmmnFnc_DropdownHandling(String element, String valueToBeSeleted, String value) throws Exception {

		//element=prop(element);
		WebElement we = driver.findElement(By.xpath(element));

		// Select Code

		if (valueToBeSeleted.equalsIgnoreCase("INDEX") == true) {
			Select selobj = new Select(we);
			int indexval = Integer.parseInt(value);
			selobj.selectByIndex(indexval);
		}
		if (valueToBeSeleted.equalsIgnoreCase("VALUE") == true) {
			Select selobj = new Select(we);
			selobj.selectByValue(value);
		}
		if (valueToBeSeleted.equalsIgnoreCase("VisibleText") == true) {
			Select selobj = new Select(we);
			selobj.selectByVisibleText(value);
		}
	}
	public void cmmnFnc_defaultDropdownValue(String element, String expectedvalue) throws InterruptedException, IOException {
				
		WebDriverWait wd = new WebDriverWait(driver, 100);
		wd.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(element)));
		WebElement we = driver.findElement(By.xpath(element));
		System.out.println("Element found");

		Select selobj = new Select(we);
		String ActualText = selobj.getFirstSelectedOption().getText().trim();

		if (ActualText.equalsIgnoreCase(expectedvalue)) {
			System.out.println("Text is matched");
			
		} else {
			System.out.println("Text is not matched");
			
		}
	}

//Page Navigation
	
	public void appFnc_PageNavigation(String NoOfsearchResultElement, String totalpages, String ListofElementsineachpage,
			String forword, String actualtext) throws InterruptedException {
		WebDriverWait wd = new WebDriverWait(driver, 100);
		wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(NoOfsearchResultElement))));

		String pagecount = driver.findElement(By.xpath(totalpages)).getText();
		System.out.println(pagecount);
		int lastpagecount = Integer.parseInt(pagecount.substring(pagecount.lastIndexOf(" ") + 1));
		System.out.println(lastpagecount);

		for (int page = 1; page <= lastpagecount - 1; page++) {
			List<WebElement> pageresults = driver.findElements(By.xpath(ListofElementsineachpage));

			System.out.println(pageresults.size());

			for (int pageresultsvalues = 1; pageresultsvalues <= pageresults.size(); pageresultsvalues++) {
				// String pageresultsvalue =
				// driver.findElement(By.xpath(ListofElementsineachpage+"["+String.valueOf(pageresultsvalues)+"]")).getText();
				String pageresultsvalue = driver
						.findElement(By
								.xpath("(//div[@class='result outer-container']/div[2]/h2)[" + pageresultsvalues + "]"))
						.getText();

				if (pageresultsvalue.toLowerCase().trim().contains("car")) {
					System.out.println(
							"PASS - " + pageresultsvalue + " is matched with the Search Keyword ::" + " " + actualtext);
				} else {
					System.out.println("FAIL - " + pageresultsvalue + " is not matched with the Search Keyword ::" + " "
							+ actualtext);
				}
			}
			if (driver.findElement(By.xpath(forword)).isEnabled()) {
				System.out.println("Forward button is displayed");
				driver.findElement(By.xpath("//button[contains(@ng-click,'goForward')]")).click();
				Thread.sleep(5000);
			} else {
				System.out.println("Forward button is not displayed");
			}
		}
	}
	public boolean cmmnFnc_clickonElement_AutoComplete_List(String elementXpath, int index) {

		try {
			List<WebElement> searchlist = driver.findElements(By.xpath(elementXpath));
			for (int i = 0; i < searchlist.size(); i++) {
				System.out.println(searchlist.get(i).getText());
			}

			System.out.println(searchlist.size());

			// searchlist.get(index).click();
			// System.out.println(searchlist.get(0).getText());

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", searchlist.get(index));

			// searchlist.get(0).click();

			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return false;
	}

// Textbased search validation	
	public void appFnc_TestSearchList(String ListofSearchPage, String actualtext) throws InterruptedException {

		for (int page = 1; page <= 1; page++) {
			List<WebElement> pageresults = driver.findElements(By.xpath(ListofSearchPage));
			for (int pageresultsvalues = 1; pageresultsvalues <= 1; pageresultsvalues++) {
				String pageresultsvalue = driver.findElement(By.xpath("(//div[@class='result outer-container']/div[2]/h2)[" + pageresultsvalues + "]")).getText();
				if (pageresultsvalue.trim().contains(actualtext)) {
					System.out.println("Text conatins the value");
				} else {
					soft_Assert.fail();
				}
			}
		}
	}

//Handling Windows 
    public void SwitchToPreviousScreen() {
		this.driver.close();
		Set<String> windows = this.driver.getWindowHandles();
		System.out.println(windows.size());

		Iterator<String> itr = windows.iterator();
		String Parentwindow = itr.next();
		String Childwindow = itr.next();
		driver.switchTo().window(Childwindow);
	}
    
 //Handling Robot Class    
 
    public void WindowBasedPopupRobotClass() throws Exception {
		Robot rb = new Robot();
		waitload(3000);
		rb.keyPress(KeyEvent.VK_ESCAPE);
		waitload(3000);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
	}

}


