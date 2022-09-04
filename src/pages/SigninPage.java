package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends BasePage {

    public SigninPage(WebDriver driver){
        super(driver);
    }
    String baseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    By emailNewBy = By.id("email_create");
    By createAnAccButtonBy = By.xpath("//*[@id='SubmitCreate']/span");
    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    By signInButtonBy = By.id("SubmitLogin");
    By errorContainer = By.xpath("//*[@id='center_column']/div[1]/ol/li");
    By pageHeadingBy = By.xpath("//*[@id='center_column']/h1");
    By myAccountBy = By.xpath("//*[@id='center_column']/h1");
    By errorContainer1By = By.xpath("//*[@id='center_column']/div[1]/ol/li/text()");
    By signOutButtonBy = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");
   




    public SigninPage homePage(){
        driver.get(baseURL);
        return this;
    }

    public SigninPage signIn(String email, String password){
        writeText(emailBy, email);
        writeText(passwordBy, password);
        click(signInButtonBy);
        return this;
    }
        public SigninPage verifySuccesfullSignin(String expectedText){
            String actualText = readText(pageHeadingBy);
            assertTextEquals(expectedText, actualText);
            return this;
        }

        public SigninPage verifyUnSuccesfullSignin(String expectedTextError){
        String actualText1 = readText(errorContainer);
        assertTextEquals(expectedTextError, actualText1);
        return this;
    }
    public SigninPage verifyEmptyMailSignin(String expectedTextEmpty){
        String actualText2 = readText(errorContainer1By);
        assertTextEquals(expectedTextEmpty, actualText2);
        return this;
    
    }
    public SigninPage clickOnLogoutMenuItem(){
        click(signOutButtonBy);
        return this;
    }
    public SigninPage verifySuccesfulSignout(String expectedSignOutText){
        String actualText = readText(pageHeadingBy);
        assertTextEquals(expectedSignOutText, actualText);
        return this;
    }

}


    

