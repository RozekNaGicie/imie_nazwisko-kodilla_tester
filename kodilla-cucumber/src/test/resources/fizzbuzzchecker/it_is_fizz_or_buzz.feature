Feature: Is it fizz or buzz?
  What this number return

  Scenario Outline: This number is fizz or buzz or both
    Given <number> and return
    When I asked this number is fizz or buzz or both
    Then I get <answer>
    Examples:
      | number | answer   |
      | 3 is divide by three     | "Fizz"     |
      | 5 is divide by five    | "Buuz"     |
      | 15  is divide by five and three   | "FizzBuzz" |
      |   31 is not divide by five or three or both of them    |   "None"         |