@stories
Feature: Utest
  Enter the page Utest and register a new user
  @scenario1
  Scenario: Search for a Join Today
    Given than Danna wants to Join Today
    When she fills in the required fields of the form
      |strFirstName|strLastName|strEmail|strCity|strPostalCode|strPassword|strConfirmPassword|
      |Danna|Paz|danitagerald@hotmail.com|Pasto  |520001      |D@n@P@z2021  |D@n@P@z2021|
    Then She has been registered
    |strWelcome|
    |Welcome to the world's largest community of freelance software testers! |