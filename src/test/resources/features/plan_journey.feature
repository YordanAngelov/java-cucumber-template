Feature: Plan Journey

  As a Customer
  I want to plan my journey
  So that I know what time I will Depart and Arrive and how much the journey will cost

  Background: Going to thetrainline.com main page
    Given I am on www.thetrainline.com main page

  # Exercise 1 and 2
  Scenario Outline: Buying a single out ticket
    When I search for trains from <originCity> to <destinationCity>
    Then I click on the button to retrieve the times and prices

    Examples:
    | originCity | destinationCity |
    | "Brighton" | "London"        |

  # Exercise 3 and Scenario 2 from Craig's email
  Scenario Outline: Buying a return ticket
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose <outDate> as Out date and <returnDate> as Return date using buttons
    Then I click on the button to retrieve the times and prices

    Examples:
      | originCity | destinationCity | outDate | returnDate |
      | "Brighton" | "London"        | "Tomorrow" | "Next day" |
      | "Brighton" | "London"        | "Today"    | "Same day" |

  # Exercise 4 only involved refactoring code into page objects
  # Exercise 5
  Scenario Outline: Buying a return ticket X amount of days in the future
    When I search for trains from <originCity> to <destinationCity>
    And I click the return radio button
    And Choose "Today" as Out date and Return date is "150" days later
    Then I click on the button to retrieve the times and prices

  Examples:
  | originCity | destinationCity | OutDate | ReturnDate |
  | "Brighton" | "London"        | "Today" | "Next day" |

  # Extra credit 1 and Scenario 1 from Craig's email
  @wip
  Scenario Outline: Buying an outward ticket for an X amount of adults and Y amount of kids
    When I search for trains from <originCity> to <destinationCity>
    And I click on menu to change the amount of travelling adults to <adultNumber> and kids to <kidsNumber>
    Then I click on the button to retrieve the times and prices
    And I check the passenger amount is <adultNumber> adults and <kidsNumber> kids

    Examples:
      | originCity | destinationCity | adultNumber | kidsNumber |
      | "Brighton" | "London"        | "2"         | "2"        |

  # Scenario 2 from Craig's email
  Scenario: Buying a ticket returning on the same day
    When