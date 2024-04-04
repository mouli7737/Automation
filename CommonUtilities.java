package orangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class CommonUtilities {

	
	
	WebDriver driver;
	
	
	public CommonUtilities(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void timeout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	public void quit()
	{
		driver.quit();
	}
	
	
}


