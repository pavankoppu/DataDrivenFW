package com.fw.RallyConnectAutomation.executor;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

import com.fw.RallyConnectAutomation.suite.Acceptance;

public class executor {
	@Factory()
	@Parameters({"Deviceid","browsertype", "WinPlatform"})
	public Object[] paralleltest(String Deviceid,String browsertype, String WinPlatform ) throws UnsupportedEncodingException, MalformedURLException{
		return new Object[]{
				new Acceptance(Deviceid, browsertype,WinPlatform)};
		
	}
	
	// commented to try alternate way 
//	@DataProvider(name="dp", parallel=true )
//	public Object[][] dptest(){
//		
//		return new Object[][]{{"9F1EE4D3A4F2176863EBF800AC7CDA6291050724","safari"},{"FA53TYJ16064","chrome"}};
//	}
	
}


  
  