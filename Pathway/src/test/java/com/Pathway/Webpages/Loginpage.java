package com.Pathway.Webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

import com.Pathway.Base.Basepage;
import com.Pathway.Stepdefinations.Cancleationflow;

public class Loginpage extends Basepage
{


	private By Emailfieldbox = By.id("i0116");
	private By Nextbuttonforsignin = By.id("idSIButton9");
	private By Passwordfiledbox = By.id("i0118");
	private By signinbutton = By.id("idSIButton9");
	private By Yesbutton = By.id("idSIButton9");
	private By loginsecondaccount = By.xpath("(.//*[@data-bind='imgSrc'])[3]");
	private By loginwiththirdaccount = By.xpath("(.//*[@data-bind='imgSrc'])[5]");
	private By loginwithfourthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[7]");
	private By loginwithfifthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[9]");
	private By loginwithsixthaccount = By.xpath("(.//*[@data-bind='imgSrc'])[11]");
	
	public void doLogin( String email, String password)
	{
		try {
			enterText(Emailfieldbox, email);
			sleep();
			click(Nextbuttonforsignin);
			sleep();
			
			enterText(Passwordfiledbox, password);
			sleep();
			//element.sendKeys(password);
		} catch (StaleElementReferenceException e) {
			enterText(Passwordfiledbox, password);
			sleep();
		}
	/*	WebElement element1 = driver.findElement(signinbutton);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(Passwordfiledbox));
		element1.click();*/
		
		
		explicitWaitClickable(signinbutton);
		//sleep();
	}
	public void poplogin()
	{
		try {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_J); 
			sleep();
			r.keyRelease(KeyEvent.VK_SHIFT);
			sleep();
         	r.keyPress(KeyEvent.VK_A);
         	r.keyPress(KeyEvent.VK_L);
         	r.keyPress(KeyEvent.VK_E);
         	Thread.sleep(2000);
         	r.keyPress(KeyEvent.VK_E);
         	r.keyPress(KeyEvent.VK_L);
         	r.keyPress(KeyEvent.VK_DECIMAL);
         	r.keyPress(KeyEvent.VK_SHIFT);
			sleep();
         	r.keyPress(KeyEvent.VK_K);
         	r.keyRelease(KeyEvent.VK_SHIFT);
			sleep();
         	r.keyPress(KeyEvent.VK_H);
         	r.keyPress(KeyEvent.VK_A);
         	r.keyPress(KeyEvent.VK_N);
         	r.keyPress(KeyEvent.VK_SHIFT);
         	r.keyPress(KeyEvent.VK_2);
         	Thread.sleep(2000);
         	r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyPress(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_M);
			r.keyRelease(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_O);
			r.keyPress(KeyEvent.VK_B);
			r.keyPress(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_L);
			r.keyPress(KeyEvent.VK_E);
			r.keyPress(KeyEvent.VK_DECIMAL);
			r.keyPress(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_O);
			r.keyPress(KeyEvent.VK_M);
			
	
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void poppass()
	{ 
		try {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_TAB);
			sleep();
			r.keyPress(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_D);
			r.keyRelease(KeyEvent.VK_SHIFT);
			sleep();
			r.keyPress(KeyEvent.VK_E);
			r.keyPress(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_SHIFT);
	     	r.keyPress(KeyEvent.VK_2);
	     	Thread.sleep(2000);
	     	r.keyRelease(KeyEvent.VK_SHIFT);
	     	sleep();
	     	r.keyPress(KeyEvent.VK_2);
	     	r.keyPress(KeyEvent.VK_0);
	     	r.keyPress(KeyEvent.VK_2);
	     	sleep();
	     	r.keyPress(KeyEvent.VK_0);
	     	sleep();
	     	
	     	Thread.sleep(3000);

			Screen screen2 = new Screen();
			Thread.sleep(3000);
			screen2.click("C:\\Users\\saiku\\Downloads\\SignInButton.png");
	  /*   	r.keyPress(KeyEvent.VK_TAB);
	     	sleep();
	     	enter();*/
		} catch (Exception e) {
			// TODO: handle exception
		}
     	
	}
	public void stagelogin()
	{
		enterText(Emailfieldbox, "Ramesh.Bandaru2@T-Mobile.com");
		sleep();
		click(Nextbuttonforsignin);
		sleep();
	}
	public void popuplogin()
	{
try {
    
	Robot r = new Robot();
	            /*
	             * r.keyPress(KeyEvent.VK_CAPS_LOCK); Thread.sleep(2000);
	             * r.keyPress(KeyEvent.VK_CAPS_LOCK); Thread.sleep(2000);
	             */
	            /*
	             * r.keyPress(KeyEvent.VK_CONTROL); sleep();
	             */
	           /* Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_J);
	            Thread.sleep(2000);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_A);
	            r.keyPress(KeyEvent.VK_L);
	            r.keyPress(KeyEvent.VK_E);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_E);
	            r.keyPress(KeyEvent.VK_L);
	            r.keyPress(KeyEvent.VK_DECIMAL);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_K);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_H);
	            r.keyPress(KeyEvent.VK_A);
	            r.keyPress(KeyEvent.VK_N);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            
	            r.keyPress(KeyEvent.VK_2);
	            r.keyPress(KeyEvent.VK_3);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            
	            r.keyPress(KeyEvent.VK_2);
	            
	            Thread.sleep(2000);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_T);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_MINUS);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_M);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_O);
	            r.keyPress(KeyEvent.VK_B);
	            r.keyPress(KeyEvent.VK_I);
	            r.keyPress(KeyEvent.VK_L);
	            r.keyPress(KeyEvent.VK_E);
	            r.keyPress(KeyEvent.VK_DECIMAL);
	            r.keyPress(KeyEvent.VK_C);
	            r.keyPress(KeyEvent.VK_O);
	            r.keyPress(KeyEvent.VK_M);
	            r.keyPress(KeyEvent.VK_TAB);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_D);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_E);
	            r.keyPress(KeyEvent.VK_V);
	            r.keyPress(KeyEvent.VK_SHIFT);
	            r.keyPress(KeyEvent.VK_2);
	             Thread.sleep(2000);
	            r.keyRelease(KeyEvent.VK_SHIFT);
	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_2);
	                   
	            r.keyPress(KeyEvent.VK_0);
	            r.keyPress(KeyEvent.VK_2);
	            r.keyPress(KeyEvent.VK_0);


	            Thread.sleep(2000);
	            r.keyPress(KeyEvent.VK_TAB);
	            r.keyPress(KeyEvent.VK_ENTER);
	            r.keyRelease(KeyEvent.VK_CONTROL);
	 */
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_R);
    Thread.sleep(2000);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_M);
    r.keyPress(KeyEvent.VK_E);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_S);
    r.keyPress(KeyEvent.VK_H);
    r.keyPress(KeyEvent.VK_DECIMAL);
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_B);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_N);
    r.keyPress(KeyEvent.VK_D);
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_R);
    r.keyPress(KeyEvent.VK_U);
    r.keyPress(KeyEvent.VK_2);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_2);
    Thread.sleep(2000);
    r.keyRelease(KeyEvent.VK_SHIFT);
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_MINUS);
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_M);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_O);
    r.keyPress(KeyEvent.VK_B);
    r.keyPress(KeyEvent.VK_I);
    r.keyPress(KeyEvent.VK_L);
    r.keyPress(KeyEvent.VK_E);
    r.keyPress(KeyEvent.VK_DECIMAL);
    r.keyPress(KeyEvent.VK_C);
    r.keyPress(KeyEvent.VK_O);
    r.keyPress(KeyEvent.VK_M);
    r.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_B);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_U);
    r.keyPress(KeyEvent.VK_F);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_F);
    r.keyPress(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_L);
    r.keyPress(KeyEvent.VK_O);
    r.keyPress(KeyEvent.VK_5);       
    r.keyPress(KeyEvent.VK_3);
    r.keyPress(KeyEvent.VK_6);
    r.keyPress(KeyEvent.VK_2);
    r.keyPress(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_SLASH);
    r.keyRelease(KeyEvent.VK_SHIFT);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_TAB);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_CONTROL);




} catch (Exception e) {
	// TODO: handle exception
}
	}
	public void ClickYesbutton()
	{
		
		Actions actions = new Actions(driver);
	    WebElement yes = driver.findElement(By.xpath("//input[@type='submit']"));
	    yes.isDisplayed();
	    yes.isEnabled();
	    
	    actions.moveToElement(yes).click().perform();
	   
	}
	
	public void loginwithsecondaccount()
	{
		elementclickbyjs(loginsecondaccount);
		sleep();
	}
	public void loginwithThirdaccount()
	{
		explicitWaitClickable(loginwiththirdaccount);
		sleep();
	}
	public void loginwithFourthaccount()
	{
		explicitWaitClickable(loginwithfourthaccount);
		sleep();
	}
	
	public void loginwithfifthaccount()
	{
		explicitWaitClickable(loginwithfifthaccount);
		sleep();
	}
	public void loginwitsixthaccount()
	{
		explicitWaitClickable(loginwithsixthaccount);
		sleep();
	}
}
