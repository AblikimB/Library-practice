package com.udun.step_defs;

import com.udun.page.LoginPage;
import com.udun.utility.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {

LoginPage loginPage = new LoginPage();

    @When(": user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarian_password"));
    }
    @When(": user click login button")
    public void user_click_login_button() {
        loginPage.signIn.click();
    }
    @Then(": user should be able to login dashboard")
    public void user_should_be_able_to_login_dashboard() {

    }
}
