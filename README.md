# NestCoin_WebAutomation

This Maven project is written in Java setup with TestNG and uses Selenium WebDriver for Web Automation of Amazon task. Eclipse IDE was used for scripting.
The project implements Page Object Model design pattern using Page Factory class.

Pre requisites:
Java - version 15.0.2
Chrome - version 98.0.47

Steps to Run:
> Fork this repo
> Import the project into Eclipse IDE
> Run with Test

Reading Results:
The project contains a subfolder named "test output". Expand the folder and double click on "emailable-report.html". 
It's a TestNG generated report which will show all the testcases that have passed and/or failed.

About the testcases:
The testcase class contains two test cases
> search shoes
> verify shoes selection

Note: I have hardcoded the verification of selection because I was unable locate the element for reading the name of shoes. 
I will look further into finding a better solution.
