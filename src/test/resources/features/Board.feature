Feature: Board Flow

  Background:
    Given the user is logged in to the website

  @smoke
  Scenario: User able to create a board
    When the user clicks create button at top navigation
    And the user enters required fields for creating board
    Then the user successfully creates a new board


  Scenario: User able to add lists to the created board
    When the user selects "new board" from the boards options
    And the user creates "To Do" "In Progress" "In Testing" and "Done" lists
    Then The lists added to the board successfully


  Scenario: User able to add cards to the lists
    When the user selects "new board" from the boards options
    And the user selects "In Testing" list
    When the user adds "logo" "theme" "top bar" "nav bar" cards to the list
    Then The cards added to the list successfully


  Scenario: User able to drag to the selected card to specific list
    When the user selects "new board" from the boards options
    And the user selects "In Testing" list
    And the user drags "logo" card to "To Do" list
    Then The card "logo" successfully moved to the list


  Scenario: User able to add labels to the card
    When the user selects "new board" from the boards options
    And the user selects "To Do" list
    And the user selects "logo" card
    And the user adds "red" label to the card
    Then The label "red" added to the card


  Scenario: User able to add checklist and checklist item to the card
    When the user selects "new board" from the boards options
    And the user selects "In Testing" list
    And the user selects "theme" card
    And the user adds "Checklist for logo" checklist to the card
    And the user adds "Feedback from end user" item for the checklist
    Then the item "Feedback from end user" added to the checklist