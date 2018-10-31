@User
@UserCartCheck
Feature: verifyMyCart

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

#scenario
# when i add following items to shpping cart
#     |products| quantity
#   |Gel de dus Men Xtreme Polar, 40
#   |Ceas Fossil The Commuter FS5417
#   |Apa de toaleta Calvin Klein On
#     then I should see 3 items in the shopping cart