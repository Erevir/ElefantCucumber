@Login
@LoginErrorCheck
Feature: loginWrongLoginErrorsCheck


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
         |                      |                | Introdu o adresa de email!       | Introdu o parola! |                                                |
         |                      | Steelser85#    | Introdu o adresa de email!       |                    |                                                |
         | user#53@yahoo.com    |                |                                  | Introdu o parola   |                                                |
         | gre21@yahoo.com      |                |                                  | Introdu o parola!  |                                                |
         | gre21yahoo.com       |                | Introdu o adresa de email valida! | Introdu o parola!   |                                                |
