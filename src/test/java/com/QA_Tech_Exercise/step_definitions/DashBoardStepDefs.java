package com.QA_Tech_Exercise.step_definitions;

import com.QA_Tech_Exercise.pages.BoardPage;
import com.QA_Tech_Exercise.pages.CardsDetailPage;
import com.QA_Tech_Exercise.pages.DashboardPage;
import com.QA_Tech_Exercise.utilities.BrowserUtils;
import com.QA_Tech_Exercise.utilities.Driver;
import com.sun.tools.javac.util.List;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class DashBoardStepDefs {
    WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
    DashboardPage dashboardPage = new DashboardPage();
    BoardPage boardPage = new BoardPage();
    String globalListname;
    Actions actions = new Actions(Driver.get());
    List<String> globalCardNames;
    CardsDetailPage cardsDetailPage = new CardsDetailPage();

    @Given("the user clicks create button at top navigation")
    public void the_user_clicks_create_button_at_top_navigation() {
        dashboardPage.createButton.click();
    }

    @Given("the user enters required fields for creating board")
    public void the_user_enters_required_fields_for_creating_board() {
        dashboardPage.createBoardBtn.click();
        dashboardPage.boardTitleInput.sendKeys("new board");
        dashboardPage.colorPicker("Green");
        BrowserUtils.waitFor(1);
        dashboardPage.createBtnBoardModal.click();
    }

    @Then("the user successfully creates a new board")
    public void the_user_successfully_creates_a_new_board() {
        wait.until(ExpectedConditions.titleContains("new board"));
    }

    @And("the user selects {string} from the boards options")
    public void theUserSelectsFromTheBoardsOptions(String boardName) {
        BrowserUtils.waitFor(2);
        dashboardPage.boardPicker(boardName);
    }

    @And("the user creates {string} {string} {string} and {string} lists")
    public void theUserCreatesAndLists(String list1, String list2, String list3, String list4) {
        boardPage.addListBtn.click();
        boardPage.listTitle.sendKeys(list1 + Keys.ENTER);
        boardPage.listTitle.sendKeys(list2 + Keys.ENTER);
        boardPage.listTitle.sendKeys(list3 + Keys.ENTER);
        boardPage.listTitle.sendKeys(list4 + Keys.ENTER);
    }

    @And("the user selects {string} list")
    public void theUserSelectsList(String listName) {
        globalListname = listName;
    }
    @When("the user adds following cards to the list")
    public void the_user_adds_following_cards_to_the_list(List<String> cardName) {
        System.out.println(cardName.toString());

        BrowserUtils.waitFor(2);
        if (globalListname.equals("To Do")) {
            boardPage.addCartForNthList(1).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        } else if (globalListname.equals("In Progress")) {
            boardPage.addCartForNthList(2).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        } else if (globalListname.equals("In Testing")) {
            boardPage.addCartForNthList(3).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        } else if (globalListname.equals("Done")) {
            boardPage.addCartForNthList(4).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        }

    }

    /*
    @When("the user adds following cards to the list")
    public void theUserAddsFollowingCardsToTheList(ArrayList<String> cardName) {

        System.out.println(cardName.toString());

        BrowserUtils.waitFor(2);
        if (globalListname.equals("To Do")) {
            boardPage.addCartForNthList(1).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        } else if (globalListname.equals("In Progress")) {
            boardPage.addCartForNthList(2).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        } else if (globalListname.equals("In Testing")) {
            boardPage.addCartForNthList(3).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        } else if (globalListname.equals("Done")) {
            boardPage.addCartForNthList(4).click();
            for (int i = 0; i < cardName.size(); i++) {
                boardPage.cardDetails.sendKeys(cardName.get(i) + Keys.ENTER);
            }
        }

    }

     */

    @Then("The cards added to the list successfully")
    public void theCardsAddedToTheListSuccessfully() {
        /*
        ArrayList<String> actualCardNames = new ArrayList<>();

        for (int i = 0; i < globalCardNames.size(); i++) {
            actualCardNames.add(boardPage.cardPicker(globalCardNames.get(i)).getText());
        }
        Assert.assertEquals(actualCardNames, globalCardNames);

         */
    }

    @When("the user adds {string} {string} {string} {string} cards to the list")
    public void theUserAddsCardsToTheList(String card1, String card2, String card3, String card4) {
        wait.until(ExpectedConditions.elementToBeClickable(boardPage.addCartForNthList(4)));

        if (globalListname.equals("To Do")) {
            boardPage.addCartForNthList(1).click();
            boardPage.cardDetails.sendKeys(card1 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card2 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card3 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card4 + Keys.ENTER);
            boardPage.xBtnForAddCard.click();
        }else if(globalListname.equals("In Progress")){
            boardPage.addCartForNthList(2).click();
            boardPage.cardDetails.sendKeys(card1 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card2 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card3 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card4 + Keys.ENTER);
            boardPage.xBtnForAddCard.click();
        }else if(globalListname.equals("In Testing")){
            boardPage.addCartForNthList(3).click();
            boardPage.cardDetails.sendKeys(card1 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card2 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card3 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card4 + Keys.ENTER);
            boardPage.xBtnForAddCard.click();
        }else if(globalListname.equals("Done")){
            boardPage.addCartForNthList(4).click();
            boardPage.cardDetails.sendKeys(card1 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card2 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card3 + Keys.ENTER);
            boardPage.cardDetails.sendKeys(card4 + Keys.ENTER);
            boardPage.xBtnForAddCard.click();
        }
    }

    @And("the user drags {string} card to {string} list")
    public void theUserDragsCardToList(String cardName, String listName) {
        actions.dragAndDrop(boardPage.cardPicker(cardName),boardPage.listPicker(listName)).perform();
        BrowserUtils.waitFor(1);
    }


    @Then("The card {string} successfully moved to the list")
    public void theCardSuccessfullyMovedToTheList(String cardName) {
    }

    @And("the user selects {string} card")
    public void theUserSelectsCard(String cardName) {
        boardPage.cardPicker(cardName).click();
    }

    @Then("the user adds {string} label to the card")
    public void theUserAddsLabelToTheCard(String labelColor){
        wait.until(ExpectedConditions.elementToBeClickable(cardsDetailPage.labelsBtn));
        cardsDetailPage.labelsBtn.click();
        cardsDetailPage.labelPicker(labelColor);
        cardsDetailPage.xBtnForCardModal.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user adds {string} checklist to the card")
    public void theUserAddsChecklistToTheCard(String checklistTitle) {
        cardsDetailPage.checklistBtn.click();
        BrowserUtils.waitFor(1);
        cardsDetailPage.checklistTitle.sendKeys(checklistTitle + Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(cardsDetailPage.itemOfChecklist));
        cardsDetailPage.itemOfChecklist.sendKeys("Feedback from end user" + Keys.ENTER);
        cardsDetailPage.xBtnForCheckListItem.click();
        BrowserUtils.waitFor(1);
        cardsDetailPage.xBtnForCardModal.click();
    }
}