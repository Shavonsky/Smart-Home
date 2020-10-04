package ru.netology.SmartHome.domian;

public class Radio {
    private int radioStation;
    private int soundVolume;
    int[] numberStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] volume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation > numberStation[9]) {
            this.radioStation = numberStation[9];
            return;
        }
        if (radioStation < numberStation[0]) {
            this.radioStation = numberStation[0];
            return;
        }
        this.radioStation = radioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > volume[10]) {
            this.soundVolume = volume[10];
            return;
        }
        if (soundVolume < volume[0]) {
            this.soundVolume = volume[0];
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int[] getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int[] numberStation) {
        if (numberStation > radioStation) {
            return;
        }
        if (numberStation < radioStation) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int[] getVolume() {
        return volume;
    }

    public void setVolume(int[] volume) {
        this.volume = volume;
            return;

    }

    public void numberRadioStation() {
        if (numberStation[9] <= radioStation) {
            radioStation = numberStation[0];
            return;
        }
        if (numberStation[0] >= radioStation) {
            radioStation = numberStation[9];
            return;
        }
    }

    public void shouldSoundVolume() {
        if (soundVolume == volume[10]) {
            soundVolume = volume[10];
            return;
        }
        if (soundVolume == volume[0]) {
            soundVolume = volume[0];
            return;
        }
    }
}
