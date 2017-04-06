package DemoPageObjectModel;

import org.openqa.selenium.By;

import static DemoPageObjectModel.Utils.clickOnElement;
import static DemoPageObjectModel.Utils.typeText;
import static DemoPageObjectModel.Utils.waitUntilGetTextInvisible;

/**
 * Created by DIPAK on 4/2/2017.
 */
public class HomePage extends BasePage
{
    //click on nopcommerce registration page
   public static void clickOnregistration()
        {
            clickOnElement(By.xpath("//div[@class='header']/div/div[2]/div/ul/li/a"));

        }
    public static void clickOnLogin()
    {
        clickOnElement(By.className("ico-login"));
    }
    public static void clickOnApparel()
    {
       clickOnElement (By.xpath("//a[contains(@href, '/apparel')]"));

    }
    public static void clickOnElectronices()
    {
        clickOnElement(By.xpath("//a[@href='/electronics']"));

    }
    public static void clickOnBooks()
    {
        clickOnElement(By.xpath("//a[contains(text(),'Books')]"));
    }

}
