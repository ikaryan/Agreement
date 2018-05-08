package com.bancolombia.fenix;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.ITestCase;
//import atu.alm.wrapper.ITestCaseRun;
//import atu.alm.wrapper.enums.StatusAs;
import atu.alm.wrapper.exceptions.ALMServiceException;

public class SeleniumALMIntegration {
	WebDriver driver;

	 

    @BeforeClass
    public void init() {
          System.setProperty("webdriver.chrome.driver",
            "D:\\chromedriver.exe");
     driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void login() throws InterruptedException, ALMServiceException {
          // Open Wordpress App
          driver.get("http://demo.opensourcecms.com/wordpress/wp-login.php");
          // Enter UserName
          Thread.sleep(3000);
          driver.findElement(By.id("user_login")).clear();
          driver.findElement(By.id("user_login")).sendKeys("admin");
         // Enter Password
          driver.findElement(By.id("user_pass")).clear();
          driver.findElement(By.id("user_pass")).sendKeys("demo123");
          // Click on Submit button
          driver.findElement(By.id("wp-submit")).submit();
          updateResults();
          System.out.println("Done Updating Results");
    }

    public <ITestCase> void updateResults() throws ALMServiceException {
          ALMServiceWrapper wrapper = new ALMServiceWrapper(
                        "https://certificacionalm.bancolombia.corp:8443/qcbin");
           wrapper.connect("Usuario", "Password", "DEFAULT", "SampleProject");
        
         /* ITestCase loginTest = wrapper.updateResult(
                        "SampleTestSetFolder\\SubTestSetFolder1", "TestSet1", 2,
                        "Login", StatusAs.PASSED);        
          wrapper.close();
          */
    }

    @AfterClass
    public void close() {
          driver.quit();
    }

}

