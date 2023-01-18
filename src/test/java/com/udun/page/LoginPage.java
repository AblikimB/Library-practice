package com.udun.page;

import com.udun.utility.ConfigurationReader;
import com.udun.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;
    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signIn;

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        password.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        signIn.click();
}



}
