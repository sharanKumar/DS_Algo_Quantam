@Graph
Feature: data structure home page

Background: User is logged in
Given user is navigated to login page
When user must enter the username and password
Then user should be logged in

Scenario Outline: getting started to graph page
Given user clicks the get started button below the graph 
When the user clicks graph link
When the user clicks try here button
Then the user should be directed to the url "https://dsportalapp.herokuapp.com/tryEditor"
Then the user writes the valid python code with <input> and <expected output>
And  user should clicks the run button
Then the user should be able to see the output

Examples: 


   |    input     |   output    |
   | print'hello' |   hello     |

Scenario Outline: inspecting another topic in queue
Given user clicks the get started button below the graph
When the user clicks the graph representation
When the user clicks try here button
Then the user should be directed to the url "https://dsportalapp.herokuapp.com/tryEditor"
Then the user writes the invalid python code <input> and <expected ouput>
And  user should clicks the run button
Then the user should be able to see the error msg in the alert window

Examples: 


   |    input     |   output    |
   | print hai |   alert    |
   
Scenario: practice Questions
Given user clicks the get started button below the graph 
When the user clicks graph link
When the user clicks the practice question 
Then the user finds the page is blank 
   
