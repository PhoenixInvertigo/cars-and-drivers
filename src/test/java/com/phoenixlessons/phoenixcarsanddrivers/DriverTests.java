package com.phoenixlessons.phoenixcarsanddrivers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DriverTests {

    @Test
    public void DriverAllArgsConstructorTest(){

        Driver driver = new Driver("Bernie", "Sanders");
    }

    @Test
    public void DriverNoArgsConstructorTest(){

        Driver driver = new Driver();
    }

    @Test
    public void GetDriverFirstNameTest(){

        Driver driver = new Driver("Bernie", "Sanders");
        assert (driver.getFirstName().equals("Bernie"));
    }

    @Test
    public void GetDriverLastNameTest(){

        Driver driver = new Driver("Bernie", "Sanders");
        assert (driver.getLastName().equals("Sanders"));
    }

    @Test
    public void SetDriverFirstNameTest(){

        Driver driver = new Driver();
        driver.setFirstName("Bernie");
        assert (driver.getFirstName().equals("Bernie"));
    }

    @Test
    public void SetDriverLastNameTest(){

        Driver driver = new Driver();
        driver.setLastName("Sanders");
        assert (driver.getLastName().equals("Sanders"));
    }

    @Test
    public void DriverEqualTest(){
        Driver driver1 = new Driver("Bernie", "Sanders");
        Driver driver2 = new Driver("Bernie", "Sanders");
        assert (driver1.equals(driver2));
    }

    @Test
    public void DriverToStringTest(){
        Driver driver = new Driver("Bernie", "Sanders");
        String output = "Driver(firstName=Bernie, lastName=Sanders)";
        assert (driver.toString().equals(output));
    }

}
