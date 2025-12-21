package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;

public class LoginPage {
	private ConfigFileReader configFileReader; 
	private SeleniumUtils seleniumUtils;
	
	/** @FindBy **/
	
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement products;
	
	@FindBy(how = How.TAG_NAME, using = "h3")
	public static WebElement msgError;
	
	/** Create methods **/
	
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		this.seleniumUtils = new SeleniumUtils();
	}
	
	public void login() {
		
		/** with seleniumUtils **/
		seleniumUtils.get(configFileReader.getProperties("swagLabsLogin.url"));
		seleniumUtils.writeText("id", "user-name", configFileReader.getProperties("home.login.p"));
		seleniumUtils.writeText("id", "password", configFileReader.getProperties("home.password.p"));
		seleniumUtils.click("id", "login-button");
	}
	
	public void loginNp() {

		/** with seleniumUtils **/
		seleniumUtils.get(configFileReader.getProperties("swagLabsLogin.url"));
		seleniumUtils.writeText("id", "user-name", configFileReader.getProperties("home.login.inp"));
		seleniumUtils.writeText("id", "password", configFileReader.getProperties("home.password.inp"));
		seleniumUtils.click("id", "login-button");
	}
	
}
