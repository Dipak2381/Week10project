package DemoPageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/3/2017.
 */
public class BooksPage extends Utils
{
  public static void clickOnBooks1()
  {

      // call book class from homepage
      HomePage.clickOnBooks();

      // Click on Fahrenheit 451 books on left side list
      clickOnElement(By.xpath("//a[contains(text(),'Fahrenheit 451 by Ray Bradbury')]"));
      // Add Quantity
      typeText(By.id("addtocart_37_EnteredQuantity"),"4");
      // Add to Wishlist
      clickOnElement(By.id("add-to-wishlist-button-37"));
      // Continue on click wishlist
      clickOnElement(By.xpath("html/body/div[5]/p/a"));
      // Clear Quantity
      clearOnElement(By.className("qty-input"));
      // Update Quantity
      typeText(By.className("qty-input"),"4");
      // Update Cart
      clickOnElement(By.name("updatecart"));
      // Click on Checkbox
      clickOnElement(By.name("addtocart"));
      // Add to Cart
      clickOnElement(By.name("addtocartbutton"));
      // Click on T&C
      clickOnElement(By.id("termsofservice"));

      // Select country name
      selectByText(By.id("CountryId"),"United Kingdom");

      // Click on State
      //typeText(By.id("StateProvinceId"),"london");
      sleep(3);
      // Click on Zip Code
      typeText(By.id("ZipPostalCode"),"SE1 1NO");
      // Click to Checkout
      clickOnElement(By.id("checkout"));
      // Click checkout as a guest
      clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/input[1]"));
      // Fill  First name
      typeText(By.id("BillingNewAddress_FirstName"),"harry");
      // Fill Last name
      typeText(By.id("BillingNewAddress_LastName"),"java");
      // Fill E-mail
      typeText(By.id("BillingNewAddress_Email"),"harjay@gamil.com");
      // Fill Country
      selectByText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
      // Fill City Name
      typeText(By.id("BillingNewAddress_City"),"London");
      // Fill Address
      typeText(By.id("BillingNewAddress_Address1"),"4-5 High Street");
      // Fill Zip Code
      typeText(By.id("BillingNewAddress_ZipPostalCode"),"SE1 1NO");
      //Fill Phone Number
      typeText(By.id("BillingNewAddress_PhoneNumber"),"00000000");
      // Click on Continue Button
      clickOnElement(By.xpath("//input[@value='Continue']"));
      // Click on Continue Button
      clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input"));
      // Select Payment Method
      clickOnElement(By.id("paymentmethod_1"));
      // Select Continue
      clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/input"));
      // Select Credit Card
      selectValue(By.id("CreditCardType"),"MasterCard");
     // typeText(By.id("CreditCardType"),"Mastercard");
      // Select Cardholder Name
      typeText(By.id("CardholderName"),"Harry");
      // Select Card Number
      typeText(By.id("CardNumber"),"5415326444036252");
      // Select Expire Month
      selectValue(By.id("ExpireMonth"),"2");
      // Select Expire Year
      selectValue(By.id("ExpireYear"),"2019");
      //clearOnElement(By.id("CardCode"));
      // Select Card Code
      typeText(By.id("CardCode"),"003");
      //driver.findElement(By.id("CardCode")).sendKeys("003");
      // Select Continue
      clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/input"));
      // Select Continue
      clickOnElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/input"));
      // Select Confirm
      clickOnElement(By.xpath("//div[@id='confirm-order-buttons-container']/input"));

      // Assert
     // getTextByAttribute(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"),"innerText");

      Assert.assertEquals("Your order has been successfully processed!",getTextByAttribute(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"),"innerText"));
      System.out.println(getTextByAttribute(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong"),"innerText"));
      //Close Browser
      driver.close();

  }
}
