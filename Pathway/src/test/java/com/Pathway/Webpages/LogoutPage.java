package com.Pathway.Webpages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import com.Pathway.Base.Basepage;

public class LogoutPage extends Basepage
{
	
	private By accounticon = By.xpath("//img[@id='profile-img']");
	private By logoutbutton = By.xpath("//a[contains(text(),'Logout')]");
	
	public void logoutUser()
	{
		refreshthepage();
		sleep();
		try {
			sleep();
			mouseoverelement(accounticon);
			sleep();
			explicitWaitClickable(logoutbutton);
			sleep();
		} catch (NoSuchElementException e) {
			
		}
		
}

}
