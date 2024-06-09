import io.appium.java_client.android.AndroidDriver;
import org.appium.Driver;
import org.appium.HomePage;
import org.junit.Test;

public class HomePageTest {
AndroidDriver driver;
    @Test
    public void launchApp() throws InterruptedException {
        Driver obj = new Driver();
        driver = obj.init();

        HomePage homePage = new HomePage(driver);
        homePage.searchApp("Temple Run");

    }
}
