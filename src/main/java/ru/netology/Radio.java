package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation;
    private int lastRadioStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public void setFirstRadioStation(int firstRadioStation) {
        this.firstRadioStation = firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public void setLastRadioStation(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void chooseCurrentRadioStation() {
        this.currentRadioStation = getCurrentRadioStation();
    }

    public void switchToNextRadioStation() {
        if (currentRadioStation < lastRadioStation) {
            this.currentRadioStation = getCurrentRadioStation() + 1;
            return;
        }
        if (currentRadioStation == lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
            return;
        }
        this.currentRadioStation = getCurrentRadioStation();
    }

    public void switchToPrevRadioStation() {
        if (currentRadioStation > firstRadioStation) {
            this.currentRadioStation = getCurrentRadioStation() - 1;
            return;
        }
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
            return;
        }
        this.currentRadioStation = getCurrentRadioStation();
    }

    public void increaseCurrentVolume() {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            this.currentVolume = getCurrentVolume() + 1;
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
            this.currentVolume = getCurrentVolume() - 1;
            return;
        }
        this.currentVolume = getCurrentVolume();
    }
}
