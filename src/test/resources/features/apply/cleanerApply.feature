Feature: Cleaner application flow

  Background:
    Given User is on the cleaner apply page

  Scenario: User must enter zip code for rate to continue on Cleaner Application Flow
    When User does not provide zip code and clicked on the Get Started button
    Then The focus of the page moved to enter zip code for salary rate text box.

  Scenario: User enter a valid zip code to obtain salary rate in order to start the flow
    When User enter a valid zip code "98005"
    Then Get Started button will be displayed to the user
    And User clicks on the Get Started button
    Then The application form to collect user info will be displayed
