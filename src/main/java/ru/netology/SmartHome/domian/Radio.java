package ru.netology.SmartHome.domian;

public
class Radio {
    private int radioStation;
    private int soundVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

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

    public int getSoundVolume (){
            return soundVolume;
    }

    public void setSoundVolume ( int soundVolume){
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

    public int getMaxRadioStation () {
        return maxRadioStation;
    }

    public void setMaxRadioStation ( int maxRadioStation){
            this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation () {
            return minRadioStation;
    }

    public void setMinRadioStation ( int minRadioStation){
            this.minRadioStation = minRadioStation;
    }

    public int getMaxVolume () {
            return maxVolume;
    }

    public void setMaxVolume ( int maxVolume){
            this.maxVolume = maxVolume;
    }

    public int getMinVolume () {
            return minVolume;
    }

    public void setMinVolume ( int minVolume){
            this.minVolume = minVolume;
    }

    public void increaseRadioStation () {
        if (radioStation == maxRadioStation) {
                radioStation = minRadioStation;
                return;
        }
        radioStation++;
    }

    public void decreaseRadioStation () {
        if (radioStation == minRadioStation) {
            radioStation = maxRadioStation;
            return;
        }
        radioStation--;
    }

    public void increaseSoundVolume () {
        if (soundVolume < maxVolume) {
                soundVolume++;
        }
    }

    public void decreaseSoundVolume () {
        if (soundVolume > minVolume) {
                soundVolume--;
        }
    }

}