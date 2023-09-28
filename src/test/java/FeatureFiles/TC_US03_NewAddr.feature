Feature: Users should be able to add new addresses


  Scenario: Add a new address

    Given The user accesses the website
    When The user clicks on the common link
      | singIn |
    When The user enters information in the special field
      | email    | canbonomo@mail.ru |
      | password | Bonomo123         |
    And The user clicks on the special link
      | submitButton |
    And The user clicks on the common link
      | siteMap |
    And The user clicks on the special link
      | addresses |
    And The user clicks on the special link
      | addNewAddress |
    And The user enters information in the special field
      | firstName | Can                |
      | lastName  | Bonomo             |
      | company   | Techno Study       |
      | address   | Paradise Street 47 |
      | city      | Miami              |
    And User select on the element
      | state |
    And The user enters information in the special field
      | zipCode     | 09876          |
      | homePhone   | 01234567       |
      | mobilePhone | 09008101010    |
      | adressTitle | My new address |

    And The user clicks on the special link
      | saveButton |
    And The new address is successfully added to the users account

