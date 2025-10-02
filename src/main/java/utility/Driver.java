package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static  WebDriver getDriver() {
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\chromedriver.exe");
            driver=new ChromeDriver();
        }

        return driver;
    }
}
