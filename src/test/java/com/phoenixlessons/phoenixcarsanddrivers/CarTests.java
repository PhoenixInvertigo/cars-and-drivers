package com.phoenixlessons.phoenixcarsanddrivers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTests {

    @Test
    public void CarAllArgsConstructorTest(){

        Car car = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
    }

    @Test
    public void CarNoArgsConstructorTest(){

        Car car = new Car();
    }

    @Test
    public void CarGetMakeTest(){

        Car car = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        assert (car.getMake().equals("Kia"));
    }

    @Test
    public void CarGetModelConstructor(){

        Car car = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        assert (car.getModel().equals("Optima"));
    }

    @Test
    public void CarGetYearTest(){

        Car car = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        assert (car.getYear() == 2005);
    }

    @Test
    public void CarGetDriverTest(){

        Car car = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        assert (car.getDriver().equals(new Driver("Ryo", "Kilgannon")));
    }

    @Test
    public void CarSetMakeTest(){

        Car car = new Car();
        car.setMake("Kia");
    }

    @Test
    public void CarSetModelConstructor(){

        Car car = new Car();
        car.setModel("Optima");
    }

    @Test
    public void CarSetYearTest(){

        Car car = new Car();
        car.setYear(2005);
    }

    @Test
    public void CarSetDriverTest(){

        Car car = new Car();
        car.setDriver(new Driver());
    }

    @Test
    public void CarEqualsTest(){

        Car car1 = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        Car car2 = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        assert (car1.equals(car2));
    }

    @Test
    public void CarToStringTest(){

        Car car = new Car("Kia", "Optima", 2005, new Driver("Ryo", "Kilgannon"));
        String result = "Car(make=Kia, model=Optima, year=2005, driver=Driver(firstName=Ryo, lastName=Kilgannon))";
        assert (car.toString().equals(result));
    }
}
