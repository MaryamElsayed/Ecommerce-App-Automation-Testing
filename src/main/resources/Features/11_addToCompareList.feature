@tag1
Feature: Logged user could add different products to compare list
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    And user hover on Apparel category
    And user select Shoes subcategory
  Scenario: Logged user could add different products to compare list
    When user click on compare button
    Then a successful message of adding to compare list displayed to the user
    When a user click on compare list link appear in the message
    Then user go to compare list page
    And find the product he added to the compare list