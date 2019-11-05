package libs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActionsWithElements {
    AppiumDriver driver;
    Logger logger = Logger.getLogger(getClass());

    public ActionsWithElements(AppiumDriver driver) {
        this.driver = driver;
    }

    public MobileElement waitForElementPresent (MobileElement element, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void clickOnElement(MobileElement mobileElement){
        try{
            mobileElement.click();
            logger.info("Element was clicked");
        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");        }
            }

}
