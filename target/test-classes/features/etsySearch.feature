
Feature: Etsy search feature

  Ticket Num AU756

  Scenario: Etsy default title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for


  Scenario: Etsy Search Functionality Title Verification
    Given use types Wooden Spoon in the search bar
    And user clicks to search button
    Then use sees title is Wood spoon | Etsy