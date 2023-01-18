package com.udun.step_defs;

import com.udun.page.Dashboard;
import com.udun.page.LoginPage;
import com.udun.utility.BrowserUtil;
import com.udun.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Dashboard_StepDef {

    Dashboard dashboardPage=new Dashboard();
    LoginPage loginPage=new LoginPage();
    int actualBorrowedBookNum;
    int expectedBookNum;

    int actualUsersNum;


    @Given("the librarian should be on the home page")
    public void theLibrarianShouldBeOnTheHomePage() {
        loginPage.login();
        BrowserUtil.waitFor(3);
    }
    @When("the librarian gets borrowed books number")
    public void theLibrarianGetsBorrowedBooksNumber() {
        actualBorrowedBookNum=Integer.parseInt(dashboardPage.borrowedBooksNum.getText());
    }

    @Then("borrowed books number must be match expected number")
    public void borrowedBooksNumberMustBeMatchExpectedNumber() {

         expectedBookNum=446;
        Assert.assertEquals(expectedBookNum,actualBorrowedBookNum);
    }

    @When("the librarian gets users number")
    public void theLibrarianGetsUsersNumber() {

        actualUsersNum = Integer.parseInt(dashboardPage.usersNum.getText());
        System.out.println("usersNum = " + actualUsersNum);
    }

    @Then("total users number must be match expected number")
    public void totalUsersNumberMustBeMatchExpectedNumber() {
    int expectedUserNum = 1533;
    Assert.assertEquals(expectedUserNum, actualUsersNum);
    }


}
