package com.QA_Tech_Exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user']")
    public WebElement emailInput;

    @FindBy(css = "input#password")
    public WebElement passwordInput;

    @FindBy(css = "input#login")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@value='Log in with Atlassian']")
    public WebElement loginWithAtlassianBtn;

    @FindBy(xpath = "(//span[@class='css-19r5em7'])[1]")
    public WebElement loginBtnAfterEmail;
}
