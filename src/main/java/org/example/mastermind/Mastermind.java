package org.example.mastermind;

import org.example.mastermind.controllers.Logic;
import org.example.mastermind.views.View;

public abstract class Mastermind {
    private final Logic logic;
    private final View view;

    public Mastermind() {
        view = createView();
        logic = new Logic();
    }

    protected abstract View createView();

    protected void play() {
        do {
            view.interact(logic.getController());
        } while (!logic.isFinish());
    }
}