package rozetka.settings;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by dmyv on 5/15/18.
 */
public class FirefoxSettings {

    protected WebDriver driver;
    protected String userEmail = "rozetkatest@mailinator.com";
    protected String userPassword = "Password1";

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public  void tearDown(){
        driver.close();
    }
}
