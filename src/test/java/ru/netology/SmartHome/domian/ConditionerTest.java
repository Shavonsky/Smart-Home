package ru.netology.SmartHome.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(13);
        conditioner.setCurrentTemperature(22);
        conditioner.setOn(true);
        conditioner.increaseCurrentTemperature();
        int expected = 23;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature2() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(13);
        conditioner.setCurrentTemperature(22);
        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        int expected = 21;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(38);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(22);
        conditioner.setOn(false);
        conditioner.increaseCurrentTemperature();
        int expected = 23;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature3() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(38);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(22);
        conditioner.setOn(false);
        conditioner.decreaseCurrentTemperature();
        int expected = 21;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void increaseCurrentTemperature4() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(0);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.increaseCurrentTemperature();
        int expected = 0;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature4() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(0);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        int expected = 0;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}