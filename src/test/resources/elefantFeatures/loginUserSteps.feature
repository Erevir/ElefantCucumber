
@Login
@SmokeTest

Feature: loginUserSteps

  Scenario Outline: UserWithParam
    When I open elefant.ro website
    And navigate to login fields
    And I enter username as "<username>" and "<pwd>"
    And I submit
    Then I should be successfully authenticated
    And I logout from account

    Examples:
      | username             | pwd             |
      | greek#5421@yahoo.com | Steelseries_85# |
#      | user#53@yahoo.co1m    | core#53         |