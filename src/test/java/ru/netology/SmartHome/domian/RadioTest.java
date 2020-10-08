package ru.netology.SmartHome.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void numberRadioStation() {
        radio.setRadioStation(9);
        radio.numberRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void shouldSoundVolume() {
        radio.setSoundVolume(10);
        radio.shouldSoundVolume();
        int expected = 10;
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void numberRadioStation2() {
        radio.setRadioStation(-7);
        radio.numberRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void shouldSoundVolume2() {
        radio.setSoundVolume(3);
        radio.shouldSoundVolume();
        int expected = 3;
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void numberRadioStation3() {
        radio.setRadioStation(0);
        radio.numberRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void shouldSoundVolume3() {
        radio.setSoundVolume(0);
        radio.shouldSoundVolume();
        int expected = 0;
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void numberRadioStation4() {
        radio.setRadioStation(11);
        radio.numberRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void shouldSoundVolume4() {
        radio.setSoundVolume(15);
        radio.shouldSoundVolume();
        int expected = 10;
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void numberRadioStation5() {
        radio.setRadioStation(1);
        radio.numberRadioStation();
        int expected = 1;
        assertEquals(expected, radio.getRadioStation());
    }

    @Test
    void shouldSoundVolume5() {
        radio.setSoundVolume(0);
        radio.shouldSoundVolume();
        int expected = 0;
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldSoundVolume6() {
        radio.setSoundVolume(-1);
        radio.shouldSoundVolume();
        int expected = 0;
        assertEquals(expected, radio.getSoundVolume());
    }
}