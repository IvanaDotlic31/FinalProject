package tests;

import org.junit.Test;

import pages.HomePage;
import pages.ShoppingPage;
import pages.SigninPage;

public class ShoppingTests extends BaseTest {
    
    public ShoppingPage shoppingPage;
    
@Test
public void verifySuccesfullAddToCart(){
    shoppingPage = new ShoppingPage(driver);
    SigninPage signinPage = new SigninPage(driver);
    HomePage homePage = new HomePage(driver);
    shoppingPage.verifyProductAddedToCart();


    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }



    
    
}


}
