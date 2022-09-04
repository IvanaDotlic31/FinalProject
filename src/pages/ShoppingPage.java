package pages;

import java.text.NumberFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingPage extends BasePage {

    public ShoppingPage(WebDriver driver){
        super (driver);
    }

    String baseURL = "http://automationpractice.com/index.php?id_category=5&controller=category";
    By itemBy = By.xpath("//*[@id='center_column']/ul/li");
    By addToCartButtonBy = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span");
    By layerCartBy = By.className("layer_cart_product col-xs-12 col-md-6");
    By proceedToCheckoutBy = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span");
    By totalProductsBy = By.id("total_product");
    By totalShippingBy = By.id("total_shipping");
    By totalBy = By.id("total_price");
    


    public ShoppingPage basePage(){
        driver.get(baseURL);
        return this;
    }

    public ShoppingPage clickOnAddToCartButton(){
        click(addToCartButtonBy);
        return this;
    }
    public ShoppingPage proceedToCheckout(){
        click(proceedToCheckoutBy);
        return this;
    }

    public ShoppingPage clickOnProduct(){
        click(itemBy);
        return this;
    }
    public ShoppingPage verifyProductAddedToCart(){
        click(addToCartButtonBy);
        waitVisibility(layerCartBy);
        return this;
    }

   




    
}
