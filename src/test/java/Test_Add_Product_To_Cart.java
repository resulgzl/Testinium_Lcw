import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductsPage;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;

    @Test
    public void search_a_product() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.Login();
        homePage.searchBox().search("Pantolon");
        homePage.HoverMethod();
        productDetailPage = new ProductDetailPage(driver);
        Thread.sleep(5);

        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");

        productDetailPage.sizeSelect();
        productDetailPage.addCart();
        productDetailPage.goCart();
        productDetailPage.quantityIncrease();
        productDetailPage.deleteCart();
        productDetailPage.deleteButton();

    }
}
