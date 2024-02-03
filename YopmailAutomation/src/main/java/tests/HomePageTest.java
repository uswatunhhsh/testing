package tests;

import pages.EmailPage;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage(driver);
    EmailPage emailPage = new EmailPage(driver);
    homePage.inputOnSearchBar("testing");
    Assert.assertEquals(emailPage.getEmailTitle()getText()),
}
