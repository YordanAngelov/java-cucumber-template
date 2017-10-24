Feature: Plan Journey

  As a Customer
  I want to plan my journey
  So that I know what time I will Depart and Arrive and how much the journey will cost

  Scenario Outline: Exercise Five
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose "Today" as Out date and Return date is "5" days later
    Then I click on the button to retrieve the times and prices

  Examples:
  | originCity | destinationCity |
  | "Brighton" | "London"        |
