# ms3Interview

This repo contains a java application that allows you upload a csv file with ten columns (A-J). In the zip file you will find the java application that is needed
When using this project you will have to first download and install SQLite for testing purposes and also if you are looking to parse the csv file into a database.
Please create a table in the database itself so when you are before running the appllication itself. 

Getting Started

To get this application up and running please clone or download the zip file with the csv file. Save them to your computer where you know where they are. 
Open the project in your IDE of choice and edit the these lines of code: 16,28,29
In line 16, this is where you copy the path to you database file. 
In line 29, this is where you will copy the path to your csv.

After that test to see if you are able to run the application. 
Next test to see if your connection is made in the sql database.


Consideration of design

For the planning phase of this project I started with a simple logic/flow graph on a paper. I then went online to look at the sqlite documentation. I quickly ran into a wall
on figuring out how to import the csv file into a java application. I do know that sql has its own upload feature. It was hard to find something current and up to date with todays java code. I found
a few websites that i peiced together for my code that I have. There is a column in the csv file where it was very long and seemed to be a image file. I classified that column as type varchar(300 byte).
I am not sure if that is the correct length or not just assumed it could not be more than 300 characters long. Into the coding and class seperation. My thinking of keeping everything in one class is becasue 
I see no reason to split class up. The code is not that large where it is hoard to understand. The flow of the code itself is fairly easy to read and to understand. 

Errors:
	1. I was not able to get the counter for the errors working. I believe it has to be a for loop and checking to see if the row has a null object.
	2. Establishing a connection with the sqlite was tough, I am not sure if I got it to work or not since it only worked for me half the time. 