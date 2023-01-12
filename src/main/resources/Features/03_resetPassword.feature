@tag1
Feature: user reset his password
  Background:
    Given user navigate to the website
    And user click on login
    And user click on forgot password
    And user go to password recovery page
    And user enter his recover email
 #scenario1 pressing enter
    Scenario: message displayed when user enter his valid email by pressing enter
      When user press enter on email
      Then message displayed successfully
 #scenario2 pressing recover button
  Scenario: message displayed when user enter his valid email by pressing recover button
    When user press recover button
    Then message displayed successfully