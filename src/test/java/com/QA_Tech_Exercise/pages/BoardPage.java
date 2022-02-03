package com.QA_Tech_Exercise.pages;

import com.QA_Tech_Exercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BoardPage extends BasePage{

    @FindBy(xpath = "//span[@class='placeholder']")
    public WebElement addListBtn;

    @FindBy(xpath = "//textarea[@class='list-card-composer-textarea js-card-title']")
    public WebElement cardDetails;

    @FindBy(xpath = "//input[@value='Add card']")
    public WebElement addCartBtn;

    @FindBy(xpath = "//a[@class='icon-lg icon-close dark-hover js-cancel']")
    public WebElement xBtnForAddCard ;

    @FindBy(xpath = "//input[@class='list-name-input']")
    public WebElement listTitle;

    @FindBy(xpath = "//a[@aria-label='Cancel list editing']")
    public WebElement xBtnForAddList;

    @FindBy(xpath = "//button[@data-test-id='workspace-navigation-expand-button']")
    public WebElement expandSideBar;

    @FindBy(xpath = "//button[@data-test-id='workspace-navigation-collapse-button']")
    public WebElement collapseSideBar;

    public WebElement addTitleForNthList(int nthList){
        return Driver.get().findElement(By.xpath("(//div[@class='list-header-target js-editing-target'])["+nthList+"]"));
    }

    public List<WebElement> listNames(){
        return Driver.get().findElements(By.xpath("//div[@class='list-header-target js-editing-target']"));
    }

    public List<WebElement> cardNames(){
        return Driver.get().findElements(By.xpath("(//div[@class='list js-list-content'])/div[2]/a"));
    }

    public WebElement addCartForNthList(int nthList){
        return Driver.get().findElement(By.xpath("(//span[@class='js-add-a-card'])["+nthList+"]"));
    }

    public WebElement cardPicker(String cardName){
        return Driver.get().findElement(By.xpath("//span[@class='list-card-title js-card-name' and contains(.,'"+cardName+"')]"));
    }

    public WebElement listPicker(String listName){
        return Driver.get().findElement(By.xpath("//textarea[@aria-label='"+listName+"']"));
    }

}





