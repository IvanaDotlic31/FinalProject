package tests;

import org.junit.Test;

import pages.HomePage;
import pages.SigninPage;

public class SigninTests extends HomePageTests{

    public SigninPage signinPage;
    String email = "ivana31todorovic@yahoo.mail";
    String password = "dotlic";
    String expectedText = "MY ACCOUNT";
    String errorpassword = "peraDetlic";
    String errorText = "Authentication failed.";
    String emtyEmail = "";
    String emptyEmailError = "An email address required.";
    String expectedSignOutText = "Authentication";

    @Test
    public void verifySuccesfullSignin(){
        SigninPage signinPage = new SigninPage(driver);
        signinPage.signIn(email, password);
        signinPage.verifySuccesfullSignin(expectedText);

        try{
            Thread.sleep(10000);
        }
        
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test
    public void verifyUnSuccesfullSignin(){
        SigninPage signinPage = new SigninPage(driver);
        signinPage.signIn(email, errorpassword);
        signinPage.verifySuccesfullSignin(errorText);

        try{
            Thread.sleep(10000);
        }
        
        catch(InterruptedException e){
            e.printStackTrace();
        }
    
    }
    
    @Test
    public void emptyMailSignin(){
        SigninPage signinPage = new SigninPage(driver);
        signinPage.signIn(emtyEmail, errorpassword);
        signinPage.verifySuccesfullSignin(emptyEmailError);

        try{
            Thread.sleep(10000);
        }
        
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void verifySuccesfulSignout(){
        SigninPage signinPage = new SigninPage(driver);
        signinPage.homePage();
        signinPage.signIn(email,password);
        signinPage.verifySuccesfulSignout(expectedSignOutText);

        try{
            Thread.sleep(6000);
        }
        
        catch(InterruptedException e){
            e.printStackTrace();
        }


    }



}



 
          
