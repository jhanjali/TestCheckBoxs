import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_01 {

	@Test
	
	public void TestRadioBtn() throws Exception {
		
	    WebDriver driver = Helper.startBrowser("GC");
	    driver.manage().window().maximize();
	    driver.get("file:///D:/Checkbox.html");
	    
	   // driver.findElement(By.xpath("//input[@name = 'option1']")).click();
	    
	    WebElement Checkbox = driver.findElement(By.xpath("//input[@name = 'option1']"));
	    
	    Checkbox.click();
	    
	   if ( Checkbox.isSelected()) {
		   
		   System.out.println("Checkbox is selected");
	   }else {
		   System.out.println("Checkbox is not selected"); 
	   }
	   
	   Checkbox.click();
	   
	   if(!Checkbox.isSelected())
		   
	   {
		   System.out.println("Checkbox is toggle off..");
		   
	   }
	}
}

	
	
	
	
	
	

