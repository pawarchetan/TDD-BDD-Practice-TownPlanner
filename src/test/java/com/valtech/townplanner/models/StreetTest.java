package com.valtech.townplanner.models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StreetTest {
    @Test
    public void testCreateStreetSpecification() throws Exception {
        new Street(new ArrayList<>());
    }

    @Test
    public void testGetHouseNumbers() throws Exception {
        Street street = new Street(Arrays.asList(1, 2, 4, 3));
        assertThat(street.getHousesNumbers()).isEqualTo(Arrays.asList(1, 2, 4, 3));
    }

    @Test
    public void testGetEmptyHouses() throws Exception {
        Street street = new Street(new ArrayList<>());
        assertThat(street.getHousesNumbers()).isEmpty();
    }

    @Test
    public void testGetDifferentHouseNumbers() throws Exception {
        Street street = new Street(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(street.getHousesNumbers()).containsExactly(1, 2, 3, 4, 5, 6);
    }

}
