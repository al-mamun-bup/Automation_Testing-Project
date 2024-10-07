package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.SearchPage;
import com.itlearn.utility.ReadExcelFile;

public class SerachTestCase extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestPortalData.xlsx";
	
	@Test(priority =1)
	void searchCourseTesr()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		SearchPage sp= new SearchPage(driver);
		String serachCourse=ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.serachCourse(serachCourse);
	}

}
