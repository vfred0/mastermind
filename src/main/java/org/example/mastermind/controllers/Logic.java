package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;

public class Logic {
    private State state;
    private Game game;
    private StartController startController;
    private PlayController playController;
    private ResumeController resumeController;
    private ElectionWidthCombinationController election;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.startController = new StartController(state, game);
        this.playController = new PlayController(state, game);
        this.resumeController = new ResumeController(state, game);
        this.election = new ElectionWidthCombinationController(state, game);
    }

    public Controller geController() {
        switch (state.getValueState()) {
            case INITIAL:
                return startController;
            case ELECTION:
                return election;
            case IN_GAME:
                return playController;
            case RESUME:
                return resumeController;
            default:
                return null;
        }
    }
}
