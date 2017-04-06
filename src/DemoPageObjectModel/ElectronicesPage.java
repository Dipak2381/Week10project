package DemoPageObjectModel;

import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/3/2017.
 */
public class ElectronicesPage extends Utils
{
    public static void clickOnCellPhone()
    {
        //click on electronic
        HomePage.clickOnElectronices();

        //click cellphone
        clickOnElement(By.xpath("//div/div/div[2]/ul/li[2]/ul/li[2]/a"));

        //click on price value
        clickOnElement(By.cssSelector("span.price.actual-price"));

        //click on 1 add to cart
        clickOnElement(By.xpath("//input[@value='Add to cart']"));
        clickOnElement(By.className("close"));

        sleep(3);

        //get price value first cell phone
        getTextByAttribute(By.xpath("//div[@class='product-grid']/div/div[1]/div/div[2]/div[3]/div[1]/span"),"innerText");
        System.out.println(getTextByAttribute(By.xpath("//div[@class='product-grid']/div/div[1]/div/div[2]/div[3]/div[1]/span"),"innerText"));

        //click on 2 add to cart
        clickOnElement(By.xpath("//div[2]/div/div[2]/div[3]/div[2]/input"));
        clickOnElement(By.className("close"));

        sleep(3);

        //get price value second cell phone
        getTextByAttribute(By.xpath("//div[2]/div/div[2]/div[3]/div/span"),"innerText");
        System.out.println(getTextByAttribute(By.xpath("//div[2]/div/div[2]/div[3]/div/span"),"innerText"));


        //click on price value
        // driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div/span")).getText();
        sleep(5);

        //get price value second cell phone
        getTextByAttribute(By.xpath("//div[3]/div/div[2]/div[3]/div/span"),"innerText");
        System.out.println(getTextByAttribute(By.xpath("//div[3]/div/div[2]/div[3]/div/span"),"innerText"));

        //click on 3 add to cart
        clickOnElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input"));

        //click on shopping cart
        clickOnElement(By.linkText("shopping cart"));

        // Assert
        getTextByAttribute(By.xpath("//div[@class='total-info']/table/tbody/tr[4]/td[2]/span/strong"),"innerText");
       // Assert.assertTrue("Total",driver.findElement(By.xpath("//tr[@class='order-total']/td")).isEnabled());
        System.out.println( getTextByAttribute(By.xpath("//div[@class='total-info']/table/tbody/tr[4]/td[2]/span/strong"),"innerText"));

        driver.close();

    }
}
