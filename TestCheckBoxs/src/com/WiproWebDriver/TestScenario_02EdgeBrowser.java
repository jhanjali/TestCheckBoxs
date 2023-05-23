package com.WiproWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_02EdgeBrowser {


@Test
	
	public void TestRCheckBoxandRadioBtN() throws Exception {
		
	    WebDriver driver = Helper.startBrowser("Edge");
	    driver.manage().window().maximize();
	    driver.get("file:///D:/Checkbox2.html");
	    
	    WebElement Checkbox =  driver.findElement(By.xpath("//input[@name = 'option-1']"));
	    Checkbox.click();
	    Checkbox.isSelected();
	   
	    WebElement Checkbox2 =  driver.findElement(By.xpath("//input[@name = 'option-2']"));
	    Checkbox2.click();
	    Checkbox2.isSelected();
	   
	   
	    //WebElement Checkbox3 =  driver.findElement(By.xpath("//input[@name = 'option-3']"));
	   // Checkbox3.click();
	    //Checkbox3.isSelected();
	   
	    WebElement Checkbox4 =  driver.findElement(By.xpath("//input[@name = 'option-4']"));
	    Checkbox4.click();
	    Checkbox4.isSelected();
	   
	    WebElement Checkbox5 =  driver.findElement(By.xpath("//input[@name = 'option-5']"));
	    Checkbox5.click();
	    Checkbox5.isSelected();
	    
	    WebElement Checkbox6 =  driver.findElement(By.xpath("//input[@name = 'option-6']"));
	    Checkbox6.click();
	    Checkbox6.isSelected();
	
	
	    WebElement Checkbox7 =  driver.findElement(By.xpath("//input[@name = 'option-7']"));
	    Checkbox7.click();
	    Checkbox7.isSelected();
	
	  
	    WebElement RadioBtn1 =  driver.findElement(By.xpath("//input[@value = 'Programming']"));
	    RadioBtn1.click();
	    RadioBtn1.isSelected();
	    
	    
	    WebElement RadioBtn2 =  driver.findElement(By.xpath("//input[@value = 'Testing']"));
	    RadioBtn2.click();
	    RadioBtn2.isSelected();
	    
	    
	    WebElement RadioBtn3 =  driver.findElement(By.xpath("//input[@value = 'Test Automation']"));
	    RadioBtn3.click();
	    RadioBtn3.isSelected();
	    
	    
	    List <WebElement> ListOfcheckBox = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
	    
	    System.out.println(ListOfcheckBox.size());
	    
	    List <WebElement> ListOfButton = driver.findElements(By.xpath("//input[@type = 'radio']"));
	    
	    System.out.println(ListOfButton.size());
	    
	    driver.quit();
	
}


}