package testsuites;


import com.google.common.base.Verify;
import javafx.scene.control.Tab;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    /* 4. Write down the following test into ‘TopMenuTest’ class
1. userShouldNavigateToComputerPageSuccessfully
   * click on the ‘Computers’ Tab
   * Verify the text ‘Computers’ */
    String baseurl = "https://demo.nopcommerce.com/";

    @Before

    public void setup() {

        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputersPageSuccessfully() {
        //Click on the 'Computers' Link
        clickOnElement(By.linkText("Computers"));
        //Verify the text 'Computers'
        String actualMess = getTextFromElement(By.linkText("Computers"));
        String expectedMess = "Computers";
        Assert.assertEquals(expectedMess,actualMess);

    }

    /*2. userShouldNavigateToElectronicsPageSuccessfully
     * click on the ‘Electronics’ Tab
     * Verify the text ‘Electronics’ */
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Click on the 'Electronics' Link

        clickOnElement(By.linkText("Electronics"));
        //Verify the text 'Electronics'
        String actualMess=getTextFromElement(By.linkText("Electronics"));

        String expectedMessage = "Electronics";
        Assert.assertEquals(expectedMessage, actualMess);
    }

    /* 3. userShouldNavigateToApparelPageSuccessfully
     * click on the ‘Apparel’ Tab
     * Verify the text ‘Apparel’ */
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Click on the 'Apparel' Link
        clickOnElement(By.linkText("Apparel"));
        //Verify the text 'Apparel'
        String actualMess=getTextFromElement(By.linkText("Apparel"));
        String expectedMessage = "Apparel";
        Assert.assertEquals(expectedMessage, actualMess);

    }

    /* 4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’ */
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Click on the 'Digital Downloads' link
        clickOnElement(By.linkText("Digital downloads"));
        //verify the text 'Downloads'
        String actualMess=getTextFromElement(By.linkText("Digital downloads"));
        String expectedMessage = "Digital downloads";
        Assert.assertEquals(expectedMessage, actualMess);
    }

    /* 5. userShouldNavigateToBooksPageSuccessfully

     * click on the ‘Books’ Tab
     * Verify the text ‘Books’    */
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Click on the 'Books' link
        clickOnElement(By.linkText("Books"));
        //verify the text 'Books'
        String actualMess=getTextFromElement(By.linkText("Books"));
        String expectedMessage = "Books";
        Assert.assertEquals(expectedMessage, actualMess);
    }

    /* 6. userShouldNavigateToJewelryPageSuccessfully
     * click on the ‘Jewelry’ Tab
     * Verify the text ‘Jewelry’ */
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Click on the 'Jewelry' link
        clickOnElement(By.linkText("Jewelry"));
        //verify the text 'Jewelry'
        String actualMess=getTextFromElement(By.linkText("Jewelry"));
        String expectedMessage = "Jewelry";
        Assert.assertEquals(expectedMessage, actualMess);

    }

    /* 7. userShouldNavigateToGiftCardsPageSuccessfully

     * click on the ‘Gift Cards’ Tab
     * Verify the text ‘Gift Cards’
     */
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Click on the 'GiftCards' link
        clickOnElement(By.linkText("Gift Cards"));
        //verify the text 'GiftCards'
        String actualMess=getTextFromElement(By.linkText("Gift Cards"));
        String expectedMessage = "Gift Cards";
        Assert.assertEquals(expectedMessage, actualMess);

    }


}
