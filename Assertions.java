package extractingData;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver = new ChromeDriver();
	@Test(priority = 1)
	public void url()
	{
	
	driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	@Test(priority = 2)
	public void movies()
	{
		
		driver.findElement(By.xpath("//a[text() = 'Movies']")).click();
		
		driver.findElement(By.xpath("(//div[@class='sc-133848s-2 sc-1t5vwh0-1 gTzZQd'])[6]")).click();
		
		driver.findElement(By.xpath("(//span[text() ='Book tickets'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text() ='3D'])[2]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@class='sc-10qvp23-1 Dvdam']//ul//li[2]//section[2]/div/span")).click();
		
		driver.findElement(By.xpath("(//ul[@id='popQty']//li)[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		
		driver.findElement(By.xpath("(//td[@class='SRow1'])[10]//div[13]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Rs.130.00'])[1]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@id='prePay']")).click();
		
		
		
		
		
	}
	
}
