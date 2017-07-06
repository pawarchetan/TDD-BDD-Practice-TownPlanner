package com.valtech.townplanner;

import com.valtech.townplanner.models.Street;
import com.valtech.townplanner.services.FirstApproach;
import com.valtech.townplanner.services.NewsPaperDeliveryScheme;
import com.valtech.townplanner.services.SecondApproach;
import com.valtech.townplanner.services.StreetSpecification;

import java.util.List;

public class StreetApp implements TownPlanner {
    private final StreetSpecification streetSpecification;

    StreetApp(List<Integer> houses) {
        final Street street = new Street(houses);
        this.streetSpecification = new StreetSpecification(street);
    }

    @Override
    public void process() {
        this.printStreetInfo();
        if (streetSpecification.isValid()) {
            this.printDeliverySchemes();
        } else {
            System.out.println("Street is not valid, so cannot deliver newspapers!");
        }
    }

    private void printStreetInfo() {
        printIfValid(streetSpecification);
        printNumberOfHousesInTheStreet(streetSpecification);
        printNumberOfHousesInTheNorth(streetSpecification);
        printNumberOfHousesInTheSouth(streetSpecification);
    }

    private void printDeliverySchemes() {
        NewsPaperDeliveryScheme schemeOne = new FirstApproach(streetSpecification);
        NewsPaperDeliveryScheme schemeTwo = new SecondApproach(streetSpecification);
        printDeliveryScheme(schemeOne);
        printDeliveryScheme(schemeTwo);
    }

    private void printDeliveryScheme(NewsPaperDeliveryScheme deliveryScheme) {
        System.out.println("----------------");
        System.out.println("Delivery approach name: " + deliveryScheme.getName());
        System.out.println("Delivery Order: " + deliveryScheme.deliveryOrder());
        System.out.println("Number of crossings: " + deliveryScheme.numberOfCrossings());
    }

    private void printIfValid(StreetSpecification streetSpecification) {
        System.out.println("StreetSpecification is valid " + streetSpecification.isValid());
    }

    private void printNumberOfHousesInTheStreet(StreetSpecification streetSpecification) {
        System.out.println("Number of houses in the feature.street " + streetSpecification.numberOfHouses());
    }

    private void printNumberOfHousesInTheNorth(StreetSpecification streetSpecification) {
        System.out.println("Number of houses in the left hand side " + streetSpecification.numberOfHousesInLeftHandSide());
    }

    private void printNumberOfHousesInTheSouth(StreetSpecification streetSpecification) {
        System.out.println("Number of houses in the right hand side " + streetSpecification.numberOfHousesInRightHandSide());
    }
}
