## springbootjpasample
Import as Maven project

## Project Structure -
<li>Controller.java has all the endpoints defined.</li>
<li>SpringBootMysqldbApplication is the main application. </li>
<li>Person and Pet are the entities.</li>
<li>PersonRepository and PetRepository are the JDA repositories.</li>
<li>PersonService is the business service bean. </li>
<li>Controller is the REST controller class which exposes the endpoint API.</li>

## Configuration files
<li>Application.properties - contains the datasource configuration. This example is using mysql instance on pivotal's cloud foundry</li>
<li>schema-mysql.sql -- contains the DDL statements for creating tables and some sample values</li>
<li>manifest/yml -- to push the application to cloud foundry</li>

## ENPOINT API -
<li> https://springbootlk.cfapps.io/rest/person/1/getpets - get pets belonging to owner with id = 1 </li>
<li> https://springbootlk.cfapps.io/rest/pet/1/getowner - get owner information of pet with id = 1 </li>
<li> Post API  </li>
<li> https://springbootlk.cfapps.io/rest/addpet/1 - POST service to add pet for owner with id = 1 </li>
<li> Sample Request body  - horse </li>
