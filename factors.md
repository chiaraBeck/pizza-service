# factors implemented in this microservice:
1. Codebase: The codebase is pushed to a git repository for a tracked version control.
2. Dependency Isolation: With maven all the dependencies are managed in an isolated pom.xml file.
3. Config: The configuration is separated from the rest of the code in the application.properties file 
             as well as the docker-compose.yml. 
4. Backing Services as attached roots: The postgres database is accessed over a link.
5. Port Binding: The application gets bound to port 8080 if run locally in the application.properties file.
                 and to port 9090 by the docker-compose.yml file.
6. Logs: Spring Boot by default logs to the console, which Docker can capture as log streams.
7. Disposability: Spring Boot shuts down gracefully since it's data source pooling (here: HikariCP)
                  closes all the database connections gracefully. Additionally, with docker it is possible
                  to quickly start and stop the containers.

# Unfortunately I didn't have the time to explore the 8th factor:
8. Build, release, run: I would have used the platform Kubernetes for this requirement 
    because it makes it possible to separate the build, release and run stages, and it simplifies
    the management of containers.