@tag1
Feature:Logged user could filter with color
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    And user hover on Apparel category
    And user select Shoes subcategory

    Scenario:Logged user could filter with color
      When user select a red color
      Then shoes with red color only appeared