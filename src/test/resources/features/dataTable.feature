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
    Scenario: Library login example using data table
      Given user is on the login page of library app
      When use enters username and password as below
      |username| librarian123@library.com|
      |password|9rfax809d                       |

      Then user should see title is Library
