@tag1
Feature:logged user user can search for any product
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login

  Scenario: logged user could search for any product
    When type in the search bar the product he wants
    And click on search button
    Then products should display that contains the searched word