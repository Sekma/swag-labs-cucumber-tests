package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.Validations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

	private LoginPage loginPage;
	private Validations validations;

	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
		this.validations = new Validations();
	}
	
	/** Cas passant **/

	@Given("je me connecte sur l application swag labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
		loginPage.login();
	}
	@Then("je me redirige vers la page products {string}")
	public void jeMeRedirigeVersLaPageProducts(String message) {
		validations.assertEquals(LoginPage.products, message);
	}

   /** Cas non passant **/

	@Given("je me connecte sur l application swag labs avec coordonnées incorrects")
	public void jeMeConnecteSurLApplicationSwagLabsAvecCoordonnéesIncorrects() {
		loginPage.loginNp();
	}
	@Then("un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String message) {
		validations.assertEquals(LoginPage.msgError, message);
	}
	
}
