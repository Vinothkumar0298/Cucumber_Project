$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/contactvalid.feature");
formatter.feature({
  "name": "CRM website validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login page validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "name": "Login page is loaded",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \u003cusername\u003e and \u003cpassword\u003e and logged in",
  "keyword": "When "
});
formatter.step({
  "name": "Home page is loaded for CRM",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "nalini.maaya@gmail.com",
        "SujRam@1893"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login page validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.login_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the nalini.maaya@gmail.com and SujRam@1893 and logged in",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_enters_the_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is loaded for CRM",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.home_page_is_loaded_for_CRM()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create contact validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Functionaltest"
    },
    {
      "name": "@Smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.login_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password and clicks on login",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_enters_the_username_and_password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is loaded for CRM",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.home_page_is_loaded_for_CRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User moves to contacts page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_moves_to_contacts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates new contacts with the details",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_creates_new_contacts_with_the_details(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});