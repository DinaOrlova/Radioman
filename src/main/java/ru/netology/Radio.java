package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private int currentRadioStation = 0;
    private int firstRadioStation = 0;
    private int lastRadioStation = 9;
    private int currentVolume = 50;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int firstRadioStation, int lastRadioStation) {
        this.firstRadioStation = firstRadioStation;
        this.lastRadioStation = lastRadioStation;
    }

    public Radio(int currentRadioStation, int firstRadioStation, int lastRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.firstRadioStation = firstRadioStation;
        this.lastRadioStation = lastRadioStation;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < firstRadioStation) {
            return;
        }
        if (currentRadioStation > lastRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void chooseNumberOfRadioStation() {
        this.lastRadioStation = getLastRadioStation();
    }

    public void chooseCurrentRadioStation() {
        this.currentRadioStation = getCurrentRadioStation();
    }

    public void switchToNextRadioStation() {
        if (currentRadioStation < lastRadioStation) {
            this.currentRadioStation = currentRadioStation + 1;
            return;
        }
        if (currentRadioStation == lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
            return;
        }
        this.currentRadioStation = firstRadioStation;
    }

    public void switchToPrevRadioStation() {
        if (currentRadioStation > firstRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
            return;
        }
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
            return;
        }
        this.currentRadioStation = lastRadioStation;
    }

    public void increaseCurrentVolume() {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
            return;
        }
        this.currentVolume = getCurrentVolume();
    }

    public void decreaseCurrentVolume() {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
            return;
        }
        this.currentVolume = getCurrentVolume();
    }

}
