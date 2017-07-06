package com.valtech.townplanner.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*first travel from west to east delivering to the houses on the left hand (north) side of the street. They then travel east to
        west delivering to houses on the south side of the street.*/
public class FirstApproach implements NewsPaperDeliveryScheme {
    private final StreetSpecification streetSpecification;

    public FirstApproach(StreetSpecification streetSpecification) {
        this.streetSpecification = streetSpecification;
    }

    @Override
    public List<Integer> deliveryOrder() {
        final List<Integer> housesInLeftHandSide = streetSpecification.housesInLeftHandSide();
        final List<Integer> housesInRightHandSide = streetSpecification.housesInRightHandSide();
        Collections.reverse(housesInRightHandSide);
        return Stream.concat(housesInLeftHandSide.stream(), housesInRightHandSide.stream())
                .collect(Collectors.toList());
    }

    @Override
    public int numberOfCrossings() {
        return 1;
    }

    @Override
    public String getName() {
        return "FirstApproach";
    }
}
