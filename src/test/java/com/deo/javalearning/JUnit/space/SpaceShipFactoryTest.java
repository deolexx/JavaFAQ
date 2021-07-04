package com.deo.javalearning.JUnit.space;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipFactoryTest {


    @Test
    @DisplayName("Test the method that determines how much fuel the spaceship is created with")
    void tryFuelFormula() {
        SpaceShipFactory spaceShipFactory = new SpaceShipFactory(100.0d);
        assertEquals(50.0d, spaceShipFactory.fuelQty());
        spaceShipFactory = new SpaceShipFactory(300.0d);
        assertEquals(100.0d, spaceShipFactory.fuelQty());

    }


    @Test
    @DisplayName("Try to create a new spaceship with the factory")
    void createOne() {
        SpaceShipFactory spaceShipFactory = new SpaceShipFactory(100.0d);
        SpaceShip one = spaceShipFactory.createOne();
        assertNotNull(one);
        assertNotNull(one.getCaptain());
        assertNotNull(one.getModel());
        assertNotNull(one.getFuelPercentage());         //not null value in fields
        assertEquals("Mike", one.getCaptain());      //strict value
        assertEquals("Round", one.getModel());
        assertTrue(one.getFuelPercentage() > 5.0d);  //flex value
    }
}