package com.QA_Tech_Exercise.step_definitions;

import com.QA_Tech_Exercise.pages.LoginPage;
import com.QA_Tech_Exercise.utilities.BrowserUtils;
import com.QA_Tech_Exercise.utilities.ConfigurationReader;
import com.QA_Tech_Exercise.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {

    WebDriverWait wait=new WebDriverWait(Driver.get(),15);
    LoginPage loginPage=new LoginPage();

    @Given("the user is logged in to the website")
    public void the_user_is_logged_in_to_the_website() {
        String url=ConfigurationReader.get("url");
        Driver.get().get(url);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.get();

        loginPage.loginBtnBase.click();
        jse.executeScript("arguments[0].setAttribute('value', 'QATask@mailinator.com')",loginPage.emailInput);
        jse.executeScript("arguments[0].click();",loginPage.loginBtn);
        BrowserUtils.waitFor(2);
        loginPage.passwordInput.sendKeys("qwerty123");
        //jse.executeScript("arguments[0].setAttribute('value', 'qwerty123')",loginPage.passwordInput);
        jse.executeScript("arguments[0].click();",loginPage.loginBtnAfterEmail);

        wait.until(ExpectedConditions.titleContains("Boards"));
    }

/*
        jse.executeScript("arguments[0].setAttribute('value', 'QATask@mailinator.com')",loginPage.emailInput);
        jse.executeScript("arguments[0].setAttribute('value', 'qwerty123')",loginPage.passwordInput);
        jse.executeScript("arguments[0].click();",loginPage.loginBtnAfterEmail);

        loginPage.loginBtnBase.click();
        loginPage.emailInput.sendKeys(ConfigurationReader.get("username"));
        loginPage.loginWithAtlassianBtn.click();
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginBtn.click();

 */


}
