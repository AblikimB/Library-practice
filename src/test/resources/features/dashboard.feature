@wip
Feature: As a librarian, I want to verify the information on dashboard

 Background:
   Given the librarian should be on the home page


  Scenario: verify total numbers of borrowed book
    When the librarian gets borrowed books number
    Then borrowed books number must be match expected number


  Scenario: verify total number of users
    When the librarian gets users number
    Then total users number must be match expected number
