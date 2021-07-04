package com.deo.javalearning.JUnit.space;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SpaceShipFactory {

    private final double spaceBucks;


    public SpaceShip createOne(){
        return new SpaceShip("Round","Mike",55.0d);
    }


    protected double fuelQty(){
        return Math.min(100.0d, spaceBucks/2.0d);
    }

}
