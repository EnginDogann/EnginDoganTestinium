package PageObjectModel;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    public Logger logger;

    @BeforeClass
    public void setup() {

        logger = Logger.getLogger("Waas API");//added Logger
        PropertyConfigurator.configure("log4j.properties"); //added logger
        logger.setLevel(Level.DEBUG);

    }

    public void clickFunction(WebElement clickElement){

        //wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }


    public void sendKeysFunction(WebElement sendKeysElement, String value){

        //wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectByVisibleText(WebElement selectElement,String value){
        Select slc = new Select(selectElement);
        slc.selectByValue(value);
    }

    public void selectElementFromDropdown(WebElement dropdownn, String element){
        Select slc = new Select(dropdownn);
        slc.selectByVisibleText(element);
    }

    public void Assertion(WebElement actual,String expected){

        //wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);

    }

    public void AssertCheckBasketProduct(WebElement actual,String expected){

        //wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getAttribute("value"),expected);

    }

    public void AssertTitle(WebElement actual, String expected){
        //wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(driver.getTitle(),expected);
        System.out.println("Page Title :  " + driver.getTitle());

    }

    public void AssertionPrice(WebElement actual,WebElement expected){

        //wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected.getText());
        System.out.println("Ürün Fiyatı = "+actual.getText()+" ve "+expected.getText()+" Aynıdır.");
    }

    public String scroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(1000);
        return null;
    }


}
