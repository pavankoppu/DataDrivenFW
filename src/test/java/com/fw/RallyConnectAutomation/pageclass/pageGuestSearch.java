package com.fw.RallyConnectAutomation.pageclass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.fw.RallyConnectAutomation.resuable.reusableActionelib;

public class pageGuestSearch extends reusableActionelib {
	public String testcasename;
	public String Browsername;
	public pageGuestSearch(WebDriver driver, String Testname, String Browsername) {
		super(driver);
		this.testcasename=Testname;
		this.Browsername=Browsername;
	}

	  String winHandlePrevious = driver.getWindowHandle();
	
//Guest
		String Pharmacy_Directory_URL="https://www.optumrx.com/clientpharmacy/pharmacylocatorclient.asp?var=UXZE9899&infoid=UXZE9899&page=insert&par";
		String Mental_Health_Directory_URL = "https://provider.liveandworkwell.com/content/laww/cliniciansearch/en/spa.html#/provider-home";
		String Vision_Directory_URL = "https://wf.myuhcvision.com/Login.aspx?TYPE=33554433&REALMOID=06-bc5ede64-4916-4f22-95ec-0703ba5aa106&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=$SM$H9I2Zuu7hcC%2b7Kx0H1y4fLmurvzZ5JwoRIAJBIgc2EWfAfDJFJXySUZpHHzb4R%2bz&TARGET=$SM$http%3a%2f%2fwf.myuhcvision.com%2f";
		String Dental_Directory_URL ="https://uhc.secure.force.com/providersearch?portalId=dentalppo20";
		String WhatAreYouLookingText="What are you looking";
		
