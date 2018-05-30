package rozetka.tests;

import org.junit.Test;
import rozetka.pages.MainPage;
import rozetka.settings.FirefoxSettings;

/**
 * Created by dmyv on 5/15/18.
 */
public class RozetkaTest extends FirefoxSettings {

    @Test
    public void searchMacbook() throws  InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSignButton();
        mainPage.login(userEmail, userPassword);

    }
}
