package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import libs.ActionsWithElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

abstract public class ParentPage {
    AppiumDriver driver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithElements actionsWithElements;

    public ParentPage(AppiumDriver driver) {
        this.driver = driver;
        actionsWithElements = new ActionsWithElements(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS), this);
    }
}