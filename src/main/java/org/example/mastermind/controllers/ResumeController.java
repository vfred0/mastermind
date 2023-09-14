package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;

public class ResumeController extends Controller {

    public ResumeController(State state, Game game) {
        super(state, game);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void reset() {
        this.game.reset();
        state.reset();
    }
}