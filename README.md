# pizza-service

Steps to run the microservice in docker:

Step 1: enter the directory of the project
Step 2: build the docker image using: docker build -t pizza-service .
Step 3: start the containers using: docker-compose up
Step 4: go to localhost:9090/message in your browser 
        to get a test message from the server
Step 5: go to localhost:9090/customer/1 
        to get example data from the database
