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

### TEST_CASE1:
* Navigate to folder 'src/test/resources/features/a.Drink_CRUD.feature'
* The json body in folder 'src/test/resources/inputData/newDrink.json' is used in te feature files!
* Use STATIC values in the feature file to enrich the json body! Like, strings (emails & drinkNames) and int's
* Use 'Scenario: 1 - create extra set of data' to create extra set of data >> Status is 201
* Use 'Scenario: 2 - get extra set of data' to get and assert the extra set of data >> Status 200
* Use 'Scenario: 3 - delete extra set of data and validate deletion' to delete and validate 'deletion' of the extra set data >> Status 204

### TEST_CASE2:
* Navigate to folder 'src/main/java/utils/TestDataGenerator.java'
* Use method 'generateDrink()' to write code which returns dynamic names (any String values)
* Use method 'generateRandomEmail()' to write code which returns dynamic e-mail addresses 
* Use method 'generateNextInt()' to write code which returns dynamic int values (int bound = 10)

### TEST_CASE3:
* Navigate to folder 'src/test/java/unitTest/UnitTests.java' 
* Write unitTests for the methods from 'TEST_CASE2'

### TEST_CASE4:
* Navigate to folder 'src/test/resources/features/b.Drink_CRUD.feature'
* The json body in folder 'src/test/resources/inputData/newDrink.json' is used in te feature files!
* Use DYNAMIC values in the feature file to enrich the json body! Use the previously created methods in class TestDataGenerator
* Use 'Scenario: 1 - create extra set of data' to create extra set of data >> Status is 201
* Use 'Scenario: 2 - get extra set of data' to get and assert the extra set of data >> Status 200
* Use 'Scenario: 3 - delete extra set of data and validate deletion' to delete and validate 'deletion' of the extra set data >> Status 204

### TEST_CASE5:
* Navigate to folder 'src/test/java/runners/TestRunnerKarate.java'
* Use method 'testParallel()' to write code for the runner class
* Run all your testcases with this runner class

### Finally
* Push your code to your branche



