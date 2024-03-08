@Queue

Feature: Data Structure Home page
 Background:  User is Logged In
	Given user navigates to the login page
	When user enters username and password
	Then user must be logged in

@Queue1
Scenario Outline: Clicking the get started in Queue
Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button below the Queue
Then The user should be directed to "Queue" Page
When the user clicks the  "Implementation of Queue in Python" button 
When The user clicks "Try Here" button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When The User writes Valid python code with <input> and <expected output>
And clicks the run button
Then User is able to see the output in console

Examples:

    |     input      |      output   |
    |print 'hello'   |   hello       |
   


Scenario Outline: Gettin started in Queue with other topic
Given  user is on the DS_Algo Home Page
When  user clicks  Get Started button below the Queue
When The user clicks Implementation using Collections.deque page 
And The user clicks "Try Here" button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When The User writes Valid python code with <input> and <expected output>
And clicks the run button
Then User is able to see the output in console 


Examples:

    |     input      |      output   |
    |print 'hello'       |   hello       |
   

Scenario Outline: Queue invalid passing code
Given the user is on the dS_algo Home Page
When the user clicks  get started button below the Queue
When The user clicks Implementation using array
And The user clicks "Try Here" button
Then The user should be redirected to a pagewith the url "https://dsportalapp.herokuapp.com/tryEditor"
When user writes the invalid code with <input> and <expected output>
And click the Run Button
Then The user should be able to see an error message in alert window
  
  
   Examples:
    |     input      |      output   |
    |print hai       |   alert       |
   
   
   Scenario Outline: Getting started in Queue 
Given  user is on the DS_Algo home page
When  user click  Get Started button below the queue
When The user clicks Implementation using array
And The user clicks "Try Here" button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When the user writes the valid code with <input> and <expected output>
And  user click the Run Button
Then The user should able to see the ouput in the console
  
  
   Examples:
    |     input      |      output   |
    |print 'hello'       |   hello       |
   

Scenario Outline: Getting started in Queue with another topic
Given the user on DS_Algo Home Page
When  user click  Get started button Below the Queue
When The user clicks Queue Operations 
And The user clicks "Try Here" button
Then The user should be redirected to a pagewith the url "https://dsportalapp.herokuapp.com/tryEditor"
When   user writes Valid python code  with <input> and <expected output>
And clicks the run button
Then User is able to see the output in console

Examples:
    |     input      |      output   |
    |print 'hello'       |   hello       |
    
    
Scenario: Practice Question Paper
  Given the user is on the DSalgo Home_page
  When  user click  Get Started button on the Queue pannel
  When  user click Queue Operations 
  When  user clicks the Practice QP
  Then  user finds the page is blank
 
   


