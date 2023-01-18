Feature: As a librarian, I want to know books information
  @wip
  Scenario: verify total numbers of borrowed book
    Given the librarian on the home page
    When the librarian gets borrowed books number
    Then borrowed books number must be match expected result
