package com.Pathway.Stepdefinations;

import org.apache.log4j.Logger;

import com.Pathway.Base.Basepage;
import com.Pathway.Pathwayconstants.Pathwayconstants;
import com.Pathway.Users.LegalUser;
import com.Pathway.Users.MarketUser;
import com.Pathway.Users.NOCUser;
import com.Pathway.Users.RPMUser;
import com.Pathway.Users.RRMUSER;
import com.Pathway.Webpages.Homepage;
import com.Pathway.Webpages.Loginpage;
import com.Pathway.Webpages.LogoutPage;
import com.Pathway.Webpages.RequestViewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cancleationflow extends Basepage
{
	MarketUser markertuser = new MarketUser();
	RPMUser rpmuser = new RPMUser();
	RequestViewPage view = new RequestViewPage();
	Homepage home = new Homepage();
	RRMUSER rrmuser = new RRMUSER();
	NOCUser nocuser = new NOCUser();
	LegalUser legaluser = new LegalUser();
	Loginpage login = new Loginpage();
	LogoutPage logout = new LogoutPage();
	
	Logger logger = Logger.getLogger(Cancleationflow.class);
	@Given("^Enter Url of application into the \"([^\"]*)\" browser$")
	public void enter_Url_of_application_into_the_browser(String browsername)
	{
		init(browsername);
		geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
		System.out.println(">>>Launch application is succesfully");
	}

	@When("^Market user loginwith valid credtinals for Cancelation process$")
	public void market_user_loginwith_valid_credtinals_for_Cancelation_process()  
	{
	    markertuser.loginwithMarketUser();
	    System.out.println(">>>Market user login with valid credtinals");
	    login.ClickYesbutton();
	   // home.cancelationbutton();
	   // view.checkrejetedlist();
	    
	}

	@Then("^Rise a Cancelation request with Marketuser (\\d+)$")
	public void rise_a_Cancelation_request_with_Marketuser(int i)  {
	    markertuser.cancelationRequest(i);
	    System.out.println(">>>Market user rise a request succesfully");
	   
	}

	@Then("^Logout MarketUser after rise a request for  Cancelation$")
	public void logout_MarketUser_after_rise_a_request_for_Cancelation()  {
	    logout.logoutUser();
	    System.out.println(">>>Logout market user after rise a cancelation request");
	    
	}

	@When("^RPM user login with valid credtinals for Cancelation process$")
	public void rpm_user_login_with_valid_credtinals_for_Cancelation_process()
	{
		login.loginwithsecondaccount();
	    rpmuser.loginwithRPMUser();
	    System.out.println(">>>RPM user login with valid credtinals");
		
	}

	@Then("^RPM user \"([^\"]*)\" Cancelation signal$")
	public void rpm_user_Cancelation_signal(String statusoftheapplication)  
	{
		
	 rpmuser.CancelationrequestwithRPMuser(statusoftheapplication);
	 System.out.println(">>>Check the status of the cancelation request with RPM user");
	 
	}

	@Then("^Logout RPM user after check the status of cancelation request$")
	public void logout_RPM_user_after_check_the_status_of_cancelation_request()  {
		logout.logoutUser();
		System.out.println(">>>Logout RPM user after checking the status of the cancelation request");
		
	}

	@When("^RRM user login with valid credtinals for Cancelation process$")
	public void rrm_user_login_with_valid_credtinals_for_Cancelation_process()  {
	    login.loginwithThirdaccount();
	    rrmuser.loginwithRRMUser();
	    System.out.println(">>>RRM user login with valid credtinals");
	}

	@Then("^RRM user \"([^\"]*)\" Cancelation Signal$")
	public void rrm_user_Cancelation_Signal(String statusoftheapplication) {
	  rrmuser.CancelationrequestwithRRMuser(statusoftheapplication);
	  System.out.println(">>Check the" +statusoftheapplication+ "of the application with with RRM user");
	}

	@Then("^Logout RRM user after check the status of cancelation request$")
	public void logout_RRM_user_after_check_the_status_of_cancelation_request() {
	   logout.logoutUser();
	   System.out.println(">>>logout RRM user after check the status of cancelation request");
	}

	@When("^NOC user login with Vlaid credtinals for Cancletaion process$")
	public void noc_user_login_with_Vlaid_credtinals_for_Cancletaion_process() throws Throwable {
	   login.loginwithFourthaccount();
	   nocuser.loginwithNOCUser();
	   System.out.println(">>>login with NOC user for cancelation request with valid credtinals");
	}

	@Then("^NOC user \"([^\"]*)\" Cancelation signal$")
	public void noc_user_Cancelation_signal(String statusoftheapplication)  {
	    nocuser.CancelationrequestwithNOCuser(statusoftheapplication);
	    System.out.println(">>>Check the" +statusoftheapplication+ "of the application with NOC user");
	}

	@Then("^Logout NOC user after suucesful check the status of Cancelation Process$")
	public void logout_NOC_user_after_suucesful_check_the_status_of_Cancelation_Process()  {
	    logout.logoutUser();
	    System.out.println(">>>log out NOC user");
	}

	@When("^LEGAL user login with valid credtinals for Cancelation Process$")
	public void legal_user_login_with_valid_credtinals_for_Cancelation_Process()  {
	    login.loginwithfifthaccount();
	    legaluser.loginwithLeaglUser();
	    System.out.println(">>>Login with Legaluser with valid credtinals for cancelation request");
	}

	@Then("^Request send to FCC with Legal user$")
	public void request_send_to_FCC_with_Legal_user() throws Throwable {
	    legaluser.CancelationrequestwithLeagluser();
	    System.out.println("Check the status of the application with Legal user");
	}

	@Then("^Logout LEGAL user after succesful Cancelation Request Send to FCC$")
	public void logout_LEGAL_user_after_succesful_Cancelation_Request_Send_to_FCC() throws Throwable {
	   logout.logoutUser();
	   System.out.println("Log out legal user");
	}

}
