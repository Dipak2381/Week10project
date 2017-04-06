package DemoPageObjectModel;

import com.google.common.base.Function;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


/**
 * Created by DIPAK on 4/2/2017.
 */
public class Utils extends BasePage {
    //send text/type text/any like name,username,password
    public static void typeText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //click on Any elements/click method
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //method to sleep /hold at anywhere in Webpage
    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //select methods

    //select drop down  by visible text
    public static  void selectByText(By by,String text)
    {
        new Select(driver.findElement(by)).selectByVisibleText(text);// name less object

    }

    ////select drop down  by visible value
    public static  void selectValue(By by,String value){

       Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //select drop down  by index number
    public static void selectByIndex(By by,int index)
    {
        new Select(driver.findElement(by)).deselectByIndex(index);

    }
    //clear any elements
    public  static void clearOnElement(By by)
    {
        driver.findElement(by).clear();
    }
    //close Browser Window
    public static void close()
    {
        driver.close();

    }
    //quit browser all window
    public  static void quit()
    {
        driver.quit();
    }
    //explicite wait method
    //wait until element to be present

    public  static  void elementToBePresent(By by,int second)
    {
        WebDriverWait wait =  new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }
    //Wait until element to be clickable

    public  static  void elementToBeClickable(By by,int second)
    {
        WebDriverWait wait =  new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    //Wait until element to be visible

    public  static  void elementToBeVisible(By by,int second)
    {
        WebDriverWait wait =  new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    //Wait until element to be selected

    public  static  void elementToBeSelected(By by,int second)
    {
        WebDriverWait wait =  new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.elementToBeSelected(by));

    }

    //Wait until element is invisilbility of element located

    public  static  void waitUntilInvisibilityOfElementLocated(By by,int second)
    {
        WebDriverWait wait =  new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));

    }
    //Wait until element is invisibility of element with text

    public  static  void waitUntilGetTextInvisible(By by,int second,String text)
    {
        WebDriverWait wait =  new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by,text));

    }

    //Get text for any elements

    public static String getTextFromElement(By by)
    {
       String text= driver.findElement(by).getText();
       return text;
    }

    //get text by attribute
    public static String getTextByAttribute(By by,String attributeName)
    {
        String text = driver.findElement(by).getAttribute(attributeName);
        return text;
    }

    //Get text =value = attribute//array list
    //dropdown selection by attribute if select class on available in firepath console
     public static void dropDownSelectionByAttribute(By by,String attributeName,String dropDownText)
     {
        List<WebElement> size_menu  =driver.findElements(by);
        for(WebElement element : size_menu)
        {
            String innerText = element.getAttribute(attributeName);
            if (innerText.contentEquals(dropDownText))
            {
              element.click();
              break;
            }
        }

     }


    //date stamp method

    public static String dateStamp()
    {
        DateFormat dateFormat=new SimpleDateFormat("ddhhss");
        Date date =new Date();
        String date1 = dateFormat.format(date);
        return date1;

    }

   // TakesScreenshot ts = (TakesScreenshot) driver;
   // File source = ts.getScreenshotAs(OutputType.FILE);
    //    FileUtils.copyFile(source, new File("C:\\screenshot\\photo.png"));
    //browser screen shot

    public static void printBrowserScreenShot(String filePath)
    {TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File(filePath+"\\photo"+dateStamp()+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //print screen shot

    public static void printScreenShot(String filePath)
    {
        try {
            Robot robot = new Robot();
            BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                ImageIO.write(screenShot,"jpg",new File(filePath+"\\photo"+dateStamp()+".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
             catch (AWTException e) {
              e.printStackTrace();
        }
    }

    //use Random number

    public static void randomNumber(int range)
    {
      Random random = new Random();
      int number = random.nextInt(range);
      return ;
    }

    //mouse hover  on any element
    public static void mouseHover(By by)
    {
      Actions action =new Actions(driver);
      WebElement mouse = driver.findElement(by);
      action.moveToElement(mouse).build().perform();
    }
    public static  void pageScrollUpAndDown(String scroll,String objects )
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(scroll,objects);
    }
    public  static  void alertAccept()
    {
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }
    public static void iFreamByNumber(String iFNumber)
    {
        //Switch by frame name
        driver.switchTo().frame("");
        driver.quit();

    }

    public WebElement fluentWait ( final By locator)
        {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(30, TimeUnit.SECONDS)
                    .pollingEvery(5, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);

            WebElement foo = wait.until(new Function<WebDriver, WebElement>()
            {
                public WebElement apply(WebDriver driver)
                {
                    return driver.findElement(locator);
                }
            });

            return foo;
        }
    }





