#
#
Feature: Cash Withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given I have deposit $50.00 in my account
    When I withdraw $20
    Then $20 should be dispensed