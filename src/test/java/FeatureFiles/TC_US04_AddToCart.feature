Feature: Adding an Item to Cart on CleverPPC Prestashop Store

  Scenario: TC_US04_AddToCart

    Given Navigate to cleverppccom
    When the user clicks on the Women category
    And the user clicks on the Summer dress product
    And the user hovers over a random product and clicks the Add to cart button
    Then the user successfully accesses the website
