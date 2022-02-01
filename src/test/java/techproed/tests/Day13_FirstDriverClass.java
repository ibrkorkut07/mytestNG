package techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day13_FirstDriverClass {

    @Test
    public void firstDriverTest(){
//      driver =>>>>> Driver.getDriver()
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().navigate().to("https://www.google.com");
        Driver.closeDriver();
    }
}