Feature: Plan Journey

  As a Customer
  I want to plan my journey
  So that I know what time I will Depart and Arrive and how much the journey will cost

  # Exercise 1 and 2
  Scenario Outline: Buying a single out ticket
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    Then I click on the button to retrieve the times and prices

    Examples:
    | originCity | destinationCity |
    | "Brighton" | "London"        |

  # Exercise 3
  Scenario Outline: Buying a return ticket
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose "Tomorrow" as Out date and "Next day" as Return date
    Then I click on the button to retrieve the times and prices

    Examples:
    | originCity | destinationCity |
    | "Brighton" | "London"        |

  # Exercise 4 only involved refactoring code into page objects
  # Exercise 5
  @wip
  Scenario Outline: Buying a return ticket X amount of days in the future
    Given I am on www.thetrainline.com main page
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose "Today" as Out date and Return date is "60" days later
    Then I click on the button to retrieve the times and prices

  Examples:
  | originCity | destinationCity |
  | "Brighton" | "London"        |
