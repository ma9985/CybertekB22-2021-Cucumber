Feature: Examples of Cucumber data table implementation

  @wip
  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |
      | Cucumber   |

    @wip
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January |
      | February |
      | March |
      | April |
      | May |
      | June |
      | July |
      | August |
      | September |
      | October |
      | November |
      | December  |


    Scenario: Library login example using data table
      Given user is on the login page of library app
      When use enters username and password as below
      |username| librarian123@library.com|
      |password|9rfax809d                       |

      Then user should see title is Library
