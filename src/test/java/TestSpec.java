import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Subrahmanyam on 17/08/16.
 */
public class TestSpec {

    @Test
    public void testOne(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.close();
    }
}
