Feature: Account deposited with amount

  Scenario: Account deposit
    Given account balance is 0.0
    When the account is deposited with 10.0
    Then account should have a balance of 10.0