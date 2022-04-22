Feature: CRUD actions with Dynamic Values

  Background:
    * url baseUrl

  #  Data - json files
    * def inputData = read('classpath:inputData/newDrink.json')

 #    Variable's from Helper class 'TestDataGenerator':
    * def testData = Java.type('utils.TestDataGenerator')

  @CreateNewDrink
  Scenario: 1 - create extra set of data
    * set inputData.name = testData.generateDrinkName(10)
    * set inputData.id = testData.generateNextInt(3)
    * set inputData.sort = "alcoholic"
    * set inputData.abv = 20
    * set inputData.email = testData.generateRandomEmail(10,2,3)
    * set inputData.country = "America"

    Given path 'drinks'
    And request inputData
    When method POST
    Then status 201


  Scenario: 2 - get extra set of data
    * set inputData.name = testData.generateDrinkName(10)
    * set inputData.id = testData.generateNextInt(3)
    * set inputData.sort = "alcoholic"
    * set inputData.abv = 20
    * set inputData.email = testData.generateRandomEmail(10,2,3)
    * set inputData.country = "America"

    Given path 'drinks'
    And request inputData
    And method POST
    And status 201
    Then path 'drinks/' + inputData.id
    And request inputData
    And method GET
    And status 200
    And match response contains inputData

  Scenario: 3 - delete extra set of data and validate deletion
    * set inputData.name = testData.generateDrinkName(10)
    * set inputData.id = testData.generateNextInt(3)
    * set inputData.sort = "alcoholic"
    * set inputData.abv = 20
    * set inputData.email = testData.generateRandomEmail(10,2,3)
    * set inputData.country = "America"

    Given path 'drinks'
    And request inputData
    And method POST
    And status 201
    When path 'drinks/' + inputData.id
    And method DELETE
    Then status 204
    And path 'drinks/' + inputData.id
    And method GET
    And status 404


