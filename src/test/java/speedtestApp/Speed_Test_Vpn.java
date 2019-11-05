package speedtestApp;

import org.testng.annotations.Test;
import parentTest.ParentTest;

public class Speed_Test_Vpn extends ParentTest {

    @Test
    public void checkSpeedInternet(){
        tutorialPages.checkHeaderText();
        tutorialPages.clickOnButtonAllowEnableNetwork();
        tutorialPages.clickOnButtonDoNotAllowHelpUs();
        tutorialPages.clickOnButtonDoNotAllowInterstBased();
        tutorialPages.clickOnButtonDonePrivacyNotice();
        speedtestPage.clickOnButtonGo();
        speedtestPage.printResultTest();
    }

}
