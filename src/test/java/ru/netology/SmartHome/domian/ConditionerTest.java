package ru.netology.SmartHome.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    Conditioner conditioner;

    {
        conditioner = new Conditioner();
    }

    @Test
    void increaseCurrentTemperature() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature2() {
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
        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(13);
        conditioner.setCurrentTemperature(25);
        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        int expected = 24;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature3() {
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
        conditioner.setMaxTemperature(38);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(false);
        conditioner.decreaseCurrentTemperature();
        int expected = 19;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void increaseCurrentTemperature4() {
        conditioner.setMaxTemperature(0);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.increaseCurrentTemperature();
        int expected = 0;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature4() {
        conditioner.setMaxTemperature(0);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        int expected = 0;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature5() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int expected = 30;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature5() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperature6() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(31);
        conditioner.increaseCurrentTemperature();
        int expected = 30;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature6() {
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(20);
        conditioner.setCurrentTemperature(19);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}