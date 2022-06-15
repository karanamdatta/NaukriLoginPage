package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@name='login-form']/div[2]/input")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.className("mTxt")).click();
		Thread.sleep(3000);
    
	}

}
