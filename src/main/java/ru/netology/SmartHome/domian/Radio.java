package ru.netology.SmartHome.domian;

public class Radio {
    private int radioStation;
    private int soundVolume;
    private int maxRadioStation;
    private int minRadioStation;
    private int maxVolume;
    private int minVolume;

    public void setMaxRadioStation(int maxRadioStation) {
        if (maxRadioStation > radioStation) {
            return;
        }
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        if (maxRadioStation < radioStation) {
            return;
        }
        this.minRadioStation = minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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

    public void numberRadioStation() {
        if (maxRadioStation <= radioStation) {
            radioStation = minRadioStation;
            return;
        }
        if (minRadioStation >= radioStation) {
            radioStation = maxRadioStation;
            return;
        }
    }

    public void shouldSoundVolume() {
        if (soundVolume == maxVolume) {
            soundVolume = maxVolume;
            return;
        }
        if (soundVolume == minVolume) {
            soundVolume = minVolume;
            return;
        }
    }
}
