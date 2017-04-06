package DemoPageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * Created by DIPAK on 4/3/2017.
 */
public class $25GiftCard extends Utils
{
    public static void clickOn_$25GiftCard()
    {
        pageScrollUpAndDown("0,400","");

       // JavascriptExecutor jse = (JavascriptExecutor)driver;
       // jse.executeScript("window.scrollBy(0,0)", "$25 Virtual Gift Card");
       // sleep(5);
        //click on gift card $25 to add to cart
        clickOnElement(By.xpath("//div[4]/div/div[2]/div[3]/div[2]/input[1]"));
       // Type Recipient name
        typeText(By.id("giftcard_43_RecipientName"),"Raj");
        //Type Recipient email address
        typeText(By.id("giftcard_43_RecipientEmail"),"Raj_malhotra"+dateStamp()+"@yahoo.com");
        //type sender name
        typeText(By.id("giftcard_43_SenderName"),"Raj");
        //type sender email address
        typeText(By.id("giftcard_43_SenderEmail"),"Raj_malhotra@yahoo.com");
        //type message for friends
        typeText(By.id("giftcard_43_Message"),"Hello friend gift for you");
        //click add to card
        clickOnElement(By.id("add-to-cart-button-43"));

        clickOnElement(By.xpath("//body/div[5]/span"));
        // click on email a friend
        clickOnElement(By.cssSelector("input.button-2.email-a-friend-button"));

       //fill friend email
        typeText(By.id("FriendEmail"),"sureshthumar@gmail.com");
        //type email address
        typeText(By.id("YourEmailAddress"),"Raj_malhotra@yahoo.com");
        //type message
        typeText(By.id("PersonalMessage"),"Gift for you");
        //click on send button
        clickOnElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']"));



        Assert.assertEquals("Only registered customers can use email a friend feature",getTextByAttribute(By.xpath("//div[@class='message-error']/div/ul/li"),"innerText"));
        System.out.println(getTextByAttribute(By.xpath("//div[@class='message-error']/div/ul/li"),"innerText"));

        driver.close();



    }



}
