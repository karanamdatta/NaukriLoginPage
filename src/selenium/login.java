package selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {
	

	 
	public static String getkeyvalue() throws IOException {
		File configFile = new File("C:\\Users\\Dell\\eclipse-workspace\\naukari register\\src\\testdata\\config.properties");
	    FileReader reader = new FileReader(configFile);
	    Properties props = new Properties();
	    props.load(reader);
	 
	    return props.getProperty("url");
	    
	}
	    

	public static void main(String[] args) throws InterruptedException, IOException {
		login a =new login();
		
		
		
	
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.get(login.getkeyvalue());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@name='login-form'] /div[2] /input")).sendKeys("umamaheswarareddy.ramireddy@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='qsb-keyskill-sugg']")).sendKeys("automation");
		//driver.findElement(By.xpath("//input[@id='qsb-location-sugg']")).sendKeys("Hyderbad/secundrabad");
		//Actions actions = new Actions(driver);
		//WebElement wx = driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
		//actions.moveToElement(wx);
		//actions.perform();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		Actions actions1 = new Actions(driver);
		WebElement wx1 = driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
		actions1.moveToElement(wx1);
		actions1.perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\Dell\\Documents\\Downloads\\mahesh resume.docx");
	//WebElement resumeHeadLines = driver.findElement(By.xpath(""));
	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@class='col s3 widgets pl0']/div/div/ul/li[3]/span")));
	driver.findElement(By.xpath("//div[@id='lazyResumeHead']/div/div/div/div[1]/span[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='editHeader']/parent::form/div[2]/div/textarea")).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='editHeader']/parent::form/div[2]/div/textarea")).sendKeys("datta");
	Thread.sleep(3000);
	}

}
