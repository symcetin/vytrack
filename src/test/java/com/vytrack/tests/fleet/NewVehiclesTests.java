package com.vytrack.tests.fleet;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.fleet.VehiclesPage;
import com.vytrack.tests.AbstractTestBase;
import com.vytrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewVehiclesTests extends AbstractTestBase {

    @Test
    public  void verifyTitle(){
        LoginPage loginPage = new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();

        loginPage.login();
        vehiclesPage.navigateTo("Fleet", "Vehicles");

        String expectedTitle = "All - Car - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
