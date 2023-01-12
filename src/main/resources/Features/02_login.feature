@tag1
Feature: user login to the app
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
  #scenario1 when user press enter to login
  Scenario:user could login with valid data by pressing enter
    When user press enter to login
    Then user can login successfully


