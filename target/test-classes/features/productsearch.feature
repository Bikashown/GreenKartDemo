Feature: Search and place order for any product in greenKart application

Scenario Outline: Search experience for product in both offer and product page

Given User is on greenkart landing page
When User searched with shortname <Name> amd extracted actual name of product
Then User searched for same shortname <Name> in offer page to check if product exist with same name
  
  Examples:
  |Name|
  |Tom |
  |Beet|