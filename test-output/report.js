$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/yemioluv/eclipse-workspace/donationMvn/src/test/java/features/£20SingleDonation.feature");
formatter.feature({
  "line": 1,
  "name": "£20 single donation",
  "description": "",
  "id": "£20-single-donation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "verify user can donate £20 single donation",
  "description": "",
  "id": "£20-single-donation;verify-user-can-donate-£20-single-donation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigate to https://alzheimers-donations.wpnc-uat.site/",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click donate twenty pound",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click donation amount continue tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click credit/debit card payment type",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003ccardNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user fill my detail page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user fill my address page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click Is this address also your billing address checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click single donation confirm page complete donation tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Thank you for your donation page should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "£20-single-donation;verify-user-can-donate-£20-single-donation;",
  "rows": [
    {
      "cells": [
        "cardNumber"
      ],
      "line": 16,
      "id": "£20-single-donation;verify-user-can-donate-£20-single-donation;;1"
    },
    {
      "cells": [
        "4000000000001000"
      ],
      "line": 17,
      "id": "£20-single-donation;verify-user-can-donate-£20-single-donation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "verify user can donate £20 single donation",
  "description": "",
  "id": "£20-single-donation;verify-user-can-donate-£20-single-donation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigate to https://alzheimers-donations.wpnc-uat.site/",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click donate twenty pound",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click donation amount continue tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click credit/debit card payment type",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters \"4000000000001000\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user fill my detail page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user fill my address page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click Is this address also your billing address checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click single donation confirm page complete donation tab",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Thank you for your donation page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "£20MonthlyDonationSteps.user_navigate_to_https_alzheimers_donations_wpnc_uat_site()"
});
formatter.result({
  "duration": 4206250918,
  "status": "passed"
});
formatter.match({
  "location": "£20SingleDonationSteps.user_click_donate_twenty_pound()"
});
formatter.result({
  "duration": 153183592,
  "status": "passed"
});
formatter.match({
  "location": "£20MonthlyDonationSteps.user_click_donation_amount_continue_tab()"
});
formatter.result({
  "duration": 4791008738,
  "status": "passed"
});
formatter.match({
  "location": "£50SingleDonationSteps.user_click_credit_debit_card_payment_type()"
});
formatter.result({
  "duration": 789213215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4000000000001000",
      "offset": 13
    }
  ],
  "location": "£50SingleDonationSteps.user_enters(String)"
});
formatter.result({
  "duration": 6125417256,
  "status": "passed"
});
formatter.match({
  "location": "£20MonthlyDonationSteps.user_fill_my_detail_page()"
});
formatter.result({
  "duration": 788838555,
  "status": "passed"
});
formatter.match({
  "location": "£20MonthlyDonationSteps.user_fill_my_address_page()"
});
formatter.result({
  "duration": 402629004,
  "status": "passed"
});
formatter.match({
  "location": "£50SingleDonationSteps.user_click_Is_this_address_also_your_billing_address_checkbox()"
});
formatter.result({
  "duration": 690978309,
  "status": "passed"
});
formatter.match({
  "location": "£50SingleDonationSteps.user_click_single_donation_confirm_page_complete_donation_tab()"
});
formatter.result({
  "duration": 367351376,
  "status": "passed"
});
formatter.match({
  "location": "£20MonthlyDonationSteps.thank_you_for_your_donation_page_should_be_displayed()"
});
formatter.result({
  "duration": 229701264,
  "status": "passed"
});
});