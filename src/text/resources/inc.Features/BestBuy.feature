Feature: health and wellness

@health1
Scenario: Verify Health & Wellness link available in the home page
Given Open Application "<URl>"                                      
Then close pop up 
And Verify Health & Wellness link available in the home page

@health2
Scenario: Verify Health & Wellness page is clickable
Given Open Application "<URl>"
#Then close pop up 
Then Click  on  Health & Wellness                                      
And Verify  Health & Wellness Soutions in  Health & Wellness page h1 

@health3
Scenario: Verify Health & Wellness title
Given Open Application "<URl>"
#Then close pop up 
Then Click  on  Health & Wellness  
And Verify  Health & Wellness Soutions in  Health & Wellness page TITlE

@health4
Scenario: Verify link in Health & Wellness 
Given Open Application "<URl>"
#Then close pop up 
Then Click  on  Health & Wellness   
And verify page link