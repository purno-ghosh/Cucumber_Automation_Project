Feature: User should able to login an ecommerce site

  Scenario: Verify users can login to portal with valid credentials
    Given User visits e-commerce website
    When User enters valid credentials
    Then User can logged in successfully