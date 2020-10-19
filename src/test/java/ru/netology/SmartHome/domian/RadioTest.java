package ru.netology.SmartHome.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio radio = new Radio(0);

    @Test
    void radioStation() {
        Radio radio = new Radio(10);
        radio.setRadioStation(7);

        assertEquals(7, radio.getRadioStation());
    }

    @Test
    void radioStation2() {
        Radio radio = new Radio(10);
        radio.setRadioStation(11);

        assertEquals(10, radio.getRadioStation());
    }

    @Test
    void radioStation3() {
        Radio radio = new Radio(10);
        radio.setRadioStation(0);

        assertEquals(0, radio.getRadioStation());
    }

    @Test
    void increaseRadioStation() {
        radio.setRadioStation(6);
        radio.increaseRadioStation();

        assertEquals(7, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStation() {
        radio.setRadioStation(3);
        radio.decreaseRadioStation();

        assertEquals(2, radio.getRadioStation());
    }

    @Test
    void increaseRadioStationIfMax() {
        Radio radio = new Radio(10);
        radio.setRadioStation(11);
        radio.increaseRadioStation();

        assertEquals(0, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStationIfMin() {
        Radio radio = new Radio(10);
        radio.setRadioStation(0);
        radio.decreaseRadioStation();

        assertEquals(10, radio.getRadioStation());
    }

    @Test
    void decreaseRadioStationIfBelowMin() {
        radio.setRadioStation(-1);
        radio.decreaseRadioStation();

        assertEquals(10, radio.getRadioStation());
    }


    @Test
    void increaseSoundVolume() {
        Radio radio = new Radio(100);
        radio.setSoundVolume(8);
        radio.increaseSoundVolume();

        assertEquals(9, radio.getSoundVolume());
    }

    @Test
    void increaseSoundVolumeIfMax() {
        radio.setSoundVolume(100);
        radio.increaseSoundVolume();

        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void increaseSoundVolumeIfUnderMax() {
        radio.setSoundVolume(101);
        radio.increaseSoundVolume();

        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolume() {
        radio.setSoundVolume(9);
        radio.decreaseSoundVolume();

        assertEquals(8, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolumeIfMin() {
        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();

        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolumeIfOverMin() {
        radio.setSoundVolume(-100);
        radio.decreaseSoundVolume();

        assertEquals(0, radio.getSoundVolume());
    }

}