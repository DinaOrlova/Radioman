package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldChooseNumberOfRadioStation() {
        Radio radio = new Radio(0, 16);

        radio.chooseNumberOfRadioStation();

        assertEquals(16, radio.getLastRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForChooseCurrentRadioStation.csv")
    void shouldChooseCurrentRadioStation(String test, int currentRadioStation, int firstRadioStation, int lastRadioStation, int expected) {
        Radio radio = new Radio(firstRadioStation, lastRadioStation);

        radio.setCurrentRadioStation(currentRadioStation);
        radio.chooseCurrentRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForSwitchToNextRadioStation.csv")
    void shouldSwitchToNextRadioStation(String test, int currentRadioStation, int firstRadioStation, int lastRadioStation, int expected) {
        Radio radio = new Radio(currentRadioStation, firstRadioStation, lastRadioStation);

        radio.switchToNextRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForSwitchToPrevRadioStation.csv")
    void shouldSwitchToPrevRadioStation(String test, int currentRadioStation, int firstRadioStation, int lastRadioStation, int expected) {
        Radio radio = new Radio(currentRadioStation, firstRadioStation, lastRadioStation);

        radio.switchToPrevRadioStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForIncreaseCurrentVolume.csv")
    void shouldIncreaseCurrentVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio(currentVolume);

        radio.increaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource (resources = "/dataForDecreaseCurrentVolume.csv")
    void shouldDecreaseCurrentVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio(currentVolume);

        radio.decreaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}