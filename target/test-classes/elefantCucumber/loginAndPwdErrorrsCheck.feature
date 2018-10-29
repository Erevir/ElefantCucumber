Feature: loginAndPwdErrorsCheck


#  Scenario Outline: loginAndPwdErrors
#    When I open elefant.ro website
#    And navigate to login fields
#    And I enter username as "<username>" and "<pwd>"
#    And I submit
#    Then I should see foreach "<caseError>" the following pwd "<error messages>"
#
#    Examples:
#      | caseError        | username             | pwd            | error messages                                     |
#      | usernameAndOrPwd | greek#5421@yahoo.com | Steelseries85# | Email-ul si/sau parola introduse sunt gresite.     |
#      | usernameAndOrPwd | use53@yahoo.com      | core53         | Email-ul si/sau parola introduse sunt gresite.     |
#      | userameAndPwd    |                      |                | Introdu o adresa de email!Introdu o parola!        |
#      | username         |                      | Steelser85#    | Introdu o adresa de email!                         |
#      | password         | user#53@yahoo.com    |                | Introdu o parola!                                  |
#      | password         | gre21@yahoo.com      |                | Introdu o parola!                                  |
#      | userameAndPwd    | gre21yahoo.com       |                | Introdu o adresa de email valida!Introdu o parola!                              |
