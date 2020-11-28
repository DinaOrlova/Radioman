package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForChooseCurrentRadioStation.csv")

    void shouldChooseCurrentRadioStation(String test, int firstRadioStation, int lastRadioStation, int currentRadioStation, int expected) {

        Radio radio = new Radio();

        radio.setFirstRadioStation(firstRadioStation);
        radio.setLastRadioStation(lastRadioStation);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.chooseCurrentRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForSwitchToNextRadioStation.csv")

    void shouldSwitchToNextRadioStation(String test, int firstRadioStation, int lastRadioStation, int currentRadioStation, int expected) {

        Radio radio = new Radio();

        radio.setFirstRadioStation(firstRadioStation);
        radio.setLastRadioStation(lastRadioStation);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.switchToNextRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForSwitchToPrevRadioStation.csv")

    void shouldSwitchToPrevRadioStation(String test, int firstRadioStation, int lastRadioStation, int currentRadioStation, int expected) {

        Radio radio = new Radio();

        radio.setFirstRadioStation(firstRadioStation);
        radio.setLastRadioStation(lastRadioStation);
        radio.setCurrentRadioStation(currentRadioStation);
        radio.switchToPrevRadioStation(currentRadioStation);

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForIncreaseCurrentVolume.csv")

    void shouldIncreaseCurrentVolume(String test, int maxVolume, int currentVolume, int expected) {

        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        radio.setMaxVolume(maxVolume);
        radio.increaseCurrentVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForDecreaseCurrentVolume.csv")
    void shouldDecreaseCurrentVolume(String test, int minVolume, int currentVolume, int expected) {

        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        radio.setMinVolume(minVolume);
        radio.decreaseCurrentVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume());
    }
}