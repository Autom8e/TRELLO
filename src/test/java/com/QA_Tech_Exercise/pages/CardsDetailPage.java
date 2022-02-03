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
    public WebElement checklistTitle;

    @FindBy(xpath = "//textarea[@class='edit field checklist-new-item-text js-new-checklist-item-input']")
    public WebElement itemOfChecklist;

    @FindBy(xpath = "//a[@class='icon-lg icon-close dark-hover cancel js-cancel-checklist-item']")
    public WebElement xBtnForCheckListItem;

    @FindBy(xpath = "//a[@class='pop-over-header-close-btn icon-sm icon-close']")
    public WebElement xBtnForLabelModal;

    @FindBy(xpath = "//a[@class='icon-md icon-close dialog-close-button js-close-window']")
    public WebElement xBtnForCardModal;

    @FindBy(xpath = "//span[@class='checklist-item-details-text markeddown js-checkitem-name']")
    public WebElement item;


    public void labelPicker(String color){
        Driver.get().findElement
                (By.xpath("//span[@class='card-label mod-selectable card-label-"+color+"  js-select-label']")).click();
    }
}
