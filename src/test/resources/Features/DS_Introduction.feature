
@DS_Introductionpage
Feature: Data Structure Home page
 Background:  User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
	 
 Scenario Outline: Home Page
   Given the user is on the DS Algo Home Page
   When the user clicks  Get Started button below the Data structures-Introduction
   Then The user should land in "Data Structures- Introduction Page" page 
   When the user clicks Time Complexity link
   Then the user should be redirected to "Time Complexity"TC page 
   When The user clicks Try Here  button of Time Complexity page
   Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
   When the user writes invalid code with <input> and <expected output>
   And Click the Run Button
   Then The user should able to see an error message in alert window
   
   Examples:
    |     input      |      output   |
    |print hai       |   alert       |
    
    
   
   
   Scenario Outline:
   Given user is on hompage
   When  user clicks get started on DS_introduction
   When the user clicks Time Complexity link
   When  user clicks try here button
   When  the user writes valid python code with <input> and <expected output>
   And Click the  python page run Button
   Then The user should able to see output in the console
   
   Examples:
    
    |     input      |      output   |
    |print 'hello'   |   hello       |
    
    
    
   Scenario: Python editor
   Given The user is on the Time Complexity Data Structure Home Page
   When The user clicks Practice Questions link
   When the user will land on the practice question page
   Then The user doesn't find any practice problems and the page is blank
   
   
   
   