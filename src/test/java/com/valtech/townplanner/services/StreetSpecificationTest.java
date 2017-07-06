package com.valtech.townplanner.services;

import com.valtech.townplanner.models.Street;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class StreetSpecificationTest {
    @Test
    public void testFindStartingNumber() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 4);
        final int startingNumber = streetSpecification.startingHouseNumber();
        assertThat(startingNumber).isEqualTo(1);
    }

    @Test
    public void testFindAnotherStartingNumber() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(2, 3, 4, 5);
        final int startingNumber = streetSpecification.startingHouseNumber();
        assertThat(startingNumber).isEqualTo(2);
    }

    @Test
    public void testStartingNumberIsZeroWhenListIsEmpty() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService();
        final int startingNumber = streetSpecification.startingHouseNumber();
        assertThat(startingNumber).isEqualTo(0);
    }

    @Test
    public void testHasDuplicatesIsTrueWhenThereIsDuplicates() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 4, 5, 6, 4);
        final boolean hasDuplicates = streetSpecification.hasDuplicates();
        assertThat(hasDuplicates).isTrue();
    }

    @Test
    public void testHasDuplicatesIsTrueWhenThereIsDuplicatesAnotherCase() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 5, 5, 6, 4);
        final boolean hasDuplicates = streetSpecification.hasDuplicates();
        assertThat(hasDuplicates).isTrue();
    }

    @Test
    public void testHasDuplicatesIsTrueWhenThereIsDuplicatesOneMoreCase() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 4, 4);
        boolean hasDuplicates = streetSpecification.hasDuplicates();
        assertThat(hasDuplicates).isTrue();
    }

    @Test
    public void testHasDuplicatesIsFalseWhenThereAreNoDuplicates() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 4, 5, 6);
        final boolean hasDuplicates = streetSpecification.hasDuplicates();
        assertThat(hasDuplicates).isFalse();
    }

    @Test
    public void testHasDuplicatesIsFalseWhenThereAreNoDuplicatesAnotherCase() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 4, 5, 6);
        final boolean hasDuplicates = streetSpecification.hasDuplicates();
        assertThat(hasDuplicates).isFalse();
    }

    @Test
    public void testEndingHouseNumber() throws Exception {
        final StreetSpecification streetSpecification = getStreetSpecificationService(1, 2, 3, 4, 5, 6);
        assertThat(streetSpecification.endingHouseNumber()).isEqualTo(6);
    }

    private StreetSpecification getStreetSpecificationService(Integer... integers) {
        return new StreetSpecification(new Street(Arrays.asList(integers)));
    }

}
