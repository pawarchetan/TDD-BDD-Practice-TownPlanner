package com.valtech.townplanner.feature.newspaper;


import com.valtech.townplanner.models.Street;
import com.valtech.townplanner.services.FirstApproach;
import com.valtech.townplanner.services.NewsPaperDeliveryScheme;
import com.valtech.townplanner.services.SecondApproach;
import com.valtech.townplanner.services.StreetSpecification;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NewspaperDeliveryStepsDef implements En {
    private StreetSpecification streetSpecification;
    private NewsPaperDeliveryScheme deliveryScheme;

    @Given("the following feature.street definition: (.*)")
    public void given_the_following_street_definition(List<Integer> houseNumbers) {
        final Street street = new Street(houseNumbers);
        this.streetSpecification = new StreetSpecification(street);
    }

    @And("^FirstApproach for delivering newpapers$")
    public void and_first_approach_for_delivering_newspapers() throws Throwable {
        this.deliveryScheme = new FirstApproach(streetSpecification);
    }

    @And("^SecondApproach for delivering newpapers$")
    public void and_second_approach_for_delivering_newspapers() throws Throwable {
        this.deliveryScheme = new SecondApproach(streetSpecification);
    }

    @Then("^delivery will be done in the following order: (.*)$")
    public void then_delivery_will_be_done_in_the_following_order(List<Integer> houseNumbers) throws Throwable {
        final List<Integer> deliveryOrder = deliveryScheme.deliveryOrder();
        assertThat(deliveryOrder).isEqualTo(houseNumbers);
    }

    @And("^will cross the road one time$")
    public void and_they_cross_the_road_one_time() throws Throwable {
        assertThat(deliveryScheme.numberOfCrossings()).isEqualTo(1);
    }

    @And("^will cross the road (\\d+) times$")
    public void and_they_cross_the_road_n_times(int n) throws Throwable {
        assertThat(deliveryScheme.numberOfCrossings()).isEqualTo(n);
    }
}
