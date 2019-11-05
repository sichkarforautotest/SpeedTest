package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;


public class TutorialPages extends ParentPage {

    @AndroidFindBy(id = "org.zwanoo.android.speedtest:id/ookla_top_bar_logo_text")
    private MobileElement headerLogo;

    @AndroidFindBy(id = "org.zwanoo.android.speedtest:id/enable_bg_sampling_allow_button")
    private MobileElement buttonAllowEnableNetwork;

    @AndroidFindBy(id = "org.zwanoo.android.speedtest:id/gdpr_atrack_do_not_allow_button")
    private MobileElement DoNotAllowHelpUs;

    @AndroidFindBy(id = "org.zwanoo.android.speedtest:id/gdpr_oba_do_not_allow_button")
    private MobileElement buttonDoNotAllowInteresrtBased;

    @AndroidFindBy(id = "org.zwanoo.android.speedtest:id/gdpr_privacy_done_button")
    private MobileElement buttonDonePrivacyNotise;


    public TutorialPages(AppiumDriver driver) {
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

   public void clickOnButtonAllowEnableNetwork(){
        actionsWithElements.clickOnElement(buttonAllowEnableNetwork);
   }

   public void clickOnButtonDoNotAllowHelpUs(){
        actionsWithElements.clickOnElement(DoNotAllowHelpUs);
   }

   public void clickOnButtonDoNotAllowInterstBased(){
        actionsWithElements.clickOnElement(buttonDoNotAllowInteresrtBased);
   }

   public void clickOnButtonDonePrivacyNotice(){
        actionsWithElements.clickOnElement(buttonDonePrivacyNotise);
   }

}
