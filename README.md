# API TestAutomation

Public Repo : https://github.com/rahulverma525/APITestAutomation.git

Sample API Test Automation

Project is developed in Java and uses HttpURLConnection class for API tests.
During development Maven was used as dependency manager and while execution TestNG is used as test execution tool. 
Extent Reports utility is used for reporting test results.

The tests are data driven and take the test data from Excel using Apacher POI.

There is one test class for calling REST APIs from https://petstore.swagger.io.
which has three API tests which call the relevant APIs endpoints from https://petstore.swagger.io to find pet by ID, update pet name and delete pet.

The project source code  can be downloaded from the repository and build and run as Maven/TestNG tests.
The project includes TestNG runner class which has the main method that is used to run the tests from command line.
testng.xml in the project home directory can be used to specify which tests are to be run.



**Steps to run without IDE/Maven environment**
1) Download and unzip the the APITest.zip file from the Repository to a  folder on local machine 
2) cd to ~/APITest folder where the zip file contents have been unzipped 
3) create a 'Reports' folder under ~/APITest
4) Go to src/test/data/ and update the API test data file:  update the 'id' to be a valid pet ID of an existing pet in the petstore and its currentPetName and the name to be updated.
  A valid pet ID and its name can be got by sending a GET request https://petstore.swagger.io/v2/pet/findByStatus?status=available from POSTMAN.

**Steps to run on IDE/Maven environment**
1) Clone the Repository to a folder on local machine (git clone https://github.com/rahulverma525/APITestAutomation.git)
2) Cd to 'APITestAutomation' folder  (< Project Install Root>)
3) Create a 'Reports' folder under <Project Install Root> (if not existing) 
4) Go to src/test/data/ and update the excel files for the test data API test, if and as needed: 
5) mvn test -f "./pom.xml"
 
 
Check the HTML reports under the 'Reports' folder after the run
