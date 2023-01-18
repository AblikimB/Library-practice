package com.udun.step_defs;

import com.udun.page.BooksPage;
import com.udun.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Books_StepDef {

    BooksPage booksPage=new BooksPage();
    LoginPage loginPage=new LoginPage();
    int actualBorrowedBookNum;
    int expectedBookNum;

    @Given("the librarian on the home page")
    public void theLibrarianOnTheHomePage() {

        loginPage.login();

    }

    @When("the librarian gets borrowed books number")
    public void theLibrarianGetsBorrowedBooksNumber() {
        actualBorrowedBookNum=Integer.parseInt(booksPage.BorrowedBooksNum.getText());
    }

    @Then("borrowed books number must be match expected result")
    public void borrowedBooksNumberMustBeMatchExpectedResult() {

         expectedBookNum=445;
        Assert.assertEquals(expectedBookNum,actualBorrowedBookNum);
    }
}
