Feature: Newspaper Delivery

  Scenario: FirstApproach
    Given the following feature.street definition: 1,2,3,4,5,6,7
    And FirstApproach for delivering newpapers
    Then delivery will be done in the following order: 1,3,5,7,6,4,2
    And will cross the road one time

  Scenario: SecondApproach
    Given the following feature.street definition: 1,2,3,4,5,6,7
    And SecondApproach for delivering newpapers
    Then delivery will be done in the following order: 1,2,3,4,5,6,7
    And will cross the road 6 times

  Scenario: SecondApproach
    Given the following feature.street definition: 1,2,4,6,8,3,5,7
    And SecondApproach for delivering newpapers
    Then delivery will be done in the following order: 1,2,4,6,8,3,5,7
    And will cross the road 2 times