@tag1
Feature: Logged user could add different products to Wishlist
  Background:
    Given user navigate to the website
    And user click on login
    And user enter his email "maryamM@gmail.com" and his password "000000"
    And user press enter to login
    And user hover on Apparel category
    And user select Shoes subcategory
    Scenario: Logged user could add different products to Wishlist
      When user click on heart button
      And user chooses required fields in the product
      And click on add to wishlist
      Then a successful message of adding to wishlist displayed to the user
      When a user click on wish list link appear in the message
      Then user go to wish list page
      And find the product he added to the wish list