package com.fw.RallyConnectAutomation.pageclass;

import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.fw.RallyConnectAutomation.resuable.reusableActionelib;

public class pageGuidedSearch extends reusableActionelib{

	public String testcasename;
	public String Browsername;
	public pageGuidedSearch(WebDriver driver, String Testname, String Browsername) {
		super(driver);
		this.testcasename=Testname;
		this.Browsername=Browsername;
	}
//Guided
	
	public void VerifyTextUnderPepoleicon(String ExpectedText) {
		try {
			cmmnFnc_TextVaidation("DoctotsText_XPATH", ExpectedText);
			Reporter.log("Doctors and other professionals by specialty is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Doctors and other professionals by specialty is not present" + e.toString(),
					this.testcasename, this.Browsername);
		}
	}

	public void VerifyTextUnderPlacesicon(String ExpectedText) {
		try {
			cmmnFnc_TextVaidation("PlacesText_XPATH", ExpectedText);
			Reporter.log("Hospitals, clinics, labs, imaging centers is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Hospitals, clinics, labs, imaging centers is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	public void VerifyTextUnderTextandImgaesicon(String ExpectedText) {
		try {
			cmmnFnc_TextVaidation("TestsandImaging_XPATH", ExpectedText);
			Reporter.log("Lab tests, screenings, X-rays, scans is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Lab tests, screenings, X-rays, scans is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	//Office visits, tests, treatments, surgeries
	public void VerifyTextUnderCareByConditionicon(String ExpectedText) {
		try {
			cmmnFnc_TextVaidation("CareByCondition_XPATH", ExpectedText);
			Reporter.log("Find care for common concerns is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Find care for common concerns is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	public void VerifyTextUnderServicesAndTreatments(String ExpectedText) {
		try {
			cmmnFnc_TextVaidation("ServicesandTreatments_XPATH", ExpectedText);
			Reporter.log("Office visits, tests, treatments, surgeries is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Office visits, tests, treatments, surgeries is not present" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	public void clickOnSpeciality()
	{
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			waitload(3000);
			cmmnFnc_clickbyXPATH("SpecialityDrop_XPATH");
			Reporter.log(" Speciality filter button is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Speciality filter button is clicked" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}
	
	
	
	public void selectFirstListOfSpecialityResults() {
		try {
			waitload(5000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			waitload(3000);
			cmmnFnc_clickbyXPATH("SpecialityResultFirst_XPATH");
			Reporter.log("SpecialityFirstResult checkbox is selected");
		} catch (Exception e) {
			cmmnFnc_Fail("SpecialityFirstResult checkbox is not selected" + e.toString(), this.testcasename,
					this.Browsername);
		}
	}

	public void refineResultsVerification() throws Exception {
		String ResultString = cmmnFnc_getTextofElement("SpecialityResultFirst_XPATH");
		String resultString = ResultString.replaceAll("\\P{L}", " ");
		Thread.sleep(4000);
		System.out.println(resultString);
		List<WebElement> RefineResult = cmmFnc_ReturnList("SpecialityResults_XPATH");
		System.out.println(RefineResult.size());
		boolean test = false;

		for (int i = 0; i < RefineResult.size(); i++) {
			String actual = RefineResult.get(i).getText();
			System.out.println(actual);
			String[] results = actual.split(",");
			System.out.println(results.length);
			for (int j = 0; j < results.length; j++) {
				System.out.println(results[j].trim());
				if (results[j].trim().equalsIgnoreCase(resultString.trim())) {
					test = true;
					break;
				} else {
					test = false;
				}
			}
			if (test == true) {
				Reporter.log("Correct Refine Results are displayed");
			} else {
				cmmnFnc_Fail("Incorrect Refine Results are displayed", this.testcasename, this.Browsername);
			}
		}
	}	
	public void verifyMedicalTileUnderPeople() {
		try {
			cmmnFnc_ElementPresent_Verification("UHCWestMedicalIcon_XPATH");
			Reporter.log("Medical group icon is present");
		} catch (Exception e) {
			cmmnFnc_Fail("Medical group icon is not present" + e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void clickOnConvenienceClinicLink()
	{
		try {
			cmmnFnc_clickbyXPATH("ConvenienceClinic_XPATH");
			Reporter.log("Convenience Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Convenience Link is not clicked"+e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void clickOnUrgentCareClinic()
	{
		try {
			cmmnFnc_clickbyXPATH("UrgentCareClinic_XPATH");
			Reporter.log("UrgentCareClinic link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("UrgentCareClinic link is not clicked"+e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void verifySearchResultsForConvenienceClinicLink() {
		try {
			Thread.sleep(4000);
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("ConvenienceClinic results are displyed");
			} else {
				cmmnFnc_Fail("ConvenienceClinic results are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("ConvenienceClinic results are not displayed" + e.toString());
		}
	}
	
	public void verifySearchResultsForUrgentCareClinicLink() {
		try {
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("ConvenienceClinic results are displyed");
			} else {
				cmmnFnc_Fail("ConvenienceClinic results are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("ConvenienceClinic results are not displayed" + e.toString());
		}
	}
	
	public void verifySearchResultsForPlace_SpecialityCenter() {
		try {
			waitload(4000);
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SpecialityCenterResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("SpecialityCenter results are displyed");
			} else {
				cmmnFnc_Fail("SpecialityCenter results are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("SpecialityCenter results are not displayed" + e.toString());
		}
	}
	
	
	public void verifySearchResultsForMedicalSuppliers() {
		try {
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("MedicalSuppliers results are displyed");
			} else {
				cmmnFnc_Fail("MedicalSuppliers results are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("MedicalSuppliers results are not displayed" + e.toString());
		}
	}
	
	public void verifySearchResultsForTestsandImaging_ImageXRayetc() {
		try {
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("MedicalSuppliers results are displyed");
			} else {
				cmmnFnc_Fail("MedicalSuppliers results are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("MedicalSuppliers results are not displayed" + e.toString());
		}
	}
	
	
	
	public void clickonPeople_SpecialityCareResult() {
		try {
			cmmnFnc_clickbyXPATH("SpecialityCareFirstResult_XPATH");
			Reporter.log("SpecialityCareFirstResult Link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("SpecialityCareFirstResult is not clicked"+e.toString(),this.testcasename,this.Browsername);
		}
	}
	
	
	public void verifySearchResultsForServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctor() {
		try {
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("SearchResults For ServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctor are displyed");
			} else {
				cmmnFnc_Fail("SearchResults For ServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctor are not displayed", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("SearchResults For ServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctor are not displayed" + e.toString());
		}
	}
	
	
	//ServiceAndTreatmentsOfficeVisitsSickVisit_XPATH
	
	
	public void clickOnServiceAndTreatments_OfficeVisits_SickVisit()
	{
		try {
			cmmnFnc_clickbyXPATH("ServiceAndTreatmentsOfficeVisitsSickVisit_XPATH");
			Reporter.log("ServiceAndTreatmentsOfficeVisitsSickVisit link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("ServiceAndTreatmentsOfficeVisitsSickVisit link is not clicked"+e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	
	public void clickOnServiceAndTreatments_OfficeVisits_SickVisit_FamilyDoctors()
	{
		try {
			cmmnFnc_clickbyXPATH("ServiceAndTreatmentsOfficeVisitsSickVisitFamilyDoctor_XPATH");
			Reporter.log("ServiceAndTreatmentsOfficeVisitsSickVisitFamilyDoctor link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("ServiceAndTreatmentsOfficeVisitsSickVisitFamilyDoctor link is not clicked"+e.toString(), this.testcasename, this.Browsername);
		}
	}

	public void verifySearchResultsForSpecialtyCareAsperSearchCriteria() {
		try {
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("SearchResultsForSpecialtyCareAsperSearch are displyed");
			} else {
				cmmnFnc_Fail("SearchResultsForSpecialtyCareAsperSearch are not displayed", this.testcasename,
						this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("SearchResultsForSpecialtyCareAsperSearch are not displayed" + e.toString());
		}
	}
//
	public void clickOnWellVisits()
	{
		try {
			cmmnFnc_clickbyXPATH("ServiceAndTreatmentsOfficeVisitsWellVisit_XPATH");
			Reporter.log("ServiceAndTreatmentsOfficeVisitsWellVisits link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("ServiceAndTreatmentsOfficeVisitsWellVisits link is not clicked"+e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void clickOnGuidedPCP()
	{
		try {
			cmmnFnc_clickbyXPATH("GuidedPCP_XPATH");
			Reporter.log("Guided PCP link is clicked");
		} catch (Exception e) {
			cmmnFnc_Fail("Guided PCP link is not clicked"+e.toString(), this.testcasename, this.Browsername);
		}
	}
	
	public void verifySearchResultsForPCPLink() {
		try {
			waitload(3000);
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("SearchResultsForPCP results are displyed");
			} else {
				cmmnFnc_Fail("SearchResultsForPCPresults are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("SearchResultsForPCP results are not displayed" + e.toString());
		}
	}
	
	
	public void verifySearchResultsForCareByCondition_CommonCondition() {
		try {
			cmmnFnc_DropdownHandling("PlaceDistanceDrop_XPATH", "Index", "7");
			List<WebElement> ConvenienceClinicResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (ConvenienceClinicResults.size() > 0) {
				Reporter.log("SearchResults For CareByCondition_CommonCondition are displyed");
			} else {
				cmmnFnc_Fail("SearchResults For CareByCondition_CommonCondition are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("SearchResults For CareByCondition_CommonCondition are not displayed" + e.toString());
		}
	}
	
	
	public void verifySearchResultsForTextSearch() {
		try {
			waitload(5000);
			List<WebElement> searchResults = cmmFnc_ReturnList("SearchResults_XPATH");
			if (searchResults.size() > 0) {
				Reporter.log("MedicalSuppliers results are displyed");
			} else {
				cmmnFnc_Fail("MedicalSuppliers results are not displayed", this.testcasename, this.Browsername);
			}
		} catch (Exception e) {
			Reporter.log("MedicalSuppliers results are not displayed" + e.toString());
		}
	}
	

	
	//

}
