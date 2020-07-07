package com.Pathway.Users;

import com.Pathway.Base.Basepage;
import com.Pathway.Webpages.Buildoutflowpages;
import com.Pathway.Webpages.Cancelationflowpages;
import com.Pathway.Webpages.Homepage;
import com.Pathway.Webpages.Loginpage;
import com.Pathway.Webpages.Renewalflowpages;
import com.Pathway.Webpages.RequestViewPage;

import Testdata.DataRetrival;

public class NOCUser extends Basepage
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
	com.Pathway.Testdata.DataRetrival data = new com.Pathway.Testdata.DataRetrival();
	Renewalflowpages renewalpage = new Renewalflowpages();
	Buildoutflowpages buildout = new Buildoutflowpages();
	RequestViewPage view = new RequestViewPage();
	public void loginwithNOCUser()
	{
		try {
			login.doLogin(data.getUsername(4), data.getPassword(4));
		} catch (Exception e) {
			
		}
		
	}
	
	public void CancelationrequestwithNOCuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		view.requestview(i);
		
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithNOCuser();
		}
		else {
			cancel.rejectcancelationwithNOCuser();
		}
	}
	public void renewalrequestwithNOCuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.renewalbutton();	
		view.requestview(i);
		if (statusoftheapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithNOCuser();
		}
		else {
			renewalpage.rejectrenewalwithNOCuser();
		}
	}
	public void buildourequestwithNOCuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		sleep();
		view.requestviewforpm(i);
		if (statusoftheapplication.equals("Approved"))
		{
			buildout.buildoutrequestapprovewithNOCuser();
		}
		else {
			buildout.buildoutrequestrejectwithNOCuser();
		}
}

}
