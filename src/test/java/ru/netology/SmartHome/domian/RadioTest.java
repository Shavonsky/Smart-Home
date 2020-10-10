package ru.netology.SmartHome.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void increaseRadioStation() {
        radio.setRadioStation(6);
        radio.increaseRadioStation();
        int expected = 7;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStation() {
        radio.setRadioStation(3);
        radio.decreaseRadioStation();
        int expected = 2;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void radioStation() {
        radio.setRadioStation(7);
        int expected = 7;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void increaseRadioStationIfMax() {
        radio.setRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void increaseRadioStationIfOverMax() {
        radio.setRadioStation(10);
        radio.increaseRadioStation();
        int expected = 0;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStationIfMin() {
        radio.setRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStationIfBelowMin() {
        radio.setRadioStation(-1);
        radio.decreaseRadioStation();
        int expected = 9;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStationIfBelowMin2() {
        radio.setRadioStation(-10);
        radio.decreaseRadioStation();
        int expected = 9;

        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void increaseSoundVolume() {
        radio.setSoundVolume(8);
        radio.increaseSoundVolume();
        int expected = 9;

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void increaseSoundVolumeIfMax() {
        radio.setSoundVolume(10);
        radio.increaseSoundVolume();
        int expected = 10;

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void increaseSoundVolumeIfUnderMax() {
        radio.setSoundVolume(100);
        radio.increaseSoundVolume();
        int expected = 10;

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolume() {
        radio.setSoundVolume(9);
        radio.decreaseSoundVolume();
        int expected = 8;

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolumeIfMin() {
        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolumeIfOverMin() {
        radio.setSoundVolume(-100);
        radio.decreaseSoundVolume();
        int expected = 0;

        assertEquals(expected, radio.getSoundVolume());
    }
    @Test
    void increaseSoundVolumeIfMax2() {
        radio.setSoundVolume(11);
        radio.increaseSoundVolume();
        int expected = 10;

        assertEquals(expected, radio.getSoundVolume());
    }
}