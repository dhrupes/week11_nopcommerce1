package testsuites;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
/*    3. Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully

* click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign  In!’  */

    String baseurl ="https://demo.nopcommerce.com/";
    @Before

    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Click on the 'login' Link
        clickOnElement(By.linkText("Log in"));

        //Verify the text 'Welcome, Please Sign In'
        String actualTest = getTextFromElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String expectedTest = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedTest, actualTest);

    }



    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Click on the 'login' Link
        clickOnElement(By.linkText("Log in"));
        //Enter valid username
       sendTextToElement(By.xpath("//input[@class='email']"),"dhrupestcb@gmail.com");
       //Enter valid Password
        sendTextToElement(By.xpath("//input[@class='password']"),"D123456");
        //click on login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //Verify logout text only
        String actualTest = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        String expectedTest = "Log out";
        Assert.assertEquals(expectedTest, actualTest);
         clickOnElement(By.xpath("//a[@class='ico-logout']"));
    }
    @Test
    public void verifyTheErrorMessage() {

        //Click on the 'login' link
        clickOnElement(By.linkText("Log in"));
        //Enter invalid username
        sendTextToElement(By.xpath("//input[@class='email']"),"dhrupestcb1@gmail.com");

        //invalid password
        sendTextToElement(By.xpath("//input[@class='password']"),"D1234567");
        //Click on login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //Verify the error message ‘Login was unsuccessful.
        String actualTest = getTextFromElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        String expectedTest ="Login was unsuccessful. Please correct the errors and try again.\nNo customer account found";
        Assert.assertEquals(expectedTest,actualTest);
        System.out.println(actualTest);
    }





}
