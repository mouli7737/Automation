package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		CommonUtilities cu = new CommonUtilities(driver);
		OrangeHRM_LoginPage lp = new OrangeHRM_LoginPage(driver);
		
		
		cu.url();
		cu.timeout();
		lp.Login();
		lp.ConfirmLogin();
		Thread.sleep(2000);
		cu.quit();
		
		
		
	}
	
}
