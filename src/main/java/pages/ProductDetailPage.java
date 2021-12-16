package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By sizeSelectLocator = new By.ByXPath("//div[@class='col-xs-12 size-area main-size-area pt-5']//div[@class='option-sizes size-area ucOptionSizeSelector mt-0 mb-0']//div[@id='option-size']//a[@href='javascript:;'][normalize-space()='36']");
    By addCartLocator = new By.ByXPath("//a[@id='pd_add_to_cart']");
    By goCartLocator = new By.ByXPath("//div[normalize-space()='Sepetim']");
    By quantityProductLocator = new By.ByXPath("//div//a[@class='oq-up plus']");
    By deleteOnCartLocator = new By.ByXPath("//i[@class='fa fa-trash-o']");
    By productDeleteLocator = new By.ByXPath("//div[@class='col-xs-12']//a[@id='Cart_ProductDelete_735388993']");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(sizeSelectLocator);
    }

    public void sizeSelect() throws InterruptedException {
        click(sizeSelectLocator);
        Thread.sleep(1000);
    }
    public void addCart() throws InterruptedException {
        click(addCartLocator);
        Thread.sleep(1000);

    }
    public void goCart() {
        click(goCartLocator);

    }
    public void quantityIncrease() throws InterruptedException {
        click(quantityProductLocator);
        Thread.sleep(1000);

    }
    public void deleteCart() throws InterruptedException {
        click(deleteOnCartLocator);
        Thread.sleep(1000);


    }
    public void deleteButton() throws InterruptedException {
        click(productDeleteLocator);
        Thread.sleep(1000);
    }
}
