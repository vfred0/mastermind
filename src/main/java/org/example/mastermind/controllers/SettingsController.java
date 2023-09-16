package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;

public class SettingsController extends Controller {

    public SettingsController(State state, Game game) {
        super(state, game);
        game.init();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void setSizeCombination(int size) {
        game.setSizeCombination(size);
    }

    public void setAttempts(int attempts) {
        game.setAttempts(attempts);
    }
}