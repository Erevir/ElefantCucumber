Feature: elefantTest

  Scenario: Login user
    When I open elefant.ro website
    And navigate to login fields
    And I fill login fields on the form and submit
    Then I should see successfully submitted
    And I logout from account

  @SmokeTest
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
      | user#53@yahoo.co1m    | core#53         |


  Scenario Outline: loginWrongErrors
    When I open elefant.ro website
    And navigate to login fields
    And I enter username as "<username>" and "<pwd>"
    And I submit
    Then I should see the following error messages:
      | field          | message                               |
      | username_error | <username_error>                      |
      | password_error | <password_error>                      |
      | general_error  | <general_error>                       |


    Examples:
      | username             | pwd            | username_error                   | password_error     | general_error                                  |
      | greek#5421@yahoo.com | Steelseries85# |                                  |                    | Email-ul si/sau parola introduse sunt gresite. |
      | use53@yahoo.com      | core53         |                                  |                    | Email-ul si/sau parola introduse sunt gresite  |
      |                      |                | Introdu o adresa de email!       | Introdu o parola ! |                                                |
      |                      | Steelser85#    | Introdu o adresa de email!       |                    |                                                |
      | user#53@yahoo.com    |                |                                  | Introdu o parola   |                                                |
      | gre21@yahoo.com      |                |                                  | Introdu o parola!  |                                                |
      | gre21yahoo.com       |                | Introdu o adresa de email valida | Introdu o parola   |                                                |


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

  Scenario:  Verify my cart
    When I open elefant.ro website
    And navigate to login fields
    And I enter username as "greek#5421@yahoo.com" and "Steelseries_85#"
    And I submit
    And I open myCart
    Then I should have the products in myCart:

      | Gel de dus Men Xtreme Polar, 400 ml                           | 2 buc |
      | Ceas Fossil The Commuter FS5417                               | 1 buc |
      | Apa de toaleta Calvin Klein One Shock, 200 ml, Pentru Barbati | 3 buc |

