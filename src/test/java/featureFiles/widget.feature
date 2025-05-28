Feature: Testing the dropdown


  @Sanity
  Scenario Outline: Verification of dropdown
    Given User opened the bowser
    Then Maximized it and visited the website
    And Selected the "function" option
    Then Selected value from the dropdown
    When Successfully executed it will close the window

    Examples:
    |function| value|
    |Widgets|selectMenu|