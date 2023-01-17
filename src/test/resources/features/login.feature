Feature:user login
  Background: user on the login page
  Scenario:user should be able to login with valid credential
    When : user enters username and password
    And : user click login button
    Then : user should be able to login dashboard