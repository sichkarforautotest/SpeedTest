package speedtestApp;

import org.testng.annotations.Test;
import parentTest.ParentTest;

public class Speed_Test_Ukr_IP extends ParentTest {

    @Test
    public void checkSpeedInternet(){
        tutorialPages.checkHeaderText();
        speedtestPage.clickOnButtonGo();
        speedtestPage.printResultTest();
    }

}

