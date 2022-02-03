$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Board.feature");
formatter.feature({
  "name": "Board Flow",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User able to add lists and cards to the created board",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
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
formatter.step({
  "name": "the user selects \"new board\" from the boards options",
  "keyword": "And "
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
  "name": "the user adds following cards to the list",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.the_user_adds_following_cards_to_the_list(com.sun.tools.javac.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat io.cucumber.datatable.DataTableTypeRegistryTableConverter.convert(DataTableTypeRegistryTableConverter.java:86)\n\tat io.cucumber.datatable.DataTable.convert(DataTable.java:360)\n\tat io.cucumber.core.stepexpression.StepExpressionFactory.lambda$createExpression$4(StepExpressionFactory.java:63)\n\tat io.cucumber.core.stepexpression.DataTableArgument.getValue(DataTableArgument.java:19)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:47)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n",
  "status": "failed"
});
formatter.step({
  "name": "The cards added to the list successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.QA_Tech_Exercise.step_definitions.DashBoardStepDefs.theCardsAddedToTheListSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});