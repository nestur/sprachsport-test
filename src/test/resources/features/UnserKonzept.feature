@unser-konzept
  Feature: Unser Konzept Menu Options

    Background:
      Given the user is on the Unser Konzept page

    Scenario: Sprachen Option
      When the user cliks the Sprachen button
      Then the user should see the relevant content to Sprachen

    Scenario Outline: <Button> Option
      When the user clicks the <Button> button
      Then the user should see the relevant content to <Button>

        Examples:
        | Button |
        | Methode |
        | Sport |
        | Sprachen |
        | Unterscheidungsmerkmal |


    Scenario Outline: <Topic> Option Content
      When the user clicks the <Button> button
      Then the user should be redirected to the <Page> page
      And the user should see relevant content to <Page>

      Examples:
        | Topic | Button | Page |
        | Methode | Mehr erfahren | Natuerliche Herangehensweise |
        | Sport | Ein Beispiel | Ein Beispiel |
        | Unterscheidungsmerkmal | Mehr erfahren | Unterscheidungsmerkmal |








