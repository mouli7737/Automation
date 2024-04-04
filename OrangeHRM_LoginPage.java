package orangeHRM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRM_LoginPage {
	
	WebDriver driver;
	
	By UserName = By.xpath(("//input[@name= 'username']"));
	
	By Password = By.xpath(("//input[@name= 'password']"));
	
	By Submit = By.xpath(("//button[@type= 'submit']"));
	
	
	
	public OrangeHRM_LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	
	public  void Login() throws Exception
	{
		driver.findElement(UserName).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(Password).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(Submit).click();
		
	}
	
   public void ConfirmLogin()
   {
	 String currenturl =  driver.getCurrentUrl();
	 
	 String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	
   if(currenturl.equals(expectedurl) )
   {
	   System.out.println("Login Successful");
   }
   else
   {
	   System.out.println( "Login not Successful");
   }

	
   }




}
