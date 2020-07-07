package com.Pathway.Users;

import com.Pathway.Base.Basepage;
import com.Pathway.Webpages.Buildoutflowpages;
import com.Pathway.Webpages.Cancelationflowpages;
import com.Pathway.Webpages.Homepage;
import com.Pathway.Webpages.Loginpage;
import com.Pathway.Webpages.Renewalflowpages;
import com.Pathway.Webpages.RequestViewPage;

import Testdata.DataRetrival;

public class RPMUser extends Basepage
{

	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
	com.Pathway.Testdata.DataRetrival data = new com.Pathway.Testdata.DataRetrival();
	Renewalflowpages renewalpage = new Renewalflowpages();
	Buildoutflowpages buildout = new Buildoutflowpages();
	RequestViewPage view = new RequestViewPage();
	public void loginwithRPMUser()
	{
		
		login.doLogin(data.getUsername(2), data.getPassword(2));
	}
	
	public void CancelationrequestwithRPMuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		view.requestview(i);
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithRPMuser();
		}
		else {
			cancel.rejectcancelationwithRPMuser();
		}
	}
	
	public void fullcancelationwithRPMuser(int i)
	{
		String Txid = data.getColumn_1(i);
		String Rxid = data.getColumn_2(i);
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		cancel.fullcancelationwithRPM(Txid, Rxid);
	}
	public void partialcancelationwithRPMuser(int i)
	{
		String Txid = data.getColumn_1(i);
		String Rxid = data.getColumn_2(i);
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		cancel.partialcancelationwithRPM(Txid, Rxid);
	}
	public void renewalrequestwithRPMuser(int i)
	{
		String txid = data.getColumn_1(i);
		String rxid = data.getColumn_2(i);
		refreshthepage();
		sleep();
		homepage.renewalbutton();
		renewalpage.createnewrenewalrequestwithRPMuser(txid, rxid);
	}
	
	public void RenewalrequetwithRPMuser(String statsuoftheapplication, int i)
	{
		homepage.renewalbutton();
		view.requestview(i);
		if (statsuoftheapplication.equals("Approved"))
		{
			renewalpage.renewlapprovewithRPMuser();
		}
		else {
			renewalpage.rejectrenewalwithRPMuser();
		}
	}
	
	public void buildoutrequestwithRPMuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		sleep();
		view.requestviewforpm(i);
		if (statusoftheapplication.equals("Approved"))
		{
			buildout.buildoutrequestapprovewithRPMuser();
		}
		else {
			buildout.buildoutrequestrejectwithRPMuser();
		}
	}
	public void createbuildoutrequestwithrpm(int i, String date)
	{
		String txid = data.getColumn_1(i);
		String rxid = data.getColumn_2(i);
		buildout.createnewbuildoutrequestwithRPMuser(txid, rxid, date);
	}

}
