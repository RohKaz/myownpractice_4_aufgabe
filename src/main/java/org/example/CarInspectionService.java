package org.example;

public class CarInspectionService {



    public boolean checkIfCarHasFourTires(Car car) {
        if (car.getNumberOfTires() == 4) {
            return true;
        } else {
            return false;
        }
    }


    public boolean checkIfCarHasSeatBelt(Car car) {
        if (car.isSeatBelt()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfCarHasAirBag(Car car) {
        if (car.isAirBag()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfCarHasThreeOrFiveDoors(Car car) {
        if (car.getNumberOfDoors() == 3 || car.getNumberOfDoors() == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEverything(Car car) {
        if (checkIfCarHasFourTires(car) && checkIfCarHasSeatBelt(car) && checkIfCarHasAirBag(car) && checkIfCarHasThreeOrFiveDoors(car)) {
            return true;
        } else {
            return false;
        }
    }





}
