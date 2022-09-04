package tests;

import org.junit.Test;

import pages.BasePage;
import pages.HomePage;

public class HomePageTests extends BaseTest{
    public HomePage homePage;
    

    int numberOfPopularItems = 7;
    int numberOfBestsellers = 7;


@Test
    public void numberOfPopularItems(){
        homePage =  new HomePage(driver);

        homePage.basePage();
        homePage.numberOfPopularItems(numberOfPopularItems);

        try{
            Thread.sleep(30000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

 @Test
    public void numberOfBestsellers(){
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.clickOnBestSellersButton();
        homePage.numberOfBestsellers(numberOfBestsellers);
    
    
            try{
                Thread.sleep(5000);
    
            }catch(InterruptedException e){
                e.printStackTrace();
        }

    

    }





}