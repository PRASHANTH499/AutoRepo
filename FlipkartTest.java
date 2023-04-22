package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FlipkartPage;
import testbase.WebTestBase;

public class FlipkartTest extends WebTestBase {
    public FlipkartPage flipkartPage;

    FlipkartTest() {
        super();
    }

    @BeforeMethod
    public void beforemethod() {
        initialization();
        flipkartPage = new FlipkartPage();
    }

    @Test
    public void verifyMouseHoverElement() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        flipkartPage.closePopUp();
        flipkartPage.mouseHover();
        softAssert.assertEquals("", "", "Hover Done");
        Thread.sleep(4000);
        softAssert.assertAll();
    }

    @Test
    public void verifySearchInput() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        flipkartPage.closePopUp();
        flipkartPage.searchInput(prop.getProperty("searchtext"));
        softAssert.assertEquals("", "", "Shoes should be entered");
        Thread.sleep(5000);
        softAssert.assertAll();
    }

    @Test
    public void verifyFacebookLink() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        flipkartPage.closePopUp();
        flipkartPage.facebookWindow();
        Thread.sleep(5000);
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {

        driver.close();
    }
}


