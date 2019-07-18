## springbootjpasample
Import as Maven project

## Project Structure -
<li>Controller.java has all the endpoints defined.</li>
SpringBootMysqldbApplication is the main application. 
Person and Pet are the entities.
PersonRepository and PetRepository are the JDA repositories.
PersonService is the business service bean. 
Controller is the REST controller class which exposes the endpoint API.

## Configuration files
Application.properties - contains the datasource configuration. This example is using mysql instance on pivotal's cloud foundry
schema-mysql.sql -- contains the DDL statements for creating tables and some sample values
manifest/yml -- to push the application to cloud foundry

## ENPOINT API -
https://springbootlk.cfapps.io/rest/person/1/getpets - get pets belonging to owner with id = 1
https://springbootlk.cfapps.io/rest/pet/1/getowner - get owner information of pet with id = 1
Post API 
https://springbootlk.cfapps.io/rest/addpet/1 - POST service to add pet for owner with id = 1
Sample Request body  - turtle 
