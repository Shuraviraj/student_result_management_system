

# Student Result Management System

The Student Result Management System is a Java-based desktop application designed to manage student records and their academic results. It is built using the JavaSwing framework and utilizes the PostgreSQL database to store and manage data. The project was developed using the NetBeans IDE and is based on ANT build system.
## Tech Stack

**Java** 

**PostgreSQL** 

**JavaSwing** 


## Dependencies

- [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/download/postgresql-42.6.0.jar) -> For establishing a connection between PostgreSQL and the application
- [rs2xml](https://sourceforge.net/projects/finalangelsanddemons/) -> Used to display database tables to the user.

## References

- [Icons8](https://icons8.com/) -> for icons
- [Iconscout](https://iconscout.com/) -> for icons

## Features

- The application allows the administrator to create new admin with a static superuser account.
- The admin can add new courses, students, and set marks for each student in a specific course.
- The system provides a feature for students to fetch their marks by entering their roll number.
- The admin can view the list of all students and their respective marks for a specific course.
- The application implements CRUD (Create, Read, Update, and Delete) operations to manage student records efficiently.
- The user interface is designed using JavaSwing, providing an intuitive and user-friendly interface to the users.

## How to Run this application

 - Install Java and Netbeans via (for windows only) -> [Install NetBeans 16 with Java 19](https://www.youtube.com/watch?v=45ng2smz_w0)
	 - open **terminal/ powershell and type following command** to check the requirement met to run this application
	 - `java -version`
 - Install Postgresql via (for windows only) -> [Install PostgreSQL](https://www.youtube.com/watch?v=IYHx0ovvxPs)
 - Install git via -> [Install and Configure Git and GitHub](https://www.youtube.com/watch?v=AdzKzlp66sQ)
 - Clone this repository using below code
	 - `git clone https://github.com/Shuraviraj/student_result_management_system.git`
 - you might face issue with rs2xml and postgresqJarfile these file are already there in this repo just resolve it via locating this into your local machine
 - create database with following name into postgresql using PGAdmin
	 - `student_result_management_system`
	 - Database credential :-
		 - username : postgres
		 - password : postgres
	 - Create three table with following detail make sure all these are case sensitive
		 - student : `CREATE TABLE public.student (
	rollno int4 NOT NULL,
	course varchar(100) NULL,
	branch varchar(100) NULL,
	fullname varchar(100) NULL,
	gender varchar(100) NULL,
	fathername varchar(100) NULL,
	CONSTRAINT student_pkey PRIMARY KEY (rollno)
);`
		 - result : `CREATE TABLE public."result" (
	rollno int4 NOT NULL,
	physics varchar(10) NULL,
	maths varchar(10) NULL,
	em varchar(10) NULL,
	dbms varchar(10) NULL,
	os varchar(10) NULL,
	CONSTRAINT result_pkey PRIMARY KEY (rollno)
);`
		 - admin : `CREATE TABLE public."admin" (
	username varchar(10) NOT NULL,
	pass varchar(10) NULL,
	CONSTRAINT admin_pkey PRIMARY KEY (username)
);`
 - For creating admin you will need a superadmin access so below is the super admin credential
	 - username : admin
	 - password : 1234
	 - (please change it after cloning the repo you can fine it in **AdminHome.java** -> **line 191 & 193**)
 - To run application go to AdminIndex right click on it and click on run 😄

## Future Scope

+ Fetching results based on the course.
+ Adding student branch according to the course.
+ Updating student marks.


## About Me

 I am a backend developer working on my dreams to become a full-stack developer. The project was made under the guidance of ACCIOJOB, a leading provider of training and placement services for IT professionals. You can find me on [GitHub](https://github.com/Shuraviraj) and 
 [LinkedIn.](https://www.linkedin.com/in/ravi-raj-singh97/)