	public void VerifyGuestUserNavigatedtoRally() {
		try {
			cmmnFnc_ElementPresent_Verification("GuestUHCPlan_XPATH");
			Reporter.log("Navigated to Rally");
		} catch (Exception e) {
			cmmnFnc_Fail("unable to navigate to Rally" + e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	
	
	
	public void clickonState_Exchanges() {
		try {
			cmmnFnc_clickbyXPATH("GuestStateExchanges_XPATH");
			Reporter.log("State_Exchanges Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("State_Exchanges Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
	}
	
	public void clickonShopIcon() {
		try {
			cmmnFnc_clickbyXPATH("GuestSearchShop_XPATH");
			Reporter.log("Shop Icon is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Shop Icon is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
	}
	
	public void clickonIndvidual_Family() {
		try {
			cmmnFnc_clickbyXPATH("GuestIndvidualFamily_XPATH");
			Reporter.log("Indvidual_Family Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Indvidual_Family Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
	}
	
	public void clickonState_Illinois() {
		try {
			waitload(7000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			waitload(3000);
			WebDriverWait wait = new WebDriverWait(this.driver, 100);
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/plans/uhc/52']")));
			
			this.driver.findElement(By.cssSelector("a[href='/plans/uhc/52']")).click();
			
			/*WebDriverWait wait=new WebDriverWait(this.driver,100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Illinois")));
			this.driver.findElement(By.linkText("Illinois")).click();*/
			
			//a[href^='/plans/uhc/52']
			/*WebDriverWait wait=new WebDriverWait(this.driver,100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='commonList']/li/h3/a[contains(text(),'Illinois')]")));*/
			
			//cmmnFnc_clickbyXPATH("GusetSearchStateIllinois_XPATH");
			//this.driver.findElement(By.cssSelector("a[href^='/plans/uhc/52']")).click();
			
			Reporter.log("State_Illinois Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("State_Illinois Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
	}

	//GuestSearchStateIllinois_XPATH
	
	public void clickonPlan_CompassHMO() {
		try {
			cmmnFnc_clickbyXPATH("GuestSearchplanCompassHMO_XPATH");
			Reporter.log("plan_CompassHMO Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("plan_CompassHMO Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
	}


	public void verifyPlanHeader(String ExpectedPlan) throws Exception {
		try {
			String Actualplan = cmmnFnc_getTextofElement("GuestSearchplanHeaderText_XPATH");
			if (Actualplan.equalsIgnoreCase(ExpectedPlan)) {
				Reporter.log("Plan Header has been displayed correctly");
			} else {
				cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
		}
	}
	
	
	public void verifyPlan_CoreEssentialEPO_Text(String ExpectedPlan) {
		try {
			String Actualplan = cmmnFnc_getTextofElement("GuestSearchplanCoreEPO_XPATH");
			if (Actualplan.equalsIgnoreCase(ExpectedPlan)) {
				Reporter.log("Plan Header has been displayed correctly");
			} else {
				cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
		}
	}
	
	public void verifyPlan_NavigatePlus_Text(String ExpectedPlan) {
		try {
			String Actualplan = cmmnFnc_getTextofElement("GuestSearchNavigatePlusText_XPATH");
			if (Actualplan.equalsIgnoreCase(ExpectedPlan)) {
				Reporter.log("Plan Header has been displayed correctly");
			} else {
				cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
		}
	}
	
	public void verifyPlan_ChoicePlusPOS_Text(String ExpectedPlan) {
		try {
			String Actualplan = cmmnFnc_getTextofElement("GuestSearchplanHeaderChoicePlusPOSText_XPATH");
			if (Actualplan.equalsIgnoreCase(ExpectedPlan)) {
				Reporter.log("Plan Header has been displayed correctly");
			} else {
				cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
		}
	}
	
	
	public void verifyPlan_ChoiceEPO_Text(String ExpectedPlan) {
		try {
			String Actualplan = cmmnFnc_getTextofElement("GuestSearchChoiceEPO_XPATH");
			if (Actualplan.equalsIgnoreCase(ExpectedPlan)) {
				Reporter.log("Plan Header has been displayed correctly");
			} else {
				cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
		}
	}
	
	
	public void verifyPlan_ChoiceHMO_Text(String ExpectedPlan) {
		try {
			String Actualplan = cmmnFnc_getTextofElement("GuestSearchChoiceHMO_XPATH");
			if (Actualplan.equalsIgnoreCase(ExpectedPlan)) {
				Reporter.log("Plan Header has been displayed correctly");
			} else {
				cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Plan Header hasn't displayed correctly", this.testcasename, this.Browsername);
		}
	}
	

	

public void clickonPharmacy_Directory() {
	try {
		
		cmmnFnc_clickbyXPATH("GuestSearchPharmacyDirectory_XPATH");
		Reporter.log("Pharmacy_Directory Link is clicked");
	       
	} catch (Exception e) {
		cmmnFnc_Fail("Pharmacy_Directory Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonMentalHealth_Directory() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchMentalHealthDirectory_XPATH");
		Reporter.log("MentalHealthDirectory Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("MentalHealthDirectory Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonDental_Directory() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchDentalDirectory_XPATH");
		Reporter.log("Dental Directory Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("Dental Directory Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonVision_Directory() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchVisionDirectory_XPATH");
		Reporter.log("Vision Directory Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("Vision Directory Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonMedical_Directory() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchMedicalDirectory_XPATH");
		Reporter.log("Medical Directory Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("Medical Directory Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

	public void MedicalDirectoryZipTextIsDisplayed() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchMedicalDirecortyZipText_XPATH") == true) {
				Reporter.log("Enter a zip code or city in text is displayed");
			} else {
				cmmnFnc_Fail("Enter a zip code or city in text is not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Enter a zip code or city in text is not displayed" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}



public void EnterTextZipCode(String zipcode){
	try {
		waitload(4000);
		cmmnFnc_inputText("ZipCodeProperty_XPATH",zipcode);
		Reporter.log("successfully Entered the text and Text box found" );
		
	} catch (Exception e) {
		cmmnFnc_Fail("Failed to Entered the text and Text box found:"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonstate_Exchanges() {
	try {
		cmmnFnc_clickbyXPATH("GuestStateExchanges_XPATH");
		Reporter.log("State_Exchanges Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Exchanges Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonAll_UnitedHealthCare_plan() {
	try {
		cmmnFnc_clickbyXPATH("GuestAllUnitedHealthCareplan_XPATH");
		Reporter.log("All_UnitedHealthCare_plan Link is clicked");
		Thread.sleep(3000);
	} catch (Exception e) {
		cmmnFnc_Fail("All_UnitedHealthCare_plan Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonIndividual_and_Family_State_Exchangess_XPATH() {
	try {
		cmmnFnc_clickbyXPATH("GuestIndividual_and_Family_State_Exchangess_XPATH");
		Reporter.log("Individual_and_Family_State_Exchangess Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("Individual_and_Family_State_Exchangess Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Indiana() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateIndiana_XPATH");
		Reporter.log("State_Indiana Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Indiana Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Oklahoma() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateOklahoma_XPATH");
		Reporter.log("State_Oklahoma Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Oklahoma Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonState_Iowa() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateIowa_XPATH");
		Reporter.log("State_Iowa Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Iowa Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Maryland() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateMaryland_XPATH");
		Reporter.log("State_Maryland Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Maryland Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Michigan() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateMichigan_XPATH");
		Reporter.log("State_Michigan Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Michigan Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_New_Jersey() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateNew_Jersey_XPATH");
		Reporter.log("State_New_Jersey Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_New_Jersey Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Massachusetts() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateMassachusetts_XPATH");
		Reporter.log("State_Massachusetts Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Massachusetts Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_California() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateCalifornia_XPATH");
		Reporter.log("State_California Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_California Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Connecticut() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateConnecticut_XPATH");
		Reporter.log("State_Connecticut Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Connecticut Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Pennsylvania() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStatePennsylvania_XPATH");
		Reporter.log("State_Pennsylvania Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Pennsylvania Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonState_Rhode_Island() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateRhodeIsland_XPATH");
		Reporter.log("State_Rhode_Island Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Rhode_Island Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonState_Alabama() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchStateAlabama_XPATH");
		Reporter.log("State_Alabama Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("State_Alabama Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}
	


public void clickonPlan_Core_Essentials() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanCoreEssentials_XPATH");
		Reporter.log("plan_Core_Essentials Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Core_Essentials Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonPlan_Core() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanCore_XPATH");
		Reporter.log("plan_Core Link is clicked");
		Thread.sleep(2000);
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Core Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonOptions_PPO() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanOptionsPPO_XPATH");
		Reporter.log("plan_Options_PPO Link is clicked");
		Thread.sleep(2000);
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Options_PPO Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonCompass_HMO_Compassed_Balanced_HMO_Compass_Plus_HMO() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanCompassPlusHMO_XPATH");
		Reporter.log("plan_Compass_HMO_Compassed_Balanced_HMO_Compass_Plus_HMO Link is clicked");
		Thread.sleep(2000);
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Compass_HMO_Compassed_Balanced_HMO_Compass_Plus_HMO Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonChoice_Plus() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanChoicePlus_XPATH");
		Reporter.log("plan_Choice_Plus Link is clicked");
		Thread.sleep(2000);
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Choice_Plus Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonNavigate_Plus() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanNavigatePlus_XPATH");
		Reporter.log("plan_Navigate_Plus Link is clicked");
		Thread.sleep(2000);
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Navigate_Plus Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonNavigate_Plus_Pennsylvania() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchNavigatePlusPennsylvania_XPATH");
		Reporter.log("plan_Navigate_Plus Link in Pennsylvania state is clicked");
		Thread.sleep(2000);
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Navigate_Plus Link in Pennsylvania state is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}


public void clickonChoice_EPO() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanChoiceEPO_XPATH");
		Reporter.log("plan_Choice_EPO Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Choice_EPO Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonCore_Essential_EPO() {
	try {
		waitload(3000);
		cmmnFnc_clickbyXPATH("GuestSearchplanCoreEssentials_XPATH");
		Reporter.log("plan_Core_Essential_EPO Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Core_Essential_EPO Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
}

public void clickonChoice_HMO() {
	try {
		cmmnFnc_clickbyXPATH("GuestSearchplanChoiceHMO_XPATH");
		Reporter.log("plan_Choice_HMO Link is clicked");
	} catch (Exception e) {
		cmmnFnc_Fail("plan_Choice_HMO Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
	}
	
}
	public void clickonChoice_Plus_POS() {
		try {
			cmmnFnc_clickbyXPATH("GuestSearchplanChoicePlusPOS_XPATH");
			Reporter.log("plan_Choice_Plus_POS Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("plan_Choice_Plus_POS Link is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
}


public void VerificationOfCompassHMOPlanheader() {
	try {
		cmmnFnc_ElementPresent_Verification("GuestSearchplanCompassHMO_XPATH");
		Reporter.log("Plan Header is displayed in Page Rally Screen");
	} catch (Exception e) {
		cmmnFnc_Fail("Failed to validate Plan Header:"+e.toString(),this.testcasename,this.Browsername);
	}
}

	public void VerificationOfCoreEssentialsPlanheader() {
		try {
			waitload(3000);
			if (cmmnFnc_isElementPresent("GuestSearchplanHeaderCoreEssentialsText_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void VerificationOfHeritagePlusPlanheader() {
		try {
			waitload(3000);
			if (cmmnFnc_isElementPresent("GuestSearchHeritagePlusPlanHeader_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}

	public void VerificationOfCorePlanheader() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchplanHeaderCore_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}

	public void VerificationOfCompassPlusHMOPlanheader() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchplanHeaderCompassPlusHMOText_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}

	public void VerificationOfChoicePlusPlanheader() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchplanHeaderChoicePlusText_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}


	public void VerificationOfOptionsPPOPlanheader() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchplanHeaderOptionsPPOText_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}

	public void VerificationOfNavigatePlusPlanheader(String Expected) {
		try {
			if (cmmnFnc_getTextofElement("GuestSearchplanHeaderNavigatePlusText_XPATH").equalsIgnoreCase(Expected)) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void VerifyChangePlanText() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchChangePlan_XPATH") == true) {
				Reporter.log("Change Plan Text is present");
			} else {
				cmmnFnc_Fail("Change Plan Text is not present", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Change Plan Text is not present" + e.toString(), this.testcasename, this.Browsername);
		}
	}

	
	public void clickonContinue_Button() {
		try {
			cmmnFnc_clickbyXPATH("GuestSearchContinueButton_XPATH");
			Reporter.log("Continue Button is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Continue button is not clicked"+e.toString(),this.testcasename,this.Browsername);
}
	}		

	public void VerifyTextUnderPepoleicon() {
		try {
			waitload(3000);
			if (cmmnFnc_isElementPresent("GuestSearchPeople_XPATH") == true) {
				Reporter.log("Doctors and other professionals by specialty is present");
			} else {
				cmmnFnc_Fail("Doctors and other professionals by specialty is not present", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Doctors and other professionals by specialty is not present" + e.toString(),
					this.testcasename, this.Browsername);
		}
	}

	public void VerifyTextUnderPlacesicon() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchPlaces_XPATH") == true) {
				Reporter.log("Hospitals, clinics, labs, imaging centers is present");
			} else {
				cmmnFnc_Fail("Hospitals, clinics, labs, imaging centers is not present", this.testcasename,
						this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Hospitals, clinics, labs, imaging centers is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
		
	public void VerifyTextUnderTextandImgaesicon() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchTestsandImaging_XPATH") == true) {
				Reporter.log("Lab tests, screenings, X-rays, scans is present");
			} else {
				cmmnFnc_Fail("Lab tests, screenings, X-rays, scans is not present", this.testcasename,
						this.Browsername);
			}
			Reporter.log("Lab tests, screenings, X-rays, scans is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Lab tests, screenings, X-rays, scans is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
		
		
	public void VerifyTextUnderCareByConditionicon() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchCarebyCondition_XPATH") == true) {
				Reporter.log("Find care for common concerns is present");
			} else {
				cmmnFnc_Fail("Find care for common concerns is not present", this.testcasename, this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Find care for common concerns is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}

	public void VerifyTextUnderServicesAndTreatments() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchServicesandTreatments_XPATH") == true) {
				Reporter.log("Office visits, tests, treatments, surgeries is present");
			} else {
				cmmnFnc_Fail("Office visits, tests, treatments, surgeries is not present", this.testcasename,
						this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("Office visits, tests, treatments, surgeries is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	

	public void InWhichStateTextIsDisplayed() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchWhichState_XPATH") == true) {
				Reporter.log("In which state do you live? Text has displayed");
			} else {
				cmmnFnc_Fail("In which state do you live? Text hasn't displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {

			cmmnFnc_Fail("In which state do you live? Text hasn't displayed" + e.toString(), this.testcasename,
					this.Browsername);
		}

	}
	
	
	public void SelectPlan(String Planname) throws Exception
	{
		waitload(5000);
		List<WebElement> planlist=cmmFnc_ReturnList("GuestSearchList_XPATH");
		System.out.println(planlist.size());
		/*Thread.sleep(10000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitload(3000);
		jse.executeScript("window.scrollBy(0,250)", "");
		waitload(3000);
		jse.executeScript("window.scrollBy(0,250)", "");
		waitload(3000);*/
		
		for(int plan=0;plan<planlist.size();plan++){
			if(planlist.get(plan).getText().trim().equalsIgnoreCase(Planname)){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", planlist.get(plan));
				break;
			}
		}
		
	}
	
	public void SelectUHCPlan(String UHCPlan) throws Exception
	{
		waitload(5000);
		List<WebElement> planlist=cmmFnc_ReturnList("GuestAllUHCPlansState_XPATH");
	
		System.out.println(planlist.size());
		
		for(int plan=0;plan<planlist.size();plan++){
			System.out.println(planlist.get(plan).getText());
			if(planlist.get(plan).getText().trim().equalsIgnoreCase(UHCPlan)){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", planlist.get(plan));
				break;
			}
		}
		
	}
	
	public void SelectUHCPlan1(String UHCPlan) throws Exception
	{
		waitload(5000);
		List<WebElement> planlist=cmmFnc_ReturnList("GuestAllUHCPlansState1_XPATH");
	
		System.out.println(planlist.size());
		
		for(int plan=0;plan<planlist.size();plan++){
			System.out.println(planlist.get(plan).getText());
			if(planlist.get(plan).getText().trim().equalsIgnoreCase(UHCPlan)){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", planlist.get(plan));
				break;
			}
		}
		
	}
	
	
	public void clickonCurrentProvidersLink() {
		try {
			cmmnFnc_clickbyXPATH("ProvidersCurrently_XPATH");
			Reporter.log("Current provider link has been clciked");
		} catch (Exception e) {
			cmmnFnc_Fail("Current provider link hasn't been clciked", testcasename, this.Browsername);
		}
	}
	
	
	
	
	
	public void SelectState(String Statename) throws Exception
	{
		List<WebElement> planlist=cmmFnc_ReturnList("GuestStateList_XPATH");
		System.out.println(planlist.size());
		/*Thread.sleep(10000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitload(3000);
		jse.executeScript("window.scrollBy(0,250)", "");
		waitload(3000);
		jse.executeScript("window.scrollBy(0,250)", "");
		waitload(3000);*/
		
		for(int plan=0;plan<planlist.size();plan++){
			if(planlist.get(plan).getText().trim().equalsIgnoreCase(Statename)){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", planlist.get(plan));
				break;
			}
		}
		
	}

	public void verifyWhatAreYouLookingTextIsPresent() {
		try {
			if (cmmnFnc_getTextofElement("GuestSearchWhatareYouLookingText_XPATH").trim()
					.contains(WhatAreYouLookingText)) {
				Reporter.log("What are you looking for in California Text got displayed");
			} else {
				cmmnFnc_Fail("What are you looking for in California Text is not displayed", this.testcasename,
						this.Browsername);
			}

		} catch (Exception e) {
			cmmnFnc_Fail("What are you looking for in California Text is not displayed"+e.toString(), this.testcasename,
					this.Browsername);
		}

	}
	
	public void Verification_OfCompassPlus_Planheader() {
		try {
			if (cmmnFnc_isElementPresent("GuestSearchplanHeaderCompassPlusText_XPATH") == true) {
				Reporter.log("Plan Header is displayed in Page Rally Screen");
			} else {
				cmmnFnc_Fail("Failed to validate Plan Header:", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			cmmnFnc_Fail("Failed to validate Plan Header:" + e.toString(), this.testcasename, this.Browsername);
		}
	}
	
		
	public void SwitchToPrviousScreen() {
		this.driver.close();
		Set<String> windows = this.driver.getWindowHandles();
		System.out.println(windows.size());

		Iterator<String> itr = windows.iterator();
		String Parentwindow = itr.next();
		String Childwindow = itr.next();
		driver.switchTo().window(Childwindow);
	}

}
