
Feature: Application Login
Scenario: Home page default login
Given User is on Netbanking Landing page
When User Login into application with "Jin" and Password "1234"
Then Home Page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on Netbanking Landing page
When User Login into application with "John" and Password "12345"
Then Home Page is populated
And Cards displayed are "false"