Feature: DOWNLOAD FILE

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
      And Scroll up to the top
