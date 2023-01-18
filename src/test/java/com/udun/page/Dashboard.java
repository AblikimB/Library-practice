package com.udun.page;


import com.udun.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends LoginPage{


    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "borrowed_books")
    public WebElement borrowedBooksNum;

    @FindBy(id = "user_count")
    public WebElement usersNum;



}
