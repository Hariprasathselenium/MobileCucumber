package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class SauceLabDemoLoginPage {

    AppiumDriver driver = null;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;
    /** Page Objects **/
    private static final By input_UserName = By.xpath("//*[@content-desc='test-Username']");
    private static final By input_Password = By.xpath("//*[@content-desc='test-Password']");
    private static final By btn_Login = By.xpath("//*[@content-desc='test-LOGIN']");
    private static final By errMsg_LoginPage = By.xpath("//*[@content-desc='test-Error message']");
    private static final By txt_HomePage = By.xpath("//*[@text='PRODUCTS']");
    public void launchApp(){
        driver = appiumDriverFactory.getDriver();
            androidUtils = new AndroidUtils(driver);
            if(androidUtils.objectExists(input_UserName)){
                System.out.println("Application Launched!");
                Assert.assertTrue(true,"Application Launched Successfully!");
            }else{
                Assert.assertTrue(false,"Unable to launch application!");
            }

    }

    public void enterUserName(String username){
        if(androidUtils.objectExists(input_UserName)){
            androidUtils.enterValueInTextBox(username,input_UserName);
            Assert.assertTrue(true,"UserName is Entered successfully");
        }else{
            Assert.assertTrue(false,"unable to enter UserName");
        }
    }

    public void enterPassword(String password){
        if(androidUtils.objectExists(input_Password)){
            androidUtils.enterValueInTextBox(password,input_Password);
            Assert.assertTrue(true,"Password is Entered successfully");
        }else{
            Assert.assertTrue(false,"unable to enter Password");
        }
    }

    public void clickLogin(){
        if(androidUtils.objectExists(btn_Login)){
            driver.findElement(btn_Login).click();
            Assert.assertTrue(true,"Login Button is clicked successfully");
        }else{
            Assert.assertTrue(false,"unable to click Login button");
        }
    }

    public void verifyUserEnteredIntoAppSuccessfully(){
        if(androidUtils.objectExists(txt_HomePage)){
            System.out.println("HomePage is displayed");
            Assert.assertTrue(true,"HomePage is displayed successfully Successfully!");
        }else{
            Assert.assertTrue(false,"Unable to display homepage");
        }
    }

    public void verifyValidationMessage(){
        if(androidUtils.objectExists(errMsg_LoginPage)){
            driver.findElement(errMsg_LoginPage).isDisplayed();
            Assert.assertTrue(true,"Error Message is displayed successfully Successfully!");
        }else{
            Assert.assertTrue(false,"Validation Error Message is not displayed");
        }
    }
}
