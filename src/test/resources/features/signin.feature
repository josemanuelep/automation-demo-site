  # Autor
  # Jose Manuel Echeverri Palacio
  # Java and Test developer
  @regresion
  Feature: Register in Automation Demo Site
    A developer want to practice E2E tests in
    Automation Demo Site signining

    Scenario: Signin
      Given Jose wants log on Automation Demo
      When Jose register in the page
        | fname       | lname     | address          | email            | phone      | gender | hobbies | languajes | skills  | country | date       | password |
        | Jose Manuel | Echeverri | Calle 100 # 25-5 | jose@hotmail.com | 3225456644 | Male   | Movies  | Catalan   | AutoCAD | chile   | 26/06/1988 | 123456*  |
      Then He should see " - Double Click on Edit Icon to EDIT the Table Row."




