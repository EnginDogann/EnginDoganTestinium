package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import org.testng.Assert;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class LcWaikikiPage extends AbstractClass{


    WebDriver driver;

    public LcWaikikiPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "(//a[contains(@class,'dropdown-toggle')])[1]")
    private WebElement loginButton;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userN;
    @FindBy(xpath = "(//ins[@class='iCheck-helper'])[1]")
    private WebElement selectEmail;
    @FindBy(xpath = "//input[@id='LoginEmail']")
    private WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwrd;
    @FindBy(xpath = "//a[@id='loginLink']")
    private WebElement LoginBtn;
    @FindBy(xpath = "//span[@class='dropdown-label'][contains(.,'Hesabım')]")
    private WebElement MyAccount;
    @FindBy(xpath = "//input[@id='search_input']")
    private WebElement searchLabel;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement searchButton;
    @FindBy(xpath = "//a[@class='lazy-load-button']")
    private WebElement moreProducts;
    @FindBy(xpath = "(//img[contains(@data-index,'0')])[4]")
    private WebElement product;
    @FindBy(xpath = "(//a[@data-tracking-label='BedenSecenekleri'])[1]")
    private WebElement sizeButton;
    @FindBy(id = "pd_add_to_cart")
    private WebElement basketButton;
    @FindBy(id = "spanCart")
    private WebElement toBasket;
    @FindBy(xpath = "//span[@class='rd-cart-item-price mb-15'][contains(.,'89,99 TL')]")
    private WebElement basketProductPrice;
    @FindBy(css = "a.oq-up.plus")
    private WebElement productPlus;
    @FindBy(xpath = "(//input[contains(@value,'2')])[2]")
    private WebElement totalBasketProduct;
    @FindBy(css = "a[title='Sil']")
    private WebElement deleteBasketProduct;
    @FindBy(xpath = "(//a[contains(.,'Sil')])[1]")
    private WebElement deleteBasketProductButton;
    @FindBy(xpath = "//p[@class='cart-empty-title']")
    private WebElement checkEmptyBasket;

    public void clickLoginButton(){
        clickFunction(loginButton);
        System.out.println("Login butonuna tıklandı");
        //logger.info("engın");

    }

    public void checkTitle(){
        AssertTitle(userN,"LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki");
    }

    public void clickSelectEmail(){
        clickFunction(selectEmail);
        System.out.println("Email alanı seçildi");
    }

    public void sendKeysEmail(){
        sendKeysFunction(email,"engn.dgn63@gmail.com");
        System.out.println("Email bilgisi girildi");
    }

    public void sendKeysPassword(){
        sendKeysFunction(passwrd,"engin123");
        System.out.println("Paralo bilgisi girildi");
    }

    public void clickLoginBtn(){
        clickFunction(LoginBtn);
        System.out.println("Üye bilgileri girildi");
    }

    public void checkMyAccount(){
        Assertion(MyAccount,"Hesabım");
        System.out.println("Hesaba giriş yapılmıştır");
    }

    public void sendKeysSearch() throws InterruptedException {
        clickFunction(searchLabel);
        Thread.sleep(2000);
        sendKeysFunction(searchLabel,"pantalon");
        System.out.println("Pantalon kelimesi arandı.");
    }

    public void clickSearchButton(){
        clickFunction(searchButton);
        System.out.println("Arama tuşuna basıldı");
    }

    public void scrollUp() throws InterruptedException {
        scroll();
        System.out.println("scroll yapıldı");
    }

    public void clickMoreProducts(){
        clickFunction(moreProducts);
        System.out.println("Daha fazla ürün görüntülendi.");
    }

    public void selectProduct(){
        clickFunction(product);
        System.out.println("Ürün seçildi.");
    }

    public void clickBasketButton() throws InterruptedException {

        clickFunction(sizeButton);
        Thread.sleep(2000);
        //clickFunction(chooseSize);
        Thread.sleep(2000);
        clickFunction(basketButton);
        System.out.println("Sepete ürün eklendi");
    }

    public void clickToBasket(){
        clickFunction(toBasket);
        System.out.println("Sepete gidildi.");

    }

    public void checkProductPrice() throws InterruptedException{


        String myPrice = "89,99 TL";
        Assertion(basketProductPrice,myPrice);
        System.out.println("Urun fiyati sepetteki ile aynidir");
        System.out.println("Fiyat karşılaştırması yapılmıştır");
    }

    public void clickProductPlus(){
        clickFunction(productPlus);
        System.out.println("Sepetteki ürün adedi artırıldı");
    }

    public void checkTotalBasketProduct() throws InterruptedException {

        AssertCheckBasketProduct(totalBasketProduct,"2");
        System.out.println("Ürün adedi = 2");
        Thread.sleep(2000);

    }

    public void clickDeleteBasketProduct(){
        clickFunction(deleteBasketProduct);
        clickFunction(deleteBasketProductButton);
        System.out.println("Sepetteki ürünler silindi");
    }

    public void clickCheckEmptyBasket(){
        clickFunction(checkEmptyBasket);
        System.out.println("Sepettin boş olduğu kontrol edildi");
    }



}
