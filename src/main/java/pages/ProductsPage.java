package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    By productNameLocator = new By.ByXPath("//h5[contains(text(),'Yüksek Bel Süper Skinny Fit Kadın Rodeo Jean Panto')]");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public void selectProduct() {
        click(productNameLocator);
    }
}
