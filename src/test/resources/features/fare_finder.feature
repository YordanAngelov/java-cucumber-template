Feature: Best Fare Finder

  # Scenario 3 from Craig's email
  Scenario: Finding the cheapest route for a single journey from Aberdeen to York
    Given I am on www.thetrainline.com/farefinder
    When I look for trains from "Aberdeen" to "York"

    #TODO: Using the best fare finder, print out the times and price for the cheapest return from Aberdeen to York
    #TODO: Going out on the 11th Nov +/- 3 days, returning 25th Nov +/- 3 days

  # Everything below is
  Scenario: Plan Journey - find cheapest route for a single journey from Aberdeen to York
    #TODO: Using the best fare finder, print out the times and price for the cheapest return from Aberdeen to York
    #TODO: Going out on the 11th Nov +/- 3 days, returning 25th Nov +/- 3 days

  Scenario: Plan Journey - user attempts to plan for a date in the past
    #TODO: User attempts to plan a journey which occurs in the past - error message should be displayed

  Scenario Outline: Plan journey - find the closest station
    Given I am on the Station Finder
    And I have provided the Post Code <postCode>
    Then the closest station should be <station>

    Examples:
      | postCode    | station               |
      | BN12 4SE    | Durrington-on-Sea     |
      | BN3 7EP     | Aldrington            |