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
@ignore
Feature: Checkout
	
	Pratice to write a test of checkout sth.
	
	Background:
		Given the price of a "banana" is 40c
    And the price of a "apple" is 25c		
		
  Scenario Outline: Checkout a banana and an apple
    When I checkout <count1> <item1>
    And I checkout <count2> <item2>
    Then the total price should be <total>c

    Examples: 
      |  item1		|	count1	|	item2		|	count2	|	total	|
      |	"banana"	|	1				|	"apple"	|	1				|	65		|
      | "apple"		|	3				|	"banana"|	2				| 155		|