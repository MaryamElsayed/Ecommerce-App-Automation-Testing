@tag1
Feature: Logged user could add different products to Shopping cart
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    And user hover on Apparel category
    And user select Shoes subcategory
    Scenario: Logged user could add different products to Shopping cart
      When user click on add to cart button
      And user chooses required fields in the product
      And click on add to cart
      Then a successful message displayed to the user
      When a user click on shopping cart link appear in the message
      Then user go to shopping cart page
      And find the product he added

