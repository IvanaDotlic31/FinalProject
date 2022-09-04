package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup(){

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivana\\Desktop\\QAFinalProject\\QaFinalProject\\lib\\chromedriver.exe");
        //driver = new ChromeDriver();
        System.setProperty("webDriver.gecko.driver", "QaFinalProject\\lib\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }
    
    @After
    public void closedown(){
        driver.quit();
    }

}
