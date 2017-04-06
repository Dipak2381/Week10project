package DemoPageObjectModel;

import org.testng.annotations.Test;

/**
 * Created by DIPAK on 4/2/2017.
 */
public class TestSuit extends Utils {
    @Test
    public void userShouldAbleToRegisterSuccesfully()
    {
        BasePage.openBrowser();
        HomePage.clickOnregistration();
        RegisterationPage.registrationDetail();
    }
    @Test
    public void userShouldAbleToLogin()
    {
        BasePage.openBrowser();
        LogInPage.logOutLogIn();

    }
    @Test
    public void userShouldAbleToClickOnApparelToClothingAndComparision()
    {
        BasePage.openBrowser();
        ApparelPage.ClickOnClothing();
    }
    @Test
    public void userShouldAbleToClickOnElectronicesAndAddToCartCellPhone()
    {
        BasePage.openBrowser();
        ElectronicesPage.clickOnCellPhone();
    }
    @Test
    public void userShouldBeClickOn_BooksAnd_ConfrimOrder()
    {
      BasePage.openBrowser();
      BooksPage.clickOnBooks1();
    }
    @Test
    public  void userShouldBeAble_SendGiftCardToFriend()
    {
        BooksPage.openBrowser();
        $25GiftCard.clickOn_$25GiftCard();
    }
}
