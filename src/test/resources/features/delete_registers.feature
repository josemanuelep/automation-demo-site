  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @regresion
  Feature: Delete Webtable Registers in Demo Site

    Scenario: Delete registers
      Given Jose wants to go to webtable
      When Jose deletes 5 records
      Then He should not see the deleted record




