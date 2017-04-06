import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.jetty.html.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by DIPAK on 4/1/2017.
 */
public class RaffKam {
    public static void main(String[] args) throws IOException {


        WebDriver driver = new FirefoxDriver();
        //Date stamp
        DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd hh mm ss");
        Date datedj = new Date();

        {
            System.out.println(dateFormat.format(datedj));
        }

        //Assert+get text
        String expectedText1 = "Your message has been sent.";
        String actualresult1 = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedText1, actualresult1);

        Assert.assertTrue("Total", driver.findElement(By.xpath("//tr[@class='order-total']/td")).isEnabled());

        //mouse hover on department

        WebElement department = driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(department).perform();

        //select by visible Text
        WebElement select_position = driver.findElement(By.id("products-orderby"));
     //   Select select_pp = new Select(select_position);
      //  select_pp.selectByVisibleText("Price: Low to High");
        //select by index
      //  Select year_dd = new Select(driver.findElement(By.xpath("//div/select[2]")));
    //    year_dd.selectByIndex(35);
        //select by value


        // TakeScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\screenshot\\photo.png"));
        System.out.println("TakeScreenshot_12 Taking");

        //list method
        WebElement revelance_dd= driver.findElement(By.xpath("//div[@class='mask']/fieldset/select/option"));
      //  Select revelance_ddd = new Select(revelance_dd);
      //  List<WebElement> revelance_list=revelance_ddd.getAllSelectedOptions();

        //int revelance_total=revelance_list.size();
      //  System.out.println("Total="+revelance_total);

     //   for (WebElement element:revelance_list)
        {
       //     String innerText = element.getAttribute("innerText");
       //     if (innerText.contentEquals("Price: High - Low"))
      //      {
       //         element.click();
       //         break;
            }
        //    System.out.println(innerText);
        }



    //Thread sleep method
    public static void sleep(int i)
    {
        try{
            Thread.sleep(1*1000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
