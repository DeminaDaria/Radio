package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioProjectTest {
    RadioProject radioProject = new RadioProject(14, true);

    @Test
    public void shouldClickNextRadioStation() {

        radioProject.setCurrentStation(3);

        radioProject.increaseStationNext();

        assertEquals(4, radioProject.getCurrentStation());
    }

    @Test
    public void shouldClickNextRadioStationMax() {

        radioProject.setCurrentStation(14);

        radioProject.increaseStationNext();

        assertEquals(0, radioProject.getCurrentStation());
    }

    @Test
    public void shouldClickPrevRadioStation() {

        radioProject.setCurrentStation(3);

        radioProject.decreaseStationPrev();

        assertEquals(2, radioProject.getCurrentStation());
    }

    @Test
    public void shouldClickPrevRadioStationMin() {

        radioProject.decreaseStationPrev();

        assertEquals(14, radioProject.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationRemoteControlValid() {

        radioProject.setCurrentStation(7);

        assertEquals(7, radioProject.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationRemoteControlInvalidMax() {

        radioProject.setCurrentStation(15);

        assertEquals(14, radioProject.getCurrentStation());

    }

    @Test
    public void shouldSetNumberStationRemoteControlInvalidMin() {

        radioProject.setCurrentStation(-1);

        assertEquals(0, radioProject.getCurrentStation());

    }

    @Test
    public void shouldInitFieldsVolume() {
        assertEquals(100, radioProject.getMaxVolume());
        assertEquals(0, radioProject.getMinVolume());
        assertEquals(0, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {

        radioProject.setCurrentVolume(50);

        radioProject.increaseVolume();

        assertEquals(51, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeMax() {

        radioProject.setCurrentVolume(100);

        radioProject.increaseVolume();

        assertEquals(100, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {

        radioProject.setCurrentVolume(50);

        radioProject.decreaseVolume();

        assertEquals(49, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeMin() {

        radioProject.setCurrentVolume(0);

        radioProject.decreaseVolume();

        assertEquals(0, radioProject.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeInvalidMax() {

        radioProject.setCurrentVolume(101);

        assertEquals(100, radioProject.getCurrentVolume());

    }

    @Test
    public void shouldSetVolumeInvalidMin() {

        radioProject.setCurrentVolume(-1);

        assertEquals(0, radioProject.getCurrentVolume());

    }
}