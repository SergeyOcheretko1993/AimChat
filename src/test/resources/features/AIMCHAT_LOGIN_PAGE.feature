Feature: AIMCHAT SIGNIN PAGE


  Background:
    When Go to url "https://chat-demo.aimprosoft.com/"
    And  AIMCHAT logo is presented


  Scenario: 1.001 Authorization with valid credentials
    Then Enter "superadmin@aimprosoft.com" in the Login field
    Then Enter "qwerty1" in the Password field
    Then Click on the Sign In button
    And General room logo is presented
    And Click on the 'arrow' icon on the left top corner
    And Click on the Log out button
    And AIMCHAT logo is presented


  Scenario: 1.002 Check entering unregistered login into the "Login" field
    Then Enter "test@g.com" in the Login field
    Then Enter "qwerty123" in the Password field
    Then Click on the Sign In button
    And 'Your Login or Password is incorrect' alert is displayed


  Scenario: 1.003 Authorization with invalid Login
    Then Enter "superadmins@aimprosoft.com" in the Login field
    Then Enter "qwerty1" in the Password field
    Then Click on the Sign In button
    And 'Your Login or Password is incorrect' alert is displayed


  Scenario: 1.004 Check appearing warning message, when "Login" field is empty.
    Then Enter "qwerty123" in the Password field
    And 'Login cannot be empty' alert is displayed


  Scenario: 1.005 Authorization with invalid Password
    Then Enter "superadmin@aimprosoft.com" in the Login field
    Then Enter "qwerty2" in the Password field
    Then Click on the Sign In button
    And 'Your Login or Password is incorrect' alert is displayed


  Scenario: 1.006 Check 'eye' icon
    Then Enter "superadmin@aimprosoft.com" in the Login field
    Then Enter "qwerty1" in the Password field
    Then Click on the 'eye' icon
    And Click on the Sign In button
    And Click on the 'arrow' icon on the left top corner
    And Click on the Log out button
    And AIMCHAT logo is presented


  Scenario: 1.007 Check 'Forgot your password' link
    Then Click on the Forgot your password link
    Then Reset Password page is opened


  Scenario: 1.008 Check 'Forgot your password' function
    Then Click on the Forgot your password link
    Then Reset Password page is opened
    Then Enter "s.ocheretko@aimprosoft.com" in the Reset password field
    And Click on the Send Restore Request button
    And Request sent title is presented


  Scenario: 1.009 Check 'Forgot your password' function with empty field
    Then Click on the Forgot your password link
    Then Reset Password page is opened
    And Send Restore button should be disabled


  Scenario: 1.010 Сheck for the minimum unacceptable capacity of characters in the "Login" field
    Then Enter "b42a" in the Login field
    Then Enter "qwerty1" in the Password field
    And 'Login should contain from '5' to '255' characters' alert is displayed


  Scenario: 1.012 Сheck for the minimum allowable capacity of characters in the "Login" field
    Then Enter "hrttr" in the Login field
    Then Enter "qwerty1" in the Password field
    And Click on the Sign In button
    And 'Your Login or Password is incorrect' alert is displayed


  Scenario: 1.013 Сheck for the maximum allowable capacity of characters in the "Login" field
    Then Enter "kmwemoweowiemfowfowenfweofnweofnwoefnweownvowenownvowvnovnwoevnowenvownvovweovnooooooooooooooooooooooooooooooooooooooooooooooooooooooowvnovnovvnownvnewnvwoevnwonvwoevnwovnwoevnowenvownvowevnowvnownvowevwonvwvnwovowvnoewnoovwvnwevnwnovwvwenewvwevnwvinweovd" in the Login field
    Then Enter "qwerty1" in the Password field
    And Click on the Sign In button
    And 'Your Login or Password is incorrect' alert is displayed


  Scenario: 1.014 Check entering "Login" with cyrillic symbols into the "Login" field.
    Then Enter "аввпв" in the Login field
    Then Enter "qwerty1" in the Password field
    And 'Login contains invalid characters' alert is displayed


  Scenario: 1.015 Check entering "Login" with whitespaces between characters
    Then Enter "ab a1 23" in the Login field
    Then Enter "qwerty1" in the Password field
    And 'Login contains invalid characters' alert is displayed


  Scenario: 1.016 Check entering "Login" with whitespaces between characters
    Then Enter "ab a1 23 " in the Login field
    Then Enter "qwerty1" in the Password field
    And 'Login contains invalid characters' alert is displayed


  Scenario: 1.017 Check entering "Login" with special symbols into the "Login" field
    Then Enter "ab a1 23$" in the Login field
    Then Enter "qwerty1" in the Password field
    And 'Login contains invalid characters' alert is displayed

  Scenario: 1.018 Check entering "Login" with special symbols missing on the keyboard into the "Login" field.
    Then Enter "ab a1 23‰" in the Login field
    Then Enter "qwerty1" in the Password field
    And 'Login contains invalid characters' alert is displayed


  Scenario: 1.020 Check appearing warning message "Invalid e-mail address" on the "Sign up" page via the special symbols CHECK
    Then Click on the Forgot your password link
    Then Reset Password page is opened
    Then Enter "#$#@$" in the Reset password field
    And  Send Restore button should be disabled

  Scenario: 1.021 Check appearing warning message "Invalid e-mail address" on the "Email" field via the cirilic symbols. CHECK
    Then Click on the Forgot your password link
    Then Reset Password page is opened
    Then Enter "Invalid email address" in the Reset password field
    And Send Restore button should be disabled


  Scenario: 1.022 Check opening Send Request link
    Then Click on the 'Send Request' link
    And Sign Up page is opened


  Scenario: 1.023 Check opening available domain names from "Domainname" dropdown
    Then Click on the 'Send Request' link
    And Sign Up page is opened
    And Click on the Domain name dropdown
    And Dropdown is opened


  Scenario: 1.025 Check appearing warning message "Invalid e-mail address" on the "Sign up" page via the special symbols.
    Then Click on the 'Send Request' link
    And Sign Up page is opened
    And Enter "*%^*&^(" in the 'Email' field
    And Enter "test" in the Username field
    And 'Invalid email address' alert is displayed


  Scenario: 1.026 Check appearing warning message "Username should contain from 3 to 27 characters" in the "Username" field.
    Then Click on the 'Send Request' link
    And Sign Up page is opened
    And Enter "iw" in the Username field
    And Enter "sergej.ocheretko1" in the 'Email' field
    And 'Username should contain from 3 to 27 characters' alert is displayed