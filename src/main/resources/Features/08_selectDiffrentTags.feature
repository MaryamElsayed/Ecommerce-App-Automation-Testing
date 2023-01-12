@tag1
Feature: Logged user could select different tags
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    Scenario: Logged user could select different tags
      When user go to search page
      And select awesome tage
      Then products with awesome tag displayed to the user