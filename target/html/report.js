$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Project_Junior/CucumberProject/ElefantCucumber/src/test/resources/elefantCucumber/verifyMyCart.feature");
formatter.feature({
  "name": "verifyMyCart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify my cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.write("WebDriver is load");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open elefant.ro website",
  "keyword": "When "
});
formatter.match({
  "location": "LoginOneSteps.i_open_elefant_ro_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to login fields",
  "keyword": "And "
});
formatter.match({
  "location": "LoginOneSteps.navigate_to_loghin_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"greek#5421@yahoo.com\" and \"Steelseries_85#\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iEnterUsernameAsAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open myCart",
  "keyword": "And "
});
formatter.match({
  "location": "CartPageSteps.iOpenMyCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have the products in myCart:",
  "rows": [
    {
      "cells": [
        "Gel de dus Men Xtreme Polar, 400 ml",
        "2 buc"
      ]
    },
    {
      "cells": [
        "Ceas Fossil The Commuter FS5417",
        "1 buc"
      ]
    },
    {
      "cells": [
        "Apa de toaleta Calvin Klein One Shock, 200 ml, Pentru Barbati",
        "3 buc"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CartPageSteps.iShouldHaveTheProductsInMyCartAnd(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \nExpected: is \u003c{Gel de dus Men Xtreme Polar, 400 ml\u003d2 buc, Ceas Fossil The Commuter FS5417\u003d1 buc, Apa de toaleta Calvin Klein One Shock, 200 ml, Pentru Barbati\u003d3 buc}\u003e\n     but: was \u003c{Ceas Fossil The Commuter FS5417\u003d1 buc, Sapiens. Scurta istorie a omenirii\u003d1 buc, Gel de dus Men Xtreme Polar, 400 ml\u003d2 buc, Apa de toaleta Calvin Klein One Shock, 200 ml, Pentru Barbati\u003d3 buc}\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\r\n\tat elefantCucumber.stepsDef.CartPageSteps.iShouldHaveTheProductsInMyCartAnd(CartPageSteps.java:39)\r\n\tat ✽.I should have the products in myCart:(C:/Project_Junior/CucumberProject/ElefantCucumber/src/test/resources/elefantCucumber/verifyMyCart.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});