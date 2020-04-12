package com.vytrack.tests.fleet;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.fleet.VehicleOdometerPage;
import com.vytrack.tests.AbstractTestBase;
import org.testng.annotations.Test;

public class VehicleOdometerTests extends AbstractTestBase {

    LoginPage loginPage = new LoginPage();
    VehicleOdometerPage vehiclesPage = new VehicleOdometerPage();

    @Test
    public void test(){
        loginPage.login();
        vehiclesPage.navigateTo("Fleet","Vehicle Odometer");

        vehiclesPage.clickToCreateVehicleOdometer();
        vehiclesPage.fillInfo();
    }

    @Test
    public void verifyCancelButton(){
        loginPage.login();
        vehiclesPage.navigateTo("Fleet","Vehicle Odometer");
        vehiclesPage.clickToCreateVehicleOdometer();

        //Assert.assertTrue(vehiclesPage.clickCancel());

    }
}
