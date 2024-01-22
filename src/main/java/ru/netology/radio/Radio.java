package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentChannel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            currentChannel = 0;
            return;
        }
        if (newCurrentChannel > 9) {
            currentChannel = 9;
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentChannel == 9) {
            setCurrentChannel(0);
        } else {
            setCurrentChannel(currentChannel + 1);
        }
    }

    public void prev() {
        if (currentChannel == 0) {
            setCurrentChannel(9);
        } else {
            setCurrentChannel(currentChannel - 1);
        }
    }
}