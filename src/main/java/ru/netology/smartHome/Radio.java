package ru.netology.smartHome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private String name;
    private int currentRadioStationNumber;
    private int minRadioStationNumber;
    private int maxRadioStationNumber;
    private int currentSoundVolumeLevel;
    private int minSoundVolumeLevel;
    private int maxSoundVolumeLevel;

    public void setNextRadioStationNumber() {
        setCurrentRadioStationNumber((getCurrentRadioStationNumber() != maxRadioStationNumber) ? getCurrentRadioStationNumber() + 1 : minRadioStationNumber);
    }

    public void setPreviousRadioStationNumber() {
        setCurrentRadioStationNumber((getCurrentRadioStationNumber() != minRadioStationNumber) ? getCurrentRadioStationNumber() - 1 : maxRadioStationNumber);
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if ((newRadioStationNumber >= minRadioStationNumber) & (newRadioStationNumber <= maxRadioStationNumber)) {
            setCurrentRadioStationNumber(newRadioStationNumber);
        }
    }

    public int getCurrentSoundVolumeLevel() {
        return currentSoundVolumeLevel;
    }

    public void setCurrentSoundVolumeLevel(int currentSoundVolumeLevel) {
        this.currentSoundVolumeLevel = currentSoundVolumeLevel;
    }

    public void increaseSoundVolumeLevel() {
        if (getCurrentSoundVolumeLevel() != maxSoundVolumeLevel) {
            setCurrentSoundVolumeLevel(getCurrentSoundVolumeLevel() + 1);
        }
    }

    public void decreaseSoundVolumeLevel() {
        if (getCurrentSoundVolumeLevel() != minSoundVolumeLevel) {
            setCurrentSoundVolumeLevel(getCurrentSoundVolumeLevel() - 1);
        }
    }
}
