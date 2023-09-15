package org.example.mastermind.models;

import org.example.mastermind.types.StateValue;

public class State {
    private StateValue stateValue;

    public State() {
        reset();
    }

    public void next() {
        stateValue = StateValue.values()[stateValue.ordinal() + 1];
    }

    public StateValue getValueState() {
        return stateValue;
    }

    public void reset() {
        stateValue = StateValue.INITIAL;
    }
}