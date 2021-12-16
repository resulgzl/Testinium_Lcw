package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    JavascriptExecutor jsDriver;
    SearchBox searchBox ;
    By cartCountLocator = By.id("spanCart");
    By cartContainerLocator = By.id("nav-cart-count-container");
    By acceptCookiesLocator = new By.ByCssSelector(".cookie__button button");
    By loginPageButton= By.xpath("//span[text()=\"Giriş Yap\"]");
    By emailLoginButton= new By.ByCssSelector("#LoginEmail");
    By passwordButton= new By.ByCssSelector("#Password");
    By loginInButton= By.id("loginLink");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
        jsDriver = (JavascriptExecutor) driver;
    }
    public void Login() throws InterruptedException {
        click(loginPageButton);
        Thread.sleep(1000);
        click(emailLoginButton);
        driver.findElement(emailLoginButton).sendKeys("rslgzl1998@gmail.com");
        click(passwordButton);
        driver.findElement(passwordButton).sendKeys("123121a");
        click(loginInButton);
    }
    public void HoverMethod(){

        jsDriver.executeScript("window.scrollBy(0,600)");
        }


    public SearchBox searchBox(){

        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
