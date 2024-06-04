Feature: verifying OMR Branch hotel Login

  Scenario Outline: verifying Login with valid credentials
    Given User is on the OMR branch Hotel Page
    When User login "<username>","<password>"
    Then User should verify success message after login "Welcome Monisha"

    Examples: 
      | username              | password  |
      | monishav415@gmail.com | Moni@1511 |
