Feature: Home Screen Vlidation

  Background: Open website code
    Given open chrome browser
    And Navigate to home screen
    Then verify title "facebook"
    And close the browser

  Scenario: Validate Second Scenario
    Given print scenario second
    Then check console
    And I fill in your message with 
    """
    Hello,

    How are you! This text will be entered 
    in the same format.

    Cheers,
    Tarun
    """
    And looking for DataTables Example 
    |A|1|
    |B|2|
    |C|3|

  Scenario: Run Third Scenario
    And check time
    When you have clock
    And enter username and password
  #  |username|password|
   # | user1234                 | pass1234         |
    #| user567                  | pass567          |
    #| ananyasingh215@gmail.com | twilightsaga1927 |

  Scenario Outline: 
    Given validate user on login screen
    And enter both "<useranme>" and "<password>" check
    And click on login button

 #   Examples: 
  #    | useranme                 | password         |
  #    | user1234                 | pass1234         |
  #    | user567                  | pass567          |
   #   | ananyasingh215@gmail.com | twilightsaga1927 |
