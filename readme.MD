# NOTE:
The FrameWork is already pre-filled.
You need to write some Java util methods by yourself
You need to write out the Karate features by yourself
You need to build the report layer by yourself
You need to write a Runner Class by yourself


# Code en Running your SpringBoot Application
Run your local application with class 'DemoApplication'
It will start up a local endPoint 'http://localhost:8000/' with some data

# Used e2e BDD TestCases with Karate
karateGET.feature && karateCRUD.feature

# Write some helper / util methods for populating some dynamic values in the karate scenario's


# Viewing JSON Data from browser
Navigate to url below and see your JSON data:
http://localhost:8080/drinks


# Remarks

One annotation is able to create an whole entire API '@RepositoryRestResource'


# TestCases

See class 'DemoApplicationTests' for the unit tests

# Used Libraries:

restTemplate

restAssured

mockMvc



# DevTools
brew install maven >> to install maven
set the right variables in your .bash_profile

# CommandLine from root directory
mvn spring-boot:run
mvn test

# PortCommands
lsof -n -i4TCP:8000 (portnumber)
kill -9 68453 (number is PID value from the list-command above)

# Jenkins
##Sample commands:
####Install the latest LTS version: brew install jenkins-lts
####Install a specific LTS version: brew install jenkins-lts@YOUR_VERSION
####Start the Jenkins service: brew services start jenkins-lts
####Stop the Jenkins service: brew services stop jenkins-lts
####Restart the Jenkins service: brew services restart jenkins-lts
####Update the Jenkins version: brew upgrade jenkins-lts
###use for redirecting local: ngrok http 8080
###http://d007-77-162-149-103.ngrok.io/github-webhook/ >>> enter in GitHub Webhook

-------------------------------------------------------------------------------------

# meetUp 13-10-2021 - Topics
#####starting the environment: 
######endPoint
######Github
######Jenkins

#####karate alternatives
#####helper classes > unitTest
#####karate config file
#####suite-/feature-/scenario-run
#####JSON body for data input
#####Validations
#####before&after steps
#####pipeLine/GitHub/IntelliJ
#####reporting: karate & cucumber
#####parallel runs
#####features pattern (calling each other)

update

-------------------------------------------------------------------------------------


