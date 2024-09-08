#!/bin/bash

# Clone the project
git clone https://github.com/ekaragozoglu/insiderApi.git

# Navigate to the project directory
cd insiderApi

# Install the necessary dependencies using Maven
mvn clean install

# Run the tests
mvn test
