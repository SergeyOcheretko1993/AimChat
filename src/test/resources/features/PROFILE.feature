Feature: PROFILE

  Background:
    When Go to url "https://chat-demo.aimprosoft.com/"
    Then Enter "testuser1@email.com" in the Login field
    Then Enter "qwerty1" in the Password field
    Then Click on the Sign In button
    And General room logo is presented


  Scenario: 3.001 Check opening dropdown menu via the "Main block" menu.
      And Click on the 'arrow' icon on the left top corner
      And Main block is presented
      And Click on the Log out button


  Scenario: 3.002 Check opening "Account settings" window.
      And Click on the 'arrow' icon on the left top corner
      And Main block is presented
      And Click on the My Profile link
      And Preferences page is opened
      And Click on the Back button
      And Click on the Log out button


  Scenario: 3.003 Edit data in the "My Profile" window at the "First name" field
    And Click on the 'arrow' icon on the left top corner
    And Main block is presented
    And Click on the My Profile link
    And Preferences page is opened
    And Clear data in the "First name" field
    And Click on the Save changes button
    And Saved changes alert is displayed
    And Enter "home" in the "First name" field
    And Click on the Save changes button
    And Saved changes alert is displayed
    And Click on the Log out button


  Scenario: 3.004 Edit data in the "My Profile" window at the "Last name" field
    And Click on the 'arrow' icon on the left top corner
    And Main block is presented
    And Click on the My Profile link
    And Preferences page is opened
    And Clear data in the "Last name" field
    And Click on the Save changes button
    And Saved changes alert is displayed
    And Enter "Bye" in the "Last name" field
    And Click on the Save changes button
    And Saved changes alert is displayed
    And Click on the Log out button


  Scenario: 3.007 Edit data in the "My Profile" window at the "Office location" field
    And Click on the 'arrow' icon on the left top corner
    And Main block is presented
    And Click on the My Profile link
    And Preferences page is opened
    And Clear data in the "Office location" field
    And Enter "home" in the "Office loсation" field
    And Click on the Save changes button
    And Saved changes alert is displayed
    And Click on the Log out button

  Scenario: 3.011 Check "Time zone" change
        And Click on the 'arrow' icon on the left top corner
        And Main block is presented
        And Click on the My Profile link
        And Preferences page is opened
        And Click on the select time zone icon
        And Choose another time zone
        And Click on the Save changes button
        And Saved changes alert is displayed


  Scenario: 3.012 Delete avatar in the Profile menu
        And Click on the 'arrow' icon on the left top corner
        And Main block is presented
        And Click on the My Profile link
        And Preferences page is opened
        And Click on the delete button

  Scenario: Download file
    When Go to url "https://chat-demo.aimprosoft.com/"
    Then Enter "testuser1@email.com" in the Login field
    Then Enter "qwerty1" in the Password field
    Then Click on the Sign In button
    And General room logo is presented
    And Open image
    And Download a file
    And File is downloaded

  Scenario: Scrolling functionality
    When Go to url "https://chat-demo.aimprosoft.com/"
    Then Enter "testuser1@email.com" in the Login field
    Then Enter "qwerty1" in the Password field
    Then Click on the Sign In button
    And General room logo is presented





