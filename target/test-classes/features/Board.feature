Feature: Board Flow

  Scenario: User able to create a board
    Given the user is logged in to the website
    And the user clicks create button at top navigation
    And the user enters required fields for creating board
    Then the user successfully creates a new board
  @wip
  Scenario: User able to add lists and cards to the created board
    Given the user is logged in to the website
    And the user selects "new board" from the boards options
    #And the user creates "To Do" "In Progress" "In Testing" and "Done" lists

      #burada kaldım
    And the user selects "Done" list
    When the user adds following cards to the list
      | logo    |
      | theme   |
      | top bar |
      | nav bar |
    Then The cards added to the list successfully


  Scenario: User able to add lists and cards to the created board Version2
    Given the user is logged in to the website
    And the user selects "new board" from the boards options
    And the user creates "To Do" "In Progress" "In Testing" and "Done" lists

    And the user selects "In Testing" list
    When the user adds "logo" "theme" "top bar" "nav bar" cards to the list
    Then The cards added to the list successfully

  Scenario: User able to drag to the selected card to specific list
    Given the user is logged in to the website
    And the user selects "new board" from the boards options
    And the user selects "In Testing" list
    And the user drags "logo" card to "To Do" list
    Then The card "logo" successfully moved to the list

  Scenario: User able to add labels to the card
    Given the user is logged in to the website
    And the user selects "new board" from the boards options
    And the user selects "Done" list
    And the user selects "logo" card
    Then the user adds "green" label to the card


  Scenario: User able to add checklist to the card
    Given the user is logged in to the website
    And the user selects "new board" from the boards options
    And the user selects "Done" list
    And the user selects "logo" card
    Then the user adds "Checklist for logo" checklist to the card