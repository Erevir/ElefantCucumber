@User
@UserCheck
Feature: SettingsUserCheck

  Scenario Outline: SettingsUserCheck


    When navigate to login fields
    And I enter username as "<username>" and "<pwd>"
    And I submit
    And I navigate to settings page
    Then I should be check user

    Examples:
      | username             | pwd             |
      | greek#5421@yahoo.com | Steelseries_85# |
#      | user2                | Steelseries_85  |