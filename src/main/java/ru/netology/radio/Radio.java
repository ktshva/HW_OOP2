package ru.netology.radio;

public class Radio {
    private int minChannel = 0;
    private int maxChannel = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int numChannels = 10;
    private int currentVolume;
    private int currentChannel;

    public Radio(int size) {
        this.numChannels = minChannel + size;
    }

    public Radio() {

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumChannels() {
        return numChannels;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minChannel) {
            currentChannel = minChannel;
            return;
        }
        if (newCurrentChannel > maxChannel) {
            currentChannel = maxChannel;
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentChannel == maxChannel) {
            setCurrentChannel(minChannel);
        } else {
            setCurrentChannel(currentChannel + 1);
        }
    }

    public void prev() {
        if (currentChannel == minChannel) {
            setCurrentChannel(maxChannel);
        } else {
            setCurrentChannel(currentChannel - 1);
        }
    }
}