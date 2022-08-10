Feature: validate tags

  @Smoke
  Scenario: Meri Id Check Kar lo
    Given check my First Name
    And print my last name

  @Regression 
  Scenario: Bruno ka pura name batao
    Given print bruno name
    And print bruno last name

  @Smoke
  Scenario: Kikee Ko Uski Maa k samne bulao
    And print kikee name
    When her mother asked her name
