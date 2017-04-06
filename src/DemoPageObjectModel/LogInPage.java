package DemoPageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/2/2017.
 */
public class LogInPage extends Utils {

        public static void logOutLogIn()
        {
            HomePage.clickOnLogin();

             String email = getTextByAttribute(By.id("Email"),"value");
             //click on login
             typeText(By.id("Email"),"Raj_malhotra@yahoo.com");
             //type password
             typeText(By.id("Password"),"D123456");
            //click on login button
             clickOnElement(By.xpath("*//form/div[3]/input"));
             //Assert
            Assert.assertEquals("Raj_malhotra@yahoo.com",getTextByAttribute(By.id("Email"),"value"));


        }

}
