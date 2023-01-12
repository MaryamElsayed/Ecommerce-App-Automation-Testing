@tag1
Feature: logged user can select different categories
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login

    Scenario: logged user could select different categories then hover on them and select sub category
      When user hover on Apparel category
      And user select Shoes subcategory
      Then sub category page appear