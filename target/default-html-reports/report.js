$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Board.feature");
formatter.feature({
  "name": "Board Flow",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in to the website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.LoginStepDefs.the_user_is_logged_in_to_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User able to add checklist to the card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user selects \"new board\" from the boards options",
  "keyword": "When "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theUserSelectsFromTheBoardsOptions(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects \"Done\" list",
  "keyword": "And "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theUserSelectsList(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects \"logo\" card",
  "keyword": "And "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theUserSelectsCard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds \"Checklist for logo\" checklist to the card",
  "keyword": "And "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theUserAddsChecklistToTheCard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds \"Feedback from end user\" item for the checklist",
  "keyword": "And "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theUserAddsItemForTheChecklist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item \"Feedback from end user\" added to the checklist",
  "keyword": "Then "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theItemAddedToTheChecklist(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});