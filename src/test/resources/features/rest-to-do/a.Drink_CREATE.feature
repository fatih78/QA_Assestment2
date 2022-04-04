Feature: Testing CREATE of the Drinks

  Background:
    * url baseUrl

  #  Data - json files
    * def testData = Java.type('utils.TestDataGenerator')
    * def inputData = read('classpath:inputData/newDrink.json')

#    Variable's from Helper class 'TestDataGenerator':
    * def newDrink = testData.generateDrink()
    * def email = testData.generateRandomEmail()
    * def randomInt = testData.generateNextInt()

  @CreateNewDrink
  Scenario: creating extra set of data
    Given path 'drinks'
    And request inputData
    And set inputData.name = newDrink
    And set inputData.sort = "Non-Alcoholic"
    And set inputData.email = email
    And set inputData.id = randomInt
    And set inputData.country = "America"
    When method post
    Then status 201
