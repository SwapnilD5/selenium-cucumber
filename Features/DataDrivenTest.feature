Feature: Calculator Functionality

@DataDriven
  Scenario Outline: Test Case to verify Calculator functionality
    Given Open chrome and navigate to calculate page
    When Enter two numbers "<firstNumber>" and "<secondNumber>" with operator "<operator>"
    Then Validate output "<Result>"

    Examples: 
      | firstNumber | secondNumber | operator | Result |
      |           4 |            3 | +        |      7 |
      |           8 |            2 | -        |      6 |
      |           5 |            2 | *        |     10 |