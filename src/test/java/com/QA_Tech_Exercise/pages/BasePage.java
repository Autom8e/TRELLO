package com.QA_Tech_Exercise.pages;

import com.QA_Tech_Exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class  BasePage {

    @FindBy(xpath = "//a[contains(.,'Log in')]")
    public WebElement loginBtnBase;

    @FindBy(xpath = "//a[contains(.,'Sign up')]")
    public WebElement signupBtn;



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}




