# Rick and Morty TestingAPIFramework
And api testing framework

This framework was design to test the Rick and Morty API it contains POJOs to retrieve and store the data in java objects.
Making it easy to perform data validation tests using JUnit. Testing the structure of the JSON object response is also easy as there are ready methods to use in the tests.

# Dependencies needed:

-Maven

-Junit​

-Jackson​

RestAssured​

JSONsimple​

# To make use of this framework:

If is to test the contents from the request an instanciation of the POJO representing the request is required and using the getters to check if the values match the expectded.

To test if the data type received from the request are correct use the Data validation class and call the checkForString method to check for a string this method will return true if the string contains a valeu and match the regular expression to check for a string.

The method checkUrl does the same thing but for a url.
