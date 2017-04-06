package DemoPageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;


/**
 * Created by DIPAK on 4/2/2017.
 */
public class RegisterationPage extends  Utils
{
  public static void registrationDetail()
    {
        //click on gender
        clickOnElement(By.id("gender-male"));
        //type first name
        typeText(By.id("FirstName"),"Raj");
        //type last name
        typeText(By.id("LastName"),"Malhotra");

        //type email address
        String email = "Raj_malhotra"+dateStamp()+"@yahoo.com";

        typeText(By.id("Email"),email);
        //type
        typeText(By.id("Company"),"dtog");
        //type password
        typeText(By.id("Password"),"D123456");
        //type confirm password
        typeText(By.id("ConfirmPassword"),"D123456");
        //click on register button
        clickOnElement(By.id("register-button"));
        // assert message
        Assert.assertEquals("Your registration completed", getTextFromElement(By.className("result")));
        //click on logout
        clickOnElement(By.className("ico-logout"));
        //driver.close();
    }
}
