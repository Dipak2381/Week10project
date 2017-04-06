package DemoPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 4/2/2017.
 */
public class BasePage {
    public static WebDriver driver =new FirefoxDriver();

    public static void openBrowser()
    {
       driver.get("http://demo.nopcommerce.com");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
