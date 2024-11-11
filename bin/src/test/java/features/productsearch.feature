Feature: Search and place order for any product in greenKart application

Scenario: Search experience for product in both offer and product page

Given: User is on greenkart landing page
When: User searched with shortname "Tom" amd extracted actual name of product
Then: User searched for same shortname in offer page to check if product exist
  