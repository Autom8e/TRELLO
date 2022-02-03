Feature: Tax Rate Flow

  Background: Logged in to site with valid credentials
    Given The user logs in to the website with valid credentials
    When The user navigates to Tax Profiles page


  Scenario Outline: User able to create tax rates for added tax profiles
    Then The user selects the "QA1-SINGLE" to add task rate
    And The user enters "<Code>" "<Date From>" "<Date To>" "<Range From>" "<Range To>" "<Tax Rate>" "<Subtract>"
    Then The tax rate "<Code>" successfully created
    Examples:
      | Code        | Date From | Date To  | Range From | Range To | Tax Rate | Subtract |
      | 21SINGLE0   | 01012021  | 31122021 | 0          | 9100     | 0        | 0        |
      | 21SINGLE15  | 01012021  | 31122021 | 9101       | 14500    | 15       | 1365     |
      | 21SINGLE25  | 01012021  | 31122021 | 14501      | 19500    | 25       | 2815     |
      | 21SINGLE25H | 01012021  | 31122021 | 19501      | 60000    | 25       | 2725     |
      | 21SINGLE35  | 01012021  | 31122021 | 60001      | 999999   | 35       | 8725     |


  Scenario Outline: User able to edit tax rate
    Then The user selects the "QA1-SINGLE" tax profile to edit "21SINGLE35" tax rate
    And The user updates "<Date From>" "<Date To>" "<Range From>" "<Range To>" "<Tax Rate>" "<Subtract>" and "<Pt Status>"
    Then The tax rate "21SINGLE35" successfully edited
    Examples:
      | Date From | Date To  | Range From | Range To | Tax Rate | Subtract | Pt Status |
      | 01062020  | 31122020 | 50000      | 800000   | 45       | 9000     | unchecked |


  Scenario: User able to delete tax rate
    Then The user selects the "QA1-SINGLE" to delete tax rate
    And The user deletes "21SINGLE25" tax rate
    Then The tax rate "21SINGLE25" successfully deleted









