# TownPlanner
TDD, BDD

Technology Stack : 
 - Java 8
 - Junit
 - Mockito
 - Cucumber
 - Jacoco
 
How To Run:
 ```sh
 $ mvn clean install
 $ cat street1.txt | java -jar target/TownPlanner-1.0-SNAPSHOT.jar
```
OR

Run jar file :
  - java -jar target/TownPlanner-1.0-SNAPSHOT.jar
  - give house numbers seperated by space (" ")
  - Enter
  
Reports :
  - Application will be able to generate Jacoco and Cucumber reports.
    - Jacoco Report 
      - go to folder /target/site/jacoco/index.html
    
    - Cucumber Report
      - go to folder /target/site/cucumber-pretty/index.html
  
