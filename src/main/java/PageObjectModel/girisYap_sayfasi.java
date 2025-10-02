package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class girisYap_sayfasi extends AbstractOperation{

    WebDriver driver;
    public girisYap_sayfasi() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(partialLinkText = "Add to cart")
    private WebElement sepetlink;
    public void sepete_ekle(){
        tiklamaFonkisyonu(sepetlink);
    }
    @FindBy(partialLinkText = "View Cart")
    private WebElement sepetbutonlink;
    public void sepet_butonuna_bas(){
        tiklamaFonkisyonu(sepetbutonlink);
    }

    @FindBy(className = "cart_quantity_delete")
    private WebElement cıkarlink;
    public void sepetten_cıkar(){
        tiklamaFonkisyonu(cıkarlink);
    }



}

