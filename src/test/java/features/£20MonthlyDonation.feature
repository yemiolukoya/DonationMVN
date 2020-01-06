Feature: Donate £20 monthly donation

Scenario: verify user can donate £20

Given user navigate to https://alzheimers-donations.wpnc-uat.site/
And user click on monthly donation tab
And user click £20 tab
And user click landing page continue tab
And user click donation amount continue tab
And user fill my detail page
And user fill my address page
And user fill direct debit detail page
And user click your details continue tab
When user click confirm page complete donation tab
Then Thank you for your donation page should be displayed
