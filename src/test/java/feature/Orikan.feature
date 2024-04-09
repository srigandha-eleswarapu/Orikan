Feature: Orikan
#*********************************************************************************************************************************
  @Scenario1
  Scenario Outline: Launch the Orikan website and the email address field is accepting space validation
    Given Launch the Orikan Website "<URL>"
    When Enter the all the fields "<Email>" "<Password>" "<ConfirmPass>"
    Then Validate that Email field is accepting spaces and not throwing any error "<Email>"

    Examples:
      | URL                                                  | Email     | Password | ConfirmPass |
      | https://orikan-ui-automation-test.azurewebsites.net/ | sd er@df.com | tyu      | tyu         |
#*********************************************************************************************************************************
  @Scenario2
  Scenario Outline: Launch the Orikan website and navigate to Contact Page to see State dropdown validation
    Given Launch the Orikan Website "<URL>"
    When Enter the all the fields "<Email>" "<Password>" "<ConfirmPass>"
    And click on next button
    Then Enter all Mandatory Fields in Contact Page "<FirstName>" "<LastName>" "<Address1>" "<Postcode>" "<City>" "<State>"
    And Validate that the Preferred Full Name field is showing extra space "<FirstName>" "<LastName>"

    Examples:
      | URL                                                  | Email     | Password | ConfirmPass | FirstName | LastName | Address1   | Postcode | City     | State      |
      | https://orikan-ui-automation-test.azurewebsites.net/ | sd@df.com | tyu      | tyu         | test      | last     | 123 street | 678987   | testcity | Queensland |
#*********************************************************************************************************************************
  @Scenario3
  Scenario Outline: Launch the Orikan website and navigate to Contact Page to see State dropdown validation
    Given Launch the Orikan Website "<URL>"
    When Enter the all the fields "<Email>" "<Password>" "<ConfirmPass>"
    And click on next button
    Then Scroll down to see the State Dropdown has Repeated values

    Examples:
      | URL                                                  | Email     | Password | ConfirmPass |
      | https://orikan-ui-automation-test.azurewebsites.net/ | sd@df.com | tyu      | tyu         |
#*********************************************************************************************************************************
  @Scenario4
  Scenario Outline: Launch the Orikan website and navigate to Payment Page to see Card Number Accepting more than 16 digits
    Given Launch the Orikan Website "<URL>"
    When Enter the all the fields "<Email>" "<Password>" "<ConfirmPass>"
    And click on next button
    Then Enter all Mandatory Fields in Contact Page "<FirstName>" "<LastName>" "<Address1>" "<Postcode>" "<City>" "<State>"
    And click on next button
    Then Validate the Card Number field in the Payment page "<CardNum>"

    Examples:
      | URL                                                  | Email     | Password | ConfirmPass | FirstName | LastName | Address1   | Postcode | City     | State      | CardNum              |
      | https://orikan-ui-automation-test.azurewebsites.net/ | sd@df.com | tyu      | tyu         | test      | last     | 123 street | 678987   | testcity | Queensland | 12345678901234567890 |
 #*********************************************************************************************************************************
  @Scenario5
  Scenario Outline: Launch the Orikan website and navigate to Payment Page to see CVV Accepting more than 3 digits
    Given Launch the Orikan Website "<URL>"
    When Enter the all the fields "<Email>" "<Password>" "<ConfirmPass>"
    And click on next button
    Then Enter all Mandatory Fields in Contact Page "<FirstName>" "<LastName>" "<Address1>" "<Postcode>" "<City>" "<State>"
    And click on next button
    Then Validate the CVV field in the Payment page "<CVV>"

    Examples:
      | URL                                                  | Email     | Password | ConfirmPass | FirstName | LastName | Address1   | Postcode | City     | State      | CVV                  |
      | https://orikan-ui-automation-test.azurewebsites.net/ | sd@df.com | tyu      | tyu         | test      | last     | 123 street | 678987   | testcity | Queensland | 12345678901234567890 |
 #*********************************************************************************************************************************
  @Scenario6
  Scenario Outline: Launch the Orikan website and navigate to Payment Page to see Card Number CVV and Card Expiry Year Accepting 'e' character and not shoing proper error message
    Given Launch the Orikan Website "<URL>"
    When Enter the all the fields "<Email>" "<Password>" "<ConfirmPass>"
    And click on next button
    Then Enter all Mandatory Fields in Contact Page "<FirstName>" "<LastName>" "<Address1>" "<Postcode>" "<City>" "<State>"
    And click on next button
    Then Validate the Card Number CVV and Card Expiry Year field in the Payment page "<CardNum>" "<CVV>" "<CardExpYear>"

    Examples:
      | URL                                                  | Email     | Password | ConfirmPass | FirstName | LastName | Address1   | Postcode | City     | State      | CardNum | CVV | CardExpYear |
      | https://orikan-ui-automation-test.azurewebsites.net/ | sd@df.com | tyu      | tyu         | test      | last     | 123 street | 678987   | testcity | Queensland | e       | e   | e         |
 #*********************************************************************************************************************************
