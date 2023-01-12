@tag1
Feature: Create successful Order
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    And user hover on Apparel category
    And user select Shoes subcategory
    And user click on add to cart button
    And user chooses required fields in the product
    And click on add to cart
    And a successful message displayed to the user
    And a user click on shopping cart link appear in the message
    And user go to shopping cart page
    Scenario: Create successful Order
      When user accept terms of service
      And click on checkout
      And user enter his required information to continue shipment
      And user complete order
      Then message displayed that order placed successfully

