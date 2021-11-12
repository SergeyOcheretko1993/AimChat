Feature: SIGN UP PAGE

  Background:
    When Go to url "https://chat-demo.aimprosoft.com/"
    Then Click on the 'Send Request' link
    And  Sign Up page is opened


  Scenario: 2.002 Check Back to sign button
    And Click on the Back to sign button
    And AIMCHAT logo is presented

  Scenario: 2.003 Check opening available domain names from "Domainname" dropdown
    And Click on the Domain name dropdown
    And Dropdown is opened


  Scenario: 2.004 Check appearing warning message "Invalid e-mail address" on the "Sign up" page via the special symbols.
    And Enter "*%^*&^(" in the 'Email' field
    And Enter "test" in the Username field
    And 'Invalid email address' alert is displayed


  Scenario: 2.005 Check appearing warning message "Username should contain from 3 to 27 characters" in the "Username" field for minimum unacceptable charasters
    And Enter "iw" in the Username field
    And Enter "test" in the 'Email' field
    And 'Username should contain from 3 to 27 characters' alert is displayed


  Scenario: 2.006 Check appearing warning message "Username should contain from 3 to 27 characters" in the "Username" field for maximum unacceptable charasters
    And Enter "qiudhwhdiquwdhiwuqdhwerwerwe" in the Username field
    And Enter "test" in the 'Email' field
    And 'Username should contain from 3 to 27 characters' alert is displayed


  Scenario: 2.007 Check appearing warning message "Username contains invalid characters" in the "Username" field.
    And Enter "ыдфвоыфловлы" in the Username field
    And Enter "test" in the 'Email' field
    And 'Username contains invalid characters' alert is displayed