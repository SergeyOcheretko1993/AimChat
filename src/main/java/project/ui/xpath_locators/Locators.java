package project.ui.xpath_locators;

/**
 *
 * @author Sergey Ocheretko
 * @version 1.0
 */

public interface Locators {

    String AIMCHAT_LOGO = "//div[@class='w5oWeniZnBp6l484bQl77']";
    String LOGIN_FIELD = "//input[@id='outlined-helperText']";
    String PASSWORD_FIELD = "//input[@id='outlined-adornment-password']";
    String SIGNIN_BUTTON = "//span[@class='MuiButton-label']";
    String GENERAL_ROOM_LOGO = "//div[@class='room-header-avatar-wrapper']";
    String INVALID_LOGIN_OR_PASSWORD = "//div[@class='_3RfoktmAfskZhdqLWBxvhK']";
    String EYE_ICON = "//button[@aria-label='toggle password visibility']";
    String FORGOT_PASSWORD = "//span[contains(.,'Forgot your password?')]";
    String RESET_PASSWORD_TITLE = "//h5[normalize-space()='Reset Password']";
    String RESET_PASSWORD_FIELD = "//input[@id='outlined-helperText']";
    String SEND_REQUEST_BUTTON = "//span[@class='MuiButton-label']";
    String REQUEST_SENT_TITLE = "//h5[contains(text(),'Request Sent')]";
    String ARROW_ICON_USERMENU = "//div[@class='username-block']//*[name()='svg']";
    String LOG_OUT_BUTTON = "//span[contains(.,'Log out')]";
    String EMPTY_LOGIN_ALERT = "//div[normalize-space()='Login cannot be empty']";
    String BOUNDARY_LOGIN_FIELD = "//div[normalize-space()='Login should contain from 5 to 255 characters']";
    String CYRILLIC_SYMBOLS = "//div[normalize-space()='Login contains invalid characters']";
    String EMPTY_PASSWORD = "//div[contains(text(),'Password cannot be empty')]";
    String INVALID_EMAIL = "//div[contains(text(),'Invalid email address')]";
    String SEND_REQUEST = "//span[normalize-space()='Send Request']";
    String SIGN_UP_TITLE = "//h5[normalize-space()='Sign Up']";
    String DOMAIN_NAME_DROPDOWN = "//div[@id='demo-simple-select']";
    String LIST_BOX = "//ul[@role='listbox']";
    String EMAIL_FIELD = "//input[@name='email']";
    String USERNAME_FIELD = "//input[@placeholder='Enter your username']";
    String BOUNDARY_USERNAME_FIELD = "//div[contains(text(),'Username should contain from 3 to 27 characters')]";
    String INVALID_USERNAME = "//div[contains(text(),'Username contains invalid characters')]";
    String CHECK_YOUR_EMAIL = "//h5[contains(.,'Check Your Email')]";
    String BACK_TO_SIGN = "//span[contains(text(),'Back to Sign In')]";
    String MAIN_BLOCK_MENU = "//div[@class='settings-nav-block']";
    String PREFERENCES = "//h2[contains(text(),'Preferences')]";
    String MY_PROFILE = "//span[normalize-space()='My Profile']";
    String FIRST_NAME_FIELD = "//input[@name='firstName']";
    String LAST_NAME_FIELD = "//input[@name='lastName']";
    String SAVE_CHANGES_BUTTON = "//button[.='SAVE CHANGES']";
    String SAVED_CHANGES_ALERT = "//div[@role='alert']";
    String SELECT_TIME_ZONE = "//div[@id='mui-component-select-deviceSource']";
    String TIME_ZONE = "//div[@id='menu-deviceSource']//li[56]";
    String DELETE_AVATAR_BUTTON = "//span[@class='delete-avatar-button-text']";
    String BACK_BUTTON = "//div[@class='back-button']//*[name()='svg']";
    String DISABLE_SEND_REQUEST_BUTTON = "//button[contains(@tabindex,'-1')]";
    String CHANGE_AVATAR_BUTTON = "//label[@for='avatarFile']";
    String DOWNLOAD_BUTTON = "//a[@class='download']";
    String IMAGE = "//div[@id='image-preview-47497443']//img[@alt='IMG_1522.JPG']";
}
