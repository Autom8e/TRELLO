package com.QA_Tech_Exercise.pages;

import com.QA_Tech_Exercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardsDetailPage extends BasePage{

    @FindBy(xpath = "//a[@class='button-link js-edit-labels']")
    public WebElement labelsBtn;

    @FindBy(xpath = "//a[@class='button-link js-add-checklist-menu']")
    public WebElement checklistBtn;

    @FindBy(xpath = "//input[@value='Checklist']")
    public WebElement checklistTitle;     //burada entry sonrası hit enter

    @FindBy(xpath = "//textarea[@class='edit field checklist-new-item-text js-new-checklist-item-input']")
    public WebElement itemOfChecklist;    //burada entry sonrası hit enter

    @FindBy(xpath = "//a[@class='icon-lg icon-close dark-hover cancel js-cancel-checklist-item']")
    public WebElement xBtnForCheckListItem; // burası checklist item kadar x butonu buluyor yani en son x butonu bulmalısın

    @FindBy(xpath = "//a[@class='icon-md icon-close dialog-close-button js-close-window']")
    public WebElement xBtnForCardModal;


    public void labelPicker(String color){
        Driver.get().findElement
                (By.xpath("//span[@class='card-label mod-selectable card-label-"+color+"  js-select-label']")).click();
    }
}
