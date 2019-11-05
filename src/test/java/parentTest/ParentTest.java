package parentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.SpeedtestPage;
import pages.TutorialPages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class ParentTest {

    AppiumDriver driver;

    protected TutorialPages tutorialPages;
    protected SpeedtestPage speedtestPage;

    @BeforeTest
    public void setUp() throws MalformedURLException{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.58.101:5555");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "org.zwanoo.android.speedtest");
        desiredCapabilities.setCapability("appActivity","com.ookla.mobile4.screens.main.MainActivity");
        desiredCapabilities.setCapability("app", "/home/user130/G39Proj/Speedtest/src/main/java/apk/speedtest (1).apk");
        desiredCapabilities.setCapability("noReset", false);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        tutorialPages = new TutorialPages(driver);
        speedtestPage = new SpeedtestPage(driver);
    }

    @AfterTest
    public void tearDown(){
       driver.quit();

    }


}
