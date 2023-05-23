package com.WiproWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_03 {

	
@Test
	
	public void SeleniumPractise() throws Exception {
		
	    WebDriver driver = Helper.startBrowser("Chrome");
	    driver.manage().window().maximize();
	    driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
	     
	    driver.findElement(By.xpath("//*[@id = 'post-body-9011060868494634961']/button")).click();
	    Thread.sleep(10000);
	    
	    driver.quit();
	    
	   // WebDriverWait Wait = new WebDriverWait(driver, null);
	    
	   // Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id = 'post-body-9011060868494634961']/button")));
	    //ClickOnTryBTN.click();
	
		
}	
	
}
