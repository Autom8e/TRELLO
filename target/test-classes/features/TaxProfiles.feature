Feature: Tax Profile Flow

  Background: Logged in to site with valid credentials
    Given The user logs in to the website with valid credentials
    When The user navigates to Tax Profiles page

  Scenario Outline: User able to add tax profile
    And The user enters "<Tax Profile>" "<Tax Profile Description>" "<FSS Status>" "<Annual Projected Gross>"
    Then The tax profile "<Tax Profile>" created
    Examples:
      | Tax Profile | Tax Profile Description | FSS Status | Annual Projected Gross |
      | QA1         | FSS Single              | FSS Part   | checked                |


  Scenario Outline: User able to edit tax profile
    Then The user selects the "QA1" tax profile to edit
    And The user updates "<Tax Profile Description>" "<FSS Status>" "<Annual Projected Gross>"
    Then The tax profile "QA1" successfully edited
    Examples:
      | Tax Profile Description | FSS Status | Annual Projected Gross |
      | FSSChange1              | FSS Main   | checked                |


  Scenario: User able to delete tax profile
    And The user highlights the "QA1" to delete tax profile
    Then The tax profile "QA1" successfully deleted


  Scenario Outline: Logged in user able to create new tax profile
    And The user enters "<Tax Profile>" "<Tax Profile Description>" "<FSS Status>" "<Annual Projected Gross>"
    Then The tax profile "<Tax Profile>" successfully created
    Examples:
      | Tax Profile | Tax Profile Description           | FSS Status | Annual Projected Gross |
      | QA1-SINGLE  | FSS Main Method Single Tax Bands  | FSS Main   | checked                |
      #| QA2-MARRIED | FSS Main Method Married Tax Bands | FSS Main   | checked                |
      #| QA3-PARENT  | FSS Main Method Parent Tax Bands  | FSS Main   | checked                |






