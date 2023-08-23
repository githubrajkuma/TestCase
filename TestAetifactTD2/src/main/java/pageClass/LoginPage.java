package pageClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
  WebDriver driver ;
	public void openUrl() throws Exception {

		// setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Launching Chrome Browser Instance
		 driver = new ChromeDriver();
	
		// Open URL using get() method
		driver.get("https://www.Google.com");

		Thread.sleep(200);
		// Maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

	public void enterUserName() {
		driver.findElement(By.id("email")).sendKeys("123@gmail.com");
	}

	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("12345678");
	}

	public void clickButton() {
		System.out.println("Login button clicked");
	}

	public void verifyLogin() {
		System.out.println("verified Login");
	}

}
