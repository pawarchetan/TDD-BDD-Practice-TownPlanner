Feature: Street

  Scenario: Invalid feature.street definition - with duplicates
    Given the following feature.street definition: 1, 2, 3, 4, 4
    When checking for validity
    Then it must be invalid

  Scenario: Invalid feature.street definition - starts with 2
    Given the following feature.street definition: 2, 3, 4, 5
    When checking for validity
    Then it must be invalid

  Scenario: Invalid feature.street definition - skipped one number
    Given the following feature.street definition: 1, 2, 3, 5, 6, 7
    When checking for validity
    Then it must be invalid

  Scenario: Valid feature.street definition
    Given the following feature.street definition: 2, 1, 3, 4, 5, 6, 7, 8, 9, 10
    When checking for validity
    Then it must be valid

  Scenario: Valid feature.street definition - 1 3 5 7 2 4 6 8
    Given the following feature.street definition: 1, 2, 4, 6, 8, 10, 3, 5, 7, 9
    When checking for validity
    Then it must be valid

  Scenario: Valid feature.street definition - even followed by odd
    Given the following feature.street definition: 1, 2, 4, 6, 8, 10, 3, 5, 7, 9
    When checking for validity
    Then it must be valid

  Scenario: Street count
    Given the following feature.street definition: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    When Counting
    Then count must be 10

  Scenario: Left hand count
    Given the following feature.street definition: 1, 3, 5, 4, 2
    When counting left hand side
    Then count must be 3

  Scenario: Right hand count
    Given the following feature.street definition: 1, 2, 4, 6, 3, 5, 7
    When counting right hand side
    Then count must be 3