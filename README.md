# pizza-service

Steps to run the microservice in docker:

Step 1: clone the repository using: git clone <repository_url>
Step 2: enter the directory using: cd <repository_directory>
Step 3: build the docker image using: docker build -t pizza-service .
Step 4: start the containers using: docker-compose up
Step 5: go to localhost:9090/message in your browser 
        to get a test message from the server
Step 6: go to localhost:9090/customer/1 
        to get example data from the database
