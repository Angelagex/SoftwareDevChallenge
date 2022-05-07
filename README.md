# ToDo App Java 

Application that work as a backend service and allows you to create ToDo List by Categories.

## Content

The following app was created using Java as a principal programming lenguage and an aditional Java library that is Springboot. The application counts with a principal branch **-master-** which have all the required files for its functionality. 

This application was created as a part of a challenge that consist on create a fullStack web application, so it allows you to connect to a MySql database and persist there the information using various methods. So as you're going to see this app is compound by 4 principal packages, which are entities, repositories, services and controller, all of them contains its corresponding classes or interfaces acording to its names.

The app its compound by two principal entities which are Module and Task, these have their own attributes and methods. The repositories extends from an dependency that is JpaRepository that is going to give us some useful methods that are implemented later on the service implementation class. As well the Controller allows us to map all the methods using the Mapping functions that are called throw the Mapping annotations like @PostMapping, @PutMapping and so on, this mapping are used later as endpoints that recieve http request from the frontEnd part of this challenge.

## Install

To install the app you just need to follow [this link](https://www.jetbrains.com/help/idea/manage-projects-hosted-on-github.html) to learn how to clone and manage projects hosted on GitHub.


## Deploy

Once you have followed the steps above, you just need to go to your IntelliJ, open the main folder of this project and click the green Run button.


## Notes

1. Also you need to go to [this link](https://github.com/Angelagex/SoftwareDevChallengeReact) and follow the steps to have the frontEnd layer of the app, or you could test all the methods usind Postman and sending requests to the directions defined on the controller class.
2. To run this project on your local you need to have installed MySql Workbench on your computer and create a schema with the name of modules.
