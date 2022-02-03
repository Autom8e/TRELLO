package com.QA_Tech_Exercise.pages;

import com.QA_Tech_Exercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//div[@class='_2ft40Nx3NZII2i']")
    public WebElement trelloIconTopNav;

    @FindBy(xpath = "(//p[contains(.,'Create')])[1]")
    public WebElement createButton;

    @FindBy(xpath = "//button[@data-test-id='header-create-board-button']")
    public WebElement createBoardBtn;

    @FindBy(xpath = "//input[@data-test-id='create-board-title-input']")
    public WebElement boardTitleInput;

    @FindBy(xpath = "//div[@class=' css-1og2rpm']")
    public WebElement visibilityDropDown;

    @FindBy(xpath = "//button[@data-test-id='create-board-submit-button']")
    public WebElement createBtnBoardModal;

    public void colorPicker(String color){
        Driver.get().findElement(By.xpath("//button[@title='"+color+"']")).click();
    }
    public void boardPicker(String boardName){
        Driver.get().findElement(By.xpath("//div[@title='"+boardName+"']")).click();
    }
}
