package org.example.mastermind.models;

import org.example.mastermind.types.PlayStateValue;

public class State {
    private PlayStateValue playStateValue;

    public State() {
        reset();
    }

    public void next() {
        playStateValue = PlayStateValue.values()[playStateValue.ordinal() + 1];
    }

    public PlayStateValue getValueState() {
        return playStateValue;
    }

    public void reset() {
        playStateValue = PlayStateValue.IN_GAME;
    }

    public boolean isFinish() {
        return playStateValue == PlayStateValue.FINISH;
    }
}