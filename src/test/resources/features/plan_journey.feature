Feature: Plan Journey

  As a Customer
  I want to plan my journey
  So that I know what time I will Depart and Arrive and how much the journey will cost

  Scenario Outline: Exercise One and Two
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    Then I click on the button to retrieve the times and prices

    Examples:
    | originCity | destinationCity |
    | "Brighton" | "London"        |

  Scenario Outline: Exercise Three and Four
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose "Tomorrow" as Out date and "Next day" as Return date
    Then I click on the button to retrieve the times and prices

  Examples:
  | originCity | destinationCity |
  | "Brighton" | "London"        |

  Scenario Outline: Exercise Five
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose "Today" as Out date and Return date is "60" days later
    Then I click on the button to retrieve the times and prices

  Examples:
  | originCity | destinationCity |
  | "Brighton" | "London"        |
