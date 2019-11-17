package com.dm.first_project.seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenTelRanSite {
    WebDriver wd;

@BeforeMethod
public void dsetUp(){
wd = new FirefoxDriver();
wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

@Test
public void testOpeningTelranSite(){
wd.get("https://www.tel-ran.com/");
    System.out.println("site https://www.tel-ran.com/ was successfully opened");
    wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    Assert.assertEquals(wd.getCurrentUrl(),"https://www.tel-ran.com/");
}

@AfterMethod
    public void tearDown(){
    wd.quit();
}

}
