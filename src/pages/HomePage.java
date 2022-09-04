package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String baseURL = "http://automationpractice.com/index.php";
    By contactUsButtonBy = By.xpath("//*[@id='contact-link']/a");
    By signInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By searchItemBy = By.id("search_query_top");
    By searchButtonBy = By.xpath("//*[@id='searchbox']/button");
    By cartButtonBy = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/b");
    By womanButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");
    By dressButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
    By tshirtsButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By shopNowButtonBy = By.xpath("//*[@id='homeslider']/li[2]/div/p[2]/button");
    By popularButtonBy = By.xpath("//*[@id=]/li[1]/a");
    By bestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By add2CartButton1By = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span");
    By moreButton1By = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]/span");
    By eyeButtonBy = By.className("icon-eye-open");
    By comercial1ButtonBy = By.xpath("//*[@id='htmlcontent_home']/ul/li[1]/a/img");
    By newsLetterInputBy = By.id("newsletter-input");
    By newsLetterSubmitButtonBy = By.xpath("//*[@id='newsletter_block_left']/div/form/div/button");
    By numberOfPopularItemsBy = By.className("replace-2x img-responsive");
    By numberOfBestsellersBy = By.xpath("//*[@id='blockbestsellers']");


    public HomePage basePage(){
        driver.get(baseURL);
        return this;
    }

    public HomePage clickOnBestSellersButton(){
        click(bestSellersButtonBy);
        return this;
    }

    public HomePage clickOnPopularButton(){
        click(popularButtonBy);
        return this;
    }

    public HomePage numberOfBestsellers (int expectedNumberOfBestsellers){
        int actualNumberOfBestsellers = countItems(numberOfBestsellersBy);
        assertIntegerEquals(expectedNumberOfBestsellers, actualNumberOfBestsellers);
        return this;
    }

    public HomePage numberOfPopularItems (int expectedNumberOfPopularItems){
        int actualNumberOfPopularItems = countItems(numberOfPopularItemsBy);
        assertIntegerEquals(expectedNumberOfPopularItems, actualNumberOfPopularItems);
        return this;

}
}