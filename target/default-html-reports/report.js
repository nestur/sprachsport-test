$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NavigationMenu.feature");
formatter.feature({
  "name": "Navigation Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Navigation to \u003cpageName\u003e page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Startseite",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks the \u003cpageName\u003e button",
  "keyword": "When "
});
formatter.step({
  "name": "the user is on the \u003cpageName\u003e page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "pageName"
      ]
    },
    {
      "cells": [
        "Startseite"
      ]
    },
    {
      "cells": [
        "Unser Konzept"
      ]
    },
    {
      "cells": [
        "Team"
      ]
    },
    {
      "cells": [
        "Kontakt"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Navigation to Startseite page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Startseite",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Startseite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Startseite button",
  "keyword": "When "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_clicks_the_Startseite_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Startseite page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Startseite_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigation to Unser Konzept page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Startseite",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Startseite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Unser Konzept button",
  "keyword": "When "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_clicks_the_Unser_Konzept_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Unser Konzept page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Unser_Konzept_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigation to Team page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Startseite",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Startseite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Team button",
  "keyword": "When "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_clicks_the_Team_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Team page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Team_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigation to Kontakt page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Startseite",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Startseite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Kontakt button",
  "keyword": "When "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_clicks_the_Kontakt_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Kontakt page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sprachsport.step_definitions.NavigateMenuStepDef.the_user_is_on_the_Kontakt_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});