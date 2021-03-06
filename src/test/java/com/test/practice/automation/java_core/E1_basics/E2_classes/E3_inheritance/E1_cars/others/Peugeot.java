package com.test.practice.automation.java_core.E1_basics.E2_classes.E3_inheritance.E1_cars.others;

import com.test.practice.automation.java_core.E1_basics.E2_classes.E3_inheritance.E1_cars._Car;

/**
 * Created by TPD_Auto on 16/12/2016.
 *
 * Peugeot is-A Car
 * Not all cars are Peugeot
 */
public class Peugeot extends _Car {

    private String specialPeugeotProperty;

    public static void main(String[] args){
        /**
         * @Todo Aim: Try and understand the different access modifiers
         * 1. Print out the variables defined in the Car class
         * 2. Try to print all the properties and take down notes on which ones are visible and why (Its to do with Access Modifiers)
         * 3. Try to view the property called numberOfDoors defined in _Car class
         *  - _Car is also known as parent class
         * 4. Try to view the property called colour
         *  - colour is not visible because Peugeot class is in another package
         *
         *  PRINTOUT WHAT YOU HAVE LEARNT
         */
        System.out.println("\n---------------New Exercise---------------\n");
        Peugeot peugeot = new Peugeot();


        /**
         * @Todo Aim: Try and understand that Peugeot is also a car
         * 1. So we can assign the Peugeot object to a car class
         * 2. Try using peugeotIsACar object to access the specialPeugeotProperty
         */
        System.out.println("\n---------------New Exercise---------------\n");
        _Car peugeotIsACar = new Peugeot();

    }
}
