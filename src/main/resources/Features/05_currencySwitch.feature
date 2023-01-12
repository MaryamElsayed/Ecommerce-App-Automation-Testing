@tag1
Feature: Logged User could switch between currencies US-Euro
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    Scenario: Logged User could switch between currencies US-Euro
      When change from US Dollar to Euro
      Then Currency of all products changed to Euro
