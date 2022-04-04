Feature: CRUD actions with Dynamic Values

  Background:
    * url baseUrl

  #  Data - json files
    * def inputData = read('classpath:inputData/newDrink.json')

 #    Variable's from Helper class 'TestDataGenerator':
    * def newDrink = testData.generateDrink()
    * def email = testData.generateRandomEmail()
    * def id = testData.generateNextInt()

  @CreateNewDrink
  Scenario: 1 - create extra set of data
    Given path 'drinks'
    And request inputData
#    please complete scenario

  Scenario: 2 - get extra set of data
#    please complete scenario

  Scenario: 3 - delete extra set of data and validate deletion
#    please complete scenario


