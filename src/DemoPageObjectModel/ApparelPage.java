package DemoPageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/3/2017.
 */
public class ApparelPage extends Utils
{
    public static void ClickOnClothing()
    {
        //click on apparel
        HomePage.clickOnApparel();

        // Click on Clothing
        clickOnElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div[2]/div[2]/div/div[2]/div/div/div[2]"));

        // Select Sort by Position
        selectByText(By.id("products-orderby"),"Price: Low to High");


        // Select Display
        selectByText(By.id("products-pagesize"),"3");

        sleep(3);

        // Select List
        clickOnElement(By.xpath("//div/div/div[2]/div/div/a[2]"));

        // Add to compare list
        clickOnElement(By.xpath("//div[2]/div/div[2]/div[3]/div[2]/input[2]"));

        sleep(1);

        // Add to compare list
        clickOnElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input[2]"));
        sleep(1);

        // Click on product comparision option
        clickOnElement(By.xpath("//div[@id='bar-notification']/p/a"));

        // Clear list
        clickOnElement(By.className("clear-list"));

        Assert.assertTrue("You have no items to compare.",driver.findElement(By.className("no-data")).isEnabled());

        driver.close();
    }
}
