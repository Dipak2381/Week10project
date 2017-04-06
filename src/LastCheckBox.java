import DemoPageObjectModel.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 4/4/2017.
 */
public class LastCheckBox extends Utils
{
    public static void main(String[] args)

    {
        WebDriver driver = new FirefoxDriver();
        sleep(3);
        driver.get("https://enterprise-demo.orangehrmlive.com/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click on username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //click on pass
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        //click on login
        driver.findElement(By.name("Submit")).click();
        //click on admin
        driver.findElement(By.xpath("//div/ul/li/a[@id='menu_admin_viewAdminModule']")).click();



    }
}
