package ru.netology.SmartHome.domian;

public class Radio {
    private int radioStation = 10;
    private int soundVolume;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public
    Radio() {
    }

    public Radio(int radioStation) {
        setRadioStation(radioStation);
    }

    public
    int getRadioStation() {
        return radioStation;
    }

    public
    void setRadioStation(int radioStation) {
        if (radioStation > maxRadioStation) {
            this.radioStation = maxRadioStation;
            return;
        }
        if (radioStation < minRadioStation) {
            this.radioStation = minRadioStation;
            return;
        }
        this.radioStation = radioStation;
    }

    public
    void increaseRadioStation() {
        if (radioStation == maxRadioStation) {
            radioStation = minRadioStation;
            return;
        }
        radioStation++;
    }

    public
    void decreaseRadioStation() {
        if (radioStation == minRadioStation) {
            radioStation = maxRadioStation;
            return;
        }
        radioStation--;
    }

    public
    int getSoundVolume() {
        return soundVolume;
    }

    public
    void setSoundVolume(int soundVolume) {
        if (soundVolume > maxVolume) {
            this.soundVolume = maxVolume;
            return;
        }
        if (soundVolume < minVolume) {
            this.soundVolume = minVolume;
            return;
        }
        this.soundVolume = soundVolume;
    }

    public
    void increaseSoundVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public
    void decreaseSoundVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;

        }
    }
}