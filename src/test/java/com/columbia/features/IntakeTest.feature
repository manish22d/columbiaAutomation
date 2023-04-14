Feature: As a user, i want to validate claims got updated successfully


  Scenario Outline: verify user is able to update claim details
    Given user search for claim id "1234567890"
    When user updates claim with updated data
      | source   | queue   | docType   | subscriberId   | comment   |
      | <source> | <queue> | <docType> | <subscriberId> | <comment> |
    Then verify update successful banner displayed

    Examples:
      | source      | queue  | docType  | subscriberId | comment |
      | Clean Code: | Robert | Prentice | Programming  | 500     |