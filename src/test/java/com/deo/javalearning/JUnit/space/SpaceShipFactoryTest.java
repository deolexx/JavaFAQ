package com.deo.javalearning.JUnit.space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipFactoryTest {

    @Test
    void createOne() {
        SpaceShipFactory spaceShipFactory = new SpaceShipFactory();
        SpaceShip one =  spaceShipFactory.createOne();
        assertNotNull(one);
        assertNotNull(one.getCaptain());
        assertNotNull(one.getModel());
        assertNotNull(one.getFuelPercentage());         //not null value in fields
        assertEquals("Mike",one.getCaptain());      //strict value
        assertEquals("Round",one.getModel());
        assertTrue(one.getFuelPercentage()>5.0d);  //flex value
    }
}