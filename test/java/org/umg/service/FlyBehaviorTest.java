package org.umg.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlyBehaviorTest {

    @Test
    public void testFlyWithWingsImplementsFlyBehavior() {
        FlyBehavior flyBehavior = new FlyWithWings();

        assertTrue(flyBehavior instanceof FlyWithWings);
    }

    @Test
    public void testFlyNoWayImplementsFlyBehavior() {
        FlyBehavior flyBehavior = new FlyNoWay();

        assertTrue(flyBehavior instanceof FlyNoWay);
    }
}
