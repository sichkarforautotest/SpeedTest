package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.swing.*;


public class SpeedtestPage extends ParentPage {

    @FindBy(id = "org.zwanoo.android.speedtest:id/go_button")
    private MobileElement buttonGo;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='DOWNLOAD']/android.view.View/android.widget.TextView[3]")
    private MobileElement Download;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='UPLOAD']/android.view.View/android.widget.TextView[3]")
    private MobileElement Upload;

    @FindBy(xpath = "//android.view.View[@content-desc='Ping']/android.view.View/android.widget.TextView[2]")
    private MobileElement Ping;

    @FindBy(xpath = "//android.view.View[@content-desc='Jitter']/android.view.View/android.widget.TextView[2]")
    private MobileElement Jitter;

    @FindBy(xpath = "//android.view.View[6]/android.view.View/android.widget.TextView[2]")
    private MobileElement Loss;

    @FindBy(id = "org.zwanoo.android.speedtest:id/ookla_top_bar_logo_text")
    private MobileElement headerLogo;

    public SpeedtestPage(AppiumDriver driver) {
        super(driver);
    }

    public void checkHeaderText() {
        try {
            Assert.assertEquals("SPEEDTEST", headerLogo.getText());
            logger.info("Text on header are visible");
        }catch (Exception e){
            logger.error(false);
        }
    }

    public  void clickOnButtonGo(){
        actionsWithElements.waitForElementPresent(buttonGo,"Button not visible", 15);
        actionsWithElements.clickOnElement(buttonGo);
    }

    public void printResultTest(){

        actionsWithElements.waitForElementPresent(Download, "Element Download not visible", 35);
        String download = Download.getText();
        actionsWithElements.waitForElementPresent(Upload, "Element Upload not visible", 35);
        String upload = Upload.getText();
        actionsWithElements.waitForElementPresent(Ping, "Element Ping not visible", 35);
        String ping = Ping.getText();
        actionsWithElements.waitForElementPresent(Jitter, "Element Jitter not visible", 35);
        String jitter = Jitter.getText();
        actionsWithElements.waitForElementPresent(Loss, "Element Loss not visible", 35);
        String loss = Loss.getText();

        System.out.println("Donwload Mbps " + download + "\n" + "Upload Mbps " + upload+ "\n" + "Ping " + ping
                            + "\n" + "Jitter " + jitter + "\n" + "Loss " + loss);

    }

}
