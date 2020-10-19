package ru.netology.SmartHome.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private final int maxRadioStation = 10;
    private final int minRadioStation = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int radioStation = 10;
    private int soundVolume;

    public Radio(int radioStation) {
        setRadioStation(radioStation);
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
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

    public void increaseRadioStation() {
        if (radioStation == maxRadioStation) {
            radioStation = minRadioStation;
            return;
        }
        radioStation++;
    }

    public void decreaseRadioStation() {
        if (radioStation == minRadioStation) {
            radioStation = maxRadioStation;
            return;
        }
        radioStation--;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
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

    public void increaseSoundVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;

        }
    }
}