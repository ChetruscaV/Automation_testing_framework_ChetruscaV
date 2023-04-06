@run
Feature:Register feature test suite

Background:
  Given "https://demo.opencart.com/" is accessed

@run
  Scenario: Register Page URL is accesible from Home Page
    When My account button is clicked
    And Register button is clicked
    Then "register" is present within the current URL

  Scenario Outline:Register page url contains the following word <keyword>
    When My account button is clicked
    And Register button is clicked
    Then "<keyword>" is present within the current URL
    Examples:
    | keyword          |
    | index            |
    | account/register |