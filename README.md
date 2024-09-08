## API Service Test
This project is a Java-based application designed to test the Pet API. It includes various API tests using RestAssured and JUnit.

## Requirements
Java 8 or higher
Maven 3.6.0 or higher

## Installation
Clone the project:
git clone https://github.com/ekaragozoglu/insiderApi

## Navigate to the project directory:
cd insiderApi

## Install the necessary dependencies using Maven:
mvn clean install

## Running Tests
To run the tests, use the following command:
mvn test

## Technologies Used
Java: Programming language
Maven: Project management tool
JUnit: Testing framework
RestAssured: API testing framework

## Tests
The tests are located in the src/test/java/PetApiTests.java file. Below are descriptions of some tests:

- createPet: Creates a new pet and verifies that the response is correct.
- getPetFindByStatus: Searches for pets by a specific status and verifies that the response is correct.
- updatePet: Updates an existing pet and verifies that the response is correct.
- deletePet: Deletes a pet with a specific ID and verifies that the response is correct.
- createPetNegativeScenario: Attempts to create an invalid pet and verifies the error response.

## Project Structure
- src/main/java: Application source code
- src/test/java: Test classes and tests
- pom.xml: Maven configuration file
