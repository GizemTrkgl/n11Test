@HomePage
Feature: Home Page

  @Check
  Scenario: Check Login Page
    Given Gizem is on Home page
    When check img
    Then should see Home Page

  @Add @Delete
  Scenario Outline: Add and delete product
    Given Gizem is on Home page
    When Search "<product>"
    When Click search button
    Then Check search page
    When Choose 1. product
    When Check Product Page
    When Choose filter
    When Click add to cart
    When Go to cart
    Then Check product at cart
    When Delete product
    Then Check delete
    Examples:
      | product |
      | telefon |





