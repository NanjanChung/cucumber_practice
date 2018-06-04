#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Tic-tac-toe
  
	I want to use tic-tac-toe to practice handling data table.

  Scenario: 
    Given a board like this:
    	|		|	1	|	2	|	3	|
    	|	1	|		|		|		|
    	|	2	|		|		|		|
    	|	3	|		|		|		|
    When player x plays in row 2, column 1
    Then the board should look like this:
    	|		|	1	|	2	|	3	|
    	|	1	|		|		|		|
    	|	2	|	x	|		|		|
    	|	3	|		|		|		|