import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFirefoxlauncher {
	WebDriver driver;
	@Test
	public void browserLauncher(){
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void searchTheWord(){
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Selenium webdriver");
		System.out.println("Finished Testing");
		driver.close();
		
	}
	
}
