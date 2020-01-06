Feature: £20 single donation

  Scenario Outline: verify user can donate £20 single donation
    Given user navigate to https://alzheimers-donations.wpnc-uat.site/
    And user click donate twenty pound
    And user click donation amount continue tab
    And user click credit/debit card payment type
    And user enters "<cardNumber>"
    And user fill my detail page
    And user fill my address page
    And user click Is this address also your billing address checkbox
    When user click single donation confirm page complete donation tab
    Then Thank you for your donation page should be displayed

    Examples: 
      | cardNumber       |
      | 4000000000001000 |
