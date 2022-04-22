@navigate
Feature: Navigation Menu

    Scenario Outline: Navigation to <pageName> page
      Given the user is on the Startseite
      When the user clicks the <pageName> button
      Then the user is on the <pageName> page

      Examples:
        | pageName |
        | Startseite|
        | Unser Konzept |
        | Team |
        | Kontakt |



      #verify page reload by checking for stale element then reloading the page then finding the element again then verifying the url