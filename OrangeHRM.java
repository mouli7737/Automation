package extractingData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	WebDriver driver = new ChromeDriver();
	@Test
	public void LunchApp() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Test
	public void Login()
	{
		
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
 		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void VerifyLogin()
	{
	   String	ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	   String   ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ExpectedURL, ActualURL);
	}

}
