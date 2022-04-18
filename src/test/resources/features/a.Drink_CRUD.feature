@parallel=false
Feature: CRUD actions with Static Values

  Background:
    * url 'http://localhost:8000/'
    When method get
    Then status 200

  #  Data - json files
    * def inputData = read('classpath:inputData/newDrink.json')
    * set inputData.name = "Old Monk"
    * set inputData.id = 5
    * set inputData.sort = "alcoholic"
    * set inputData.abv = 20
    * set inputData.email = "test111@gmail.com"
    * set inputData.country = "India"

  @CreateNewDrink
  Scenario: 1 - create extra set of data
    Given path 'drinks'
    And request inputData
    When method POST
    Then status 201

  Scenario: 2 - get extra set of data
    Given path "drinks/"+inputData.id
    When method GET
    Then status 200
    And match response.name == inputData.name
    And match response.id == inputData.id
    And match response contains inputData

  Scenario: 3 - delete extra set of data and validate deletion
    Given path "drinks/"+inputData.id
    When method DELETE
    Then status 204
    Given path "drinks/"+inputData.id
    When method get
    Then status 404
