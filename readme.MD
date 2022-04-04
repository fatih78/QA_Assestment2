## General Notes & Running your SpringBoot Application
* Run your local application with class 'DemoApplication'
* It will start up a local endPoint 'http://localhost:8000/' with some data
* Navigate to the endPoint after starting it: 'http://localhost:8000/' or 'http://localhost:8000/drinks'
* The FrameWork is already pre structured in folders

### TEST_CASE1:
* Navigate to folder 'src/test/resources/features/a.Drink_CRUD.feature'
* Use 'Scenario: 1 - create extra set of data' to create extra set of data >> Status is 201
* Use 'Scenario: 2 - get extra set of data' to get and assert the extra set of data >> Status 200
* Use 'Scenario: 3 - delete extra set of data and validate deletion' to delete and validate 'deletion' of the extra set data >> Status 204

### TEST_CASE2:
* Navigate to folder 'src/main/java/utils/TestDataGenerator.java'
* Use method 'generateDrink()' to write code which returns dynamic names (any String values)
* Use method 'generateRandomEmail()' to write code which returns dynamic e-mail addresses 
* Use method 'generateNextInt()' to write code which returns dynamic int values (int bound = 10)

### Write some helper / util methods for populating some dynamic values in the karate scenario's
* To Do


### CommandLine from root directory
* mvn spring-boot:run
* mvn test

### PortCommands
* lsof -n -i4TCP:8000 (portnumber)
* kill -9 68453 (number is PID value from the list-command above)



