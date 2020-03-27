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
        | fname       | lname     | address          | email            | phone      | gender | hobbies | languajes | skills | country | date            | password                                                                          |
        | Jose Manuel | Echeverri | Calle 100 # 25-5 | aaaa@hotmail.com | 3225456644 | Male   | Movies  | Catalan   | CSS    | Angola  | 26/January/1988 | LON#1gYm2aOr73z60KWie3EsDN$7kIK$gX#FhIP9VFwgB!IZnUm1ChXvA!8iEgGzyvLK7wf2h1kQSW8V* |
      Then He should see "- Double Click on Edit Icon to EDIT the Table Row."




