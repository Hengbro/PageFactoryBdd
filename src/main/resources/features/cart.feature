Feature: Add Multiple Products to Cart

  Scenario: Add two products to cart
    Given User is on the login page
    When User logs in
    When User add to cart
    Then Both products are added to the cart