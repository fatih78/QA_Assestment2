@parallel=false
Feature: CRUD actions with Dynamic Values

  Background:
    * url 'http://localhost:8000/'
    When method get
    Then status 200

  #  Data - json files
    * def inputData = read('classpath:inputData/newDrink.json')

 #    Variable's from Helper class 'TestDataGenerator':
    * def testData = Java.type('utils.TestDataGenerator')


  @CreateNewDrink
  Scenario: 1 - create extra set of data
    * def newDrink = testData.generateDrink()
    * def email = testData.generateRandomEmail()
    * def id = testData.generateNextInt()

    * set inputData.name = testData.drinkname
    * set inputData.id = testData.id
    * set inputData.sort = "alcoholic"
    * set inputData.abv = 20
    * set inputData.email = testData.email
    * set inputData.country = "India"

    Given path 'drinks'
    And request inputData
    When method POST
    Then status 201

  Scenario: 2 - get extra set of data
    Given path "drinks/"+testData.id
    When method GET
    Then status 200
    And match response.id == testData.id
    And match response.name == testData.drinkname
    And match response.email == testData.email

  Scenario: 3 - delete extra set of data and validate deletion
    Given path "drinks/"+testData.id
    When method DELETE
    Then status 204
    Given path "drinks/"+testData.id
    When method GET
    Then status 404
