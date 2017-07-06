package com.valtech.townplanner.models;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private final List<Integer> houseNumbers;

    public Street(List<Integer> houseNumbers) {
        this.houseNumbers = houseNumbers;
    }

    public List<Integer> getHousesNumbers() {
        return new ArrayList<>(houseNumbers);
    }
}
