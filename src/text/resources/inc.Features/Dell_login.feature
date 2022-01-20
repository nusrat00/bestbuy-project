Feature: Dell Login

@login
Scenario: verify usser login

Given launch dell url "<URL>"
Then click countryok
Then mouseover Signin
Then click on signin
Then enter user name and password and click login
And verify user login in profile

@serch
Scenario: search field

Given launch dell url "<URL>"
#Then click countryok
Then search xps in search field
Then click search button
And  xps page

