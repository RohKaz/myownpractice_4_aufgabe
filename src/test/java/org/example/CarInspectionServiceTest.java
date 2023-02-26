package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void checkIfCarHasFourTires() {
        //GIVEN
        Car car = new Car(4, 4, true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean result = carInspectionService.checkIfCarHasFourTires(car);
        //THEN
        assertEquals(true, result);
    }

    @Test
    void checkIfCarHasSeatBelt() {
        //GIVEN
        Car car = new Car(4, 4, true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean result = carInspectionService.checkIfCarHasSeatBelt(car);
        //THEN
        assertEquals(true, result);
    }

    @Test
    void checkIfCarHasAirBag() {
        //GIVEN
        Car car = new Car(4, 4, true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean result = carInspectionService.checkIfCarHasAirBag(car);
        //THEN
        assertEquals(true, result);
    }

    @Test
    void checkIfCarHasThreeOrFiveDoors() {
        //GIVEN
        Car car = new Car(4, 3, true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean result = carInspectionService.checkIfCarHasThreeOrFiveDoors(car);
        //THEN
        assertEquals(true, result);
    }

    @Test
    public void checkEverything() {
        //GIVEN
        Car car1 = new Car(4, 3, true, true);
        Car car2 = new Car(4, 5, true, true);
        Car car3 = new Car(4, 4, true, true);
        Car car4 = new Car(2, 4, true, true);
        Car car5 = new Car(4, 4, true, false);
        Car car6 = new Car(4, 4, false, true);
        CarInspectionService service = new CarInspectionService();
        //WHEN
        boolean result1 = service.checkEverything(car1);
        boolean result2 = service.checkEverything(car2);
        boolean result3 = service.checkEverything(car3);
        boolean result4 = service.checkEverything(car4);
        boolean result5 = service.checkEverything(car5);
        boolean result6 = service.checkEverything(car6);
        //THEN
        assertEquals(true, result1);
        assertEquals(true, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
    }
}