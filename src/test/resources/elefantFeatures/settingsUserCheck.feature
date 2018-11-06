@User
@SmokeTest
Feature: SettingsUserCheck

  Scenario Outline: SettingsUserCheck


    When navigate to login fields
    And I enter username as "<username>" and "<pwd>"
    And I take a screenshot
    And I submit
    And I navigate to settings page
    Then I should be check user
    Then I take a screenshot

    Examples:
      | username             | pwd             |
      | greek#5421@yahoo.com | Steelseries_85# |
#      | user2                | Steelseries_85  |