
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @ErrorValidation
  Scenario Outline: Title of your scenario outline
   Given I landed on Ecommerce Page
   When Logged in with username <name> and password <password>
   Then "Incorrect email or password." message is displayed


  Examples: 
      | name                         | password           |  
      | ivanco@gmail.com             |  Selenium1!1       |  
