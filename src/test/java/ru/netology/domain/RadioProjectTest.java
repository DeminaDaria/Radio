package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioProjectTest {

    @Test
    public void shouldClickNextRadioStation() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentStation(3);
        radioProject.setOn(true);

        radioProject.increaseStation();

        assertEquals(4, radioProject.getCurrentStation());
    }

    @Test
    public void shouldClickNextRadioStationMax() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentStation(9);
        radioProject.setOn(true);

        radioProject.increaseStation();

        assertEquals(0, radioProject.getCurrentStation());
    }

    @Test
    public void shouldClickPrevRadioStation() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentStation(3);
        radioProject.setOn(true);

        radioProject.decreaseStation();

        assertEquals(2, radioProject.getCurrentStation());
    }

    @Test
    public void shouldClickPrevRadioStationMin() {
        RadioProject radioProject = new RadioProject();

        radioProject.setOn(true);

        radioProject.decreaseStation();

        assertEquals(9, radioProject.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentVolume(6);
        radioProject.setOn(true);

        radioProject.increaseVolume();

        assertEquals(7, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeMax() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentVolume(10);
        radioProject.setOn(true);

        radioProject.increaseVolume();

        assertEquals(10, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentVolume(4);
        radioProject.setOn(true);

        radioProject.decreaseVolume();

        assertEquals(3, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {
        RadioProject radioProject = new RadioProject();

        radioProject.setOn(true);

        radioProject.decreaseVolume();

        assertEquals(0, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldSetNumberStationRemoteControlValid() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentStation(7);
        radioProject.setOn(true);

        assertEquals(7, radioProject.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationRemoteControlInvalid() {
        RadioProject radioProject = new RadioProject();

        radioProject.setCurrentStation(10);
        radioProject.setOn(true);

        assertEquals(9, radioProject.getCurrentStation());

    }


}