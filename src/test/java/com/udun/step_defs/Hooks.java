package com.udun.step_defs;

import com.udun.utility.ConfigurationReader;
import com.udun.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
