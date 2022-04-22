Feature: CRUD actions with Static Values

  Background:
    * url baseUrl

  #  Data - json files
    * def inputData = read('classpath:inputData/newDrink.json')
    * set inputData.name = "Old Fashioned"
    * set inputData.sort = "Whisky based"
    * set inputData.abv = 40
    * set inputData.email = "test_email@test.com"
    * set inputData.id = 1
    * set inputData.country = "USA"

  @CreateNewDrink
  Scenario: 1 - create extra set of data
    Given path 'drinks'
    And request inputData
    When method POST
    Then status 201

  Scenario: 2 - get extra set of data
    Given path 'drinks/' + inputData.id
    When method GET
    Then status 200
    And match response contains inputData


  Scenario: 3 - delete extra set of data and validate deletion
    Given path 'drinks/' + inputData.id
    When method DELETE
    Then status 204
    And path 'drinks/' + inputData.id
    And method GET
    And status 404


