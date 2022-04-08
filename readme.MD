### Initial Setup
* Clone repository 'https://github.com/fatih78/QA_Assestment2.git'
* Preferably use IntelliJ
* It's a maven project setup
* Create you own branche with an own name


## General Notes & Running your SpringBoot Application
* Run your local application with class 'DemoApplication'
* It will start up a local endPoint 'http://localhost:8000/' with some data
* Navigate to the endPoint after starting it: 'http://localhost:8000/' or 'http://localhost:8000/drinks'
* The FrameWork is already pre structured in folders

------------------------------------------------------------------------------------------------------------------------
### TEST_CASE1
* Navigate to folder 'src/test/resources/features/a.Drink_CRUD.feature'
* The json body in folder 'src/test/resources/inputData/newDrink.json' is used in te feature files!
####Scenario: Create a new Drink object with STATIC values, Get- & Delete the new object
* GIVEN the Endpoint is running
* WHEN I add a new (drink)product
* THEN the product is available on the Endpoint with all the added fields (assertions)
* WHEN I delete the added product
* THEN the product is NOT available on the Endpoint (assertions)

------------------------------------------------------------------------------------------------------------------------
### TEST_CASE2
* Navigate to folder 'src/main/java/utils/TestDataGenerator.java'
* Navigate to folder 'src/test/java/unitTest/UnitTests.java'
* Use STATIC values (hardcoded) to enrich the json body
####Scenario: Write methods to generate random- drink names, emails and Int values
* GIVEN the project is imported and build without errors
* WHEN I use method 'generateDrink()' to generate random drink names (String values)
* THEN I expect random drink names are generated (write a unit test for this method)
* WHEN I use method 'generateRandomEmail()' to generate random emails
* THEN I expect random e-mails are generated (write a unit test for this method)
* WHEN I use method 'generateNextInt()' to generate random Int values
* THEN I expect random Int values are generated (write a unit test for this method)

------------------------------------------------------------------------------------------------------------------------
### TEST_CASE3
* Navigate to folder 'src/test/resources/features/b.Drink_CRUD.feature'
* The json body in folder 'src/test/resources/inputData/newDrink.json' is used in te feature files!
* Use DYNAMIC values from the generated methods from 'TEST_CASE2' to enrich the json body
####Scenario: Create a new Drink object with DYNAMIC values, Get- & Delete the new object 
* GIVEN the Endpoint is running
* WHEN I add a new (drink)product
* THEN the product is available on the Endpoint with all the added fields (assertions)
* WHEN I delete the added product
* THEN the product is NOT available on the Endpoint (assertions)

------------------------------------------------------------------------------------------------------------------------
### TEST_CASE5:
* Navigate to folder 'src/test/java/runners/TestRunnerKarate.java'
* Tip, write out the code in this class
####Scenario: Run all testcases via the TestRunnerKarate class
* GIVEN the Endpoint is running
* WHEN I run all testcases via the TestRunnerKarate class
* THEN karate report(s) are generated with test results


------------------------------------------------------------------------------------------------------------------------
### Finally
* Push your code to your branche
* Include also the testreport from 'TEST_CASE5'



