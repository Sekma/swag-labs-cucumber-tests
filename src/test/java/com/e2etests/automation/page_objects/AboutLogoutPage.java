package com.e2etests.automation.page_objects;

import com.e2etests.automation.utils.SeleniumUtils;

public class AboutLogoutPage {
	private SeleniumUtils seleniumUtils;
	
	/** Create methods **/	
	public AboutLogoutPage() {
		this.seleniumUtils = new SeleniumUtils();		
	}
	public void burger() {
		//seleniumUtils.acceptAlert();
		seleniumUtils.click("id", "react-burger-menu-btn");
	}
	public void about() {
		seleniumUtils.click("id", "about_sidebar_link");
	}
	
	public void logout() {
		seleniumUtils.click("id", "logout_sidebar_link");
	}
	
}
