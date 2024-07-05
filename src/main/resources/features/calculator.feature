Feature: Calculator

  Scenario: Add two numbers
    Given The calculator app is open
    When I add 2 and 3
    Then The result should be 5

  Scenario: Add two numbers
    Given The calculator app is open
    When I add 4 and 5
    Then The result should be 9
