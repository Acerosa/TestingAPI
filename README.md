# Rick and Morty TestingAPIFramework
And api testing framework

This application was design to test the Rick and Morty API it contains POJOs to retrieve and store the data in java objects.
This is easy to perform data validation tests using JUnit. Testing the structure of the JSON object response is also easy as there are ready to use methods to use in the tests.

#Dependencies needed:

-Junit​

-Jackson​

RestAssured​

JSONsimple​

The project is devided in 4 sections/folders POJO folder contains the POJO class uses to make the objects to hold the data from the HTTP request.
POJOTest is has classes that use getters from the POJOs to check the valitidy of the data from the requst.  
