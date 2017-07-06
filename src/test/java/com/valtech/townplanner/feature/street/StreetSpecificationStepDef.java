package com.valtech.townplanner.feature.street;


import com.valtech.townplanner.models.Street;
import com.valtech.townplanner.services.StreetSpecification;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreetSpecificationStepDef implements En {
    private boolean valid;
    private long count;
    private StreetSpecification streetSpecification;

    @Given("the following feature.street definition: (.*)")
    public void given_the_following_street_definition(List<Integer> houseNumbers) {
        Street street = new Street(houseNumbers);
        this.streetSpecification = new StreetSpecification(street);
    }

    @When("checking for validity")
    public void when_checking_for_validity() {
        valid = streetSpecification.isValid();
    }

    @Then("it must be invalid")
    public void then_it_must_be_invalid() {
        assertThat(valid).isFalse();
    }

    @Then("it must be valid")
    public void then_it_must_be_valid() {
        assertThat(valid).isTrue();
    }

    @When("^Counting$")
    public void when_counting() {
        count = streetSpecification.numberOfHouses();
    }

    @Then("^count must be (\\d+)$")
    public void countMustBe(int count) throws Throwable {
        assertThat(this.count).isEqualTo(count);
    }

    @And("it must start from 1")
    public void and_it_must_start_from_1() {
        assertThat(streetSpecification.startingHouseNumber()).isEqualTo(1);
    }

    @When("^counting left hand side$")
    public void countingLeftHandSide() throws Throwable {
        count = streetSpecification.numberOfHousesInLeftHandSide();
    }

    @When("^counting right hand side$")
    public void countingRightHandSide() throws Throwable {
        count = streetSpecification.numberOfHousesInRightHandSide();
    }
}
