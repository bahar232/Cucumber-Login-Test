package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Driver;

import java.time.Duration;

public abstract class AbstractOperation {
    private WebDriver driver= Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    public void sendKeysFonksiyonu(WebElement sendKeysElemani, String deger) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElemani));
        sendKeysElemani.sendKeys(deger);
    }

    public void tiklamaFonkisyonu (WebElement tiklamaElemani){
        wait.until(ExpectedConditions.visibilityOf(tiklamaElemani));
        tiklamaElemani.click();
    }
}

