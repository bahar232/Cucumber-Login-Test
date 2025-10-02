package adimTanimlari;

import PageObjectModel.girisYap_sayfasi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utility.Driver;

import java.util.concurrent.TimeUnit;

public class Giris_adimlari {

    private WebDriver driver;
    girisYap_sayfasi g1=new girisYap_sayfasi();

    @Given("siteye git")
    public void siteye_git() {
        //System.out.println("Siteye gittim");
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Given("giris sayfası basarili")
    public void giris_sayfası_basarili() {
        System.out.println("giriş sayfası başarili");
    }
    @Given("sepete ekle")
    public void sepete_ekle() {g1.sepete_ekle();
    }

    @Given("sepet butonuna bas")
    public void sepet_butonuna_bas() {
        g1.sepet_butonuna_bas();
    }
    @Given("sepetten cıkar")
    public void sepetten_cıkar() { g1.sepetten_cıkar();

    }
    @When("urun sepetten cikarildi")
    public void urun_sepetten_cikarildi() {
        System.out.println("urun sepetten cikarildi");
    }
    @Then("basarili mesajini gor")
    public void basarili_mesajini_gor() {
        System.out.println("başarılı ");
    }

}
