package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.page_objects.AboutLogoutPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutLogoutStepDefinition {

	private ConfigFileReader configFileReader;
	private AboutLogoutPage aboutLogoutPage; 

	public AboutLogoutStepDefinition() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		this.aboutLogoutPage = new AboutLogoutPage();
	}

	/** Test About **/
	
	@When("je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() {
		aboutLogoutPage.burger();
	}
	@When("je clique sur le bouton about")
	public void jeCliqueSurLeBoutonAbout() {
		aboutLogoutPage.about();
	}
	@Then("je me redirige vers la page about")
	public void jeMeRedirigeVersLaPageAbout() {
		Assert.assertEquals( Setup.getDriver().getCurrentUrl() , configFileReader.getProperties("saucelabs.url"));
	}

	/** Test Logout **/

	@When("je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		aboutLogoutPage.logout();
	}
	@Then("je me redirige vers la page de connexion")
	public void jeMeRedirigeVersLaPageDeConnexion() {
		Assert.assertEquals( Setup.getDriver().getCurrentUrl() , configFileReader.getProperties("swagLabsLogin.url"));
	}



	
}
