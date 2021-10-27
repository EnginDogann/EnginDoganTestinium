package Steps;

import PageObjectModel.LcWaikikiPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LcWaikikiStep {

    LcWaikikiPage lcWaikikiPage = new LcWaikikiPage();

    private WebDriver driver;

    @Given("^lcwaikiki sitesi açılır\\.$")
    public void lcwaikiki_sitesi_açılır() throws Throwable {

        PropertyConfigurator.configure("path_to_log4j.properties");
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("^Ana sayfanın açıldığı kontrol edilir\\.$")
    public void ana_sayfanın_açıldığı_kontrol_edilir() throws Throwable {

        lcWaikikiPage.checkTitle();


    }

    @And("^login butonuna tıklanır\\.$")
    public void loginButonunaTıklanır() {

        lcWaikikiPage.clickLoginButton();

    }

    @And("^eposta secenegi secilir\\.$")
    public void epostaSecenegiSecilir() {
        lcWaikikiPage.clickSelectEmail();
    }

    @And("^eposta girilir\\.$")
    public void epostaGirilir() {
        lcWaikikiPage.sendKeysEmail();
    }

    @And("^sifre girilir\\.$")
    public void sifreGirilir() {
        lcWaikikiPage.sendKeysPassword();
    }

    @And("^Giris yap butonuna tıklanır\\.$")
    public void girisYapButonunaTıklanır() {
        lcWaikikiPage.clickLoginBtn();
    }


    @And("^Login işlemi kontrol edilir\\.$")
    public void login_işlemi_kontrol_edilir() throws Throwable {

        lcWaikikiPage.checkMyAccount();

    }

    @And("^Arama kutucuğuna pantolan kelimesi girilir\\.$")
    public void arama_kutucuğuna_pantolan_kelimesi_girilir() throws Throwable {

        lcWaikikiPage.sendKeysSearch();

    }

    @And("^Arama butonuna basılır\\.$")
    public void aramaButonunaBasılır() {

        lcWaikikiPage.clickSearchButton();
    }

    @And("^Sayfanın sonuna scroll edilir\\.$")
    public void sayfanın_sonuna_scroll_edilir() throws Throwable {

        lcWaikikiPage.scrollUp();

    }

    @And("^Daha fazla ürün gör butonuna tıklanır\\.$")
    public void daha_fazla_ürün_gör_butonuna_tıklanır() throws Throwable {

        lcWaikikiPage.clickMoreProducts();

    }

    @And("^Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir\\.$")
    public void sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir() throws Throwable {

        lcWaikikiPage.selectProduct();

    }

    @And("^Seçilen ürün sepete eklenir\\.$")
    public void seçilen_ürün_sepete_eklenir() throws Throwable {

        lcWaikikiPage.clickBasketButton();

    }

    @And("^Sepete gidilir\\.$")
    public void sepeteGidilir() {

        lcWaikikiPage.clickToBasket();
    }

    @And("^Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır\\.$")
    public void ürün_sayfasındaki_fiyat_ile_sepette_yer_alan_ürün_fiyatının_doğruluğu_karşılaştırılır() throws Throwable {

        lcWaikikiPage.checkProductPrice();


    }

    @And("^Ürün Adedi Artırılır\\.$")
    public void ürün_Adedi_Artırılır() throws Throwable {

        lcWaikikiPage.clickProductPlus();

    }

    @And("^ürün adedinin iki olduğu doğrulanır\\.$")
    public void ürün_adedinin_iki_olduğu_doğrulanır() throws Throwable {

        lcWaikikiPage.checkTotalBasketProduct();

    }

    @And("^Ürün sepetten silinir\\.$")
    public void ürün_sepetten_silinir() throws Throwable {

        lcWaikikiPage.clickDeleteBasketProduct();

    }

    @When("^Sepetin boş olduğu kontrol edilir\\.$")
    public void sepetin_boş_olduğu_kontrol_edilir() throws Throwable {

        lcWaikikiPage.clickCheckEmptyBasket();

    }



}
