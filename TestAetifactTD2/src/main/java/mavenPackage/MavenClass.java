package mavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MavenClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com");

		// driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		Thread.sleep(2000);
		WebElement electro =driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Mouse simulations using Actions class
		Actions ad = new Actions(driver);
		
		//mouse hover electronic 
		ad.moveToElement(electro).build().perform();
		
		//keyboard options 
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		ad.sendKeys(fash,Keys.ENTER).build().perform();
		System.out.println("Fashion option clicked ");
		
		//Right click on web page
		Thread.sleep(2000);
		ad.contextClick().build().perform();

	


	}

}
