@karate
#@ignore
Feature: Testing GETS of the CREATED Drinks

  Background:
    * def baseUrl = 'http://localhost:8000/'
    * def fourth = 4

#    Variable's from Helper class 'TestDataGenerator':
    * def testData = Java.type('utils.TestDataGenerator')
    * def newDrink = karate.get('newDrink') != undefined ? newDrink : testData.generateDrink()

#  Data - json files
    * def jsonCreatedDrink = read('classpath:outputData/createdDrink.json')
    * def enrichedData = read('classpath:outputData/enrichedData.json')
    * def defaultData = read('classpath:outputData/defaultData.json')


  Scenario: checking the extra drink is PRESENT by single assertion
#   The scenario can be runned standAlone by calling the right scenario/feature on which it is depending
    * call read('Drink_CREATE.feature@CreateNewDrink')
    Given url baseUrl + 'drinks/' + 4
    When method get
    Then status 200
    And match response[*] contains newDrink
    And match response[*] contains email
    #after step
    * call read('Drink_DELETE.feature@DeleteNewDrink')

  Scenario: checking the extra drink is PRESENT by JSON assertion on only the new Drink
#   The scenario can be runned standAlone by calling the right scenario/feature on which it is depending
    * call read('Drink_CREATE.feature@CreateNewDrink')
    Given url baseUrl + 'drinks/' + 4
    When method get
    Then status 200
    * print response
    And match response == jsonCreatedDrink
    #after step
    * call read('Drink_DELETE.feature@DeleteNewDrink')

  Scenario: checking the extra drink is PRESENT by JSON assertion on whole response
#   The scenario can be runned standAlone by calling the right scenario/feature on which it is depending
    * call read('Drink_CREATE.feature@CreateNewDrink')
    Given url baseUrl + 'drinks'
    When method get
    Then status 200
    * print response
    And match response == enrichedData
    #after step
    * call read('Drink_DELETE.feature@DeleteNewDrink')

  Scenario: checking the extra drink is NOT PRESENT anymore in the default data set
#   The scenario can be runned standAlone by calling the right scenario/feature on which it is depending
    * call read('Drink_DELETE.feature@DeleteNewDrink')
    Given url baseUrl + 'drinks'
    When method get
    Then status 200
    And match response[*] !contains newDrink
#    will fail!
#    And match response[*] contains newDrink
    And match response == defaultData