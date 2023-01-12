@tag1
Feature: user register to the app
  Background:
    Given user navigate to the website
    And user click on register
    And user selected his gender
    And user enter his first name
    And user enter his last name
    #And user selected his date
    And user enter his email
    And user enter his company name
    And user enter his password
    And user confirm his password
 #scenario1 when user press enter to register
  Scenario: user register with valid data by pressing enter
    When user press enter
    Then message of successfully registration displayed




