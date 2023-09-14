package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;

public abstract class Controller {
    protected State state;
    protected Game game;

    public Controller(State state, Game game) {
        this.state = state;
        this.game = game;
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

    public void next() {
        this.state.next();
    }

}
