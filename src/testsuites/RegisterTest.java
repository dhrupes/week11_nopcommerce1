package testsuites;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.time.Month;
import java.time.Year;

public class RegisterTest extends Utility {
    /* 5. Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’ */



    String baseurl ="https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser (baseurl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on the register link
        clickOnElement(By.linkText("Register"));
        // verify the text  'Register'
        String actualTest = getTextFromElement(By.linkText("Register"));
        String expectedTest = "Register";
        Assert.assertEquals(expectedTest,actualTest);
    }
    /* 2. userSholdRegisterAccountSuccessfully */
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on register link
        clickOnElement(By.linkText("Register"));
        // * Select gender radio button
        clickOnElement(By.xpath("//input[@value='M']"));
        //* Enter First name
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"Dhrupesh");
       //* Enter Last name
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Patel");
       // * Select Day Month and Year
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"17");
       sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"March");
       sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1985");
       // * Enter Email address
        sendTextToElement(By.xpath("//input[@data-val-required='Email is required.']"),"dhrupestcb@gmail.com");
       //* Enter Password
        sendTextToElement(By.xpath("//input[@data-val-regex='<p>Password must meet the following rules: </p><ul><li>must have at least 6 characters</li></ul>']"),"D12345678");
       //  * Enter Confirm password
        sendTextToElement(By.xpath("//input[@data-val-equalto='The password and confirmation password do not match.']"),"D12345678");
       // * Click on REGISTER button
        clickOnElement(By.xpath("//button[@id='register-button']"));

        // * Verify the text 'Your registration completed’
      String actualMess = getTextFromElement(By.xpath("//div[@class='result']"));
      String expectedMes ="Your registration completed";
      Assert.assertEquals(expectedMes,actualMess);

    }


}
