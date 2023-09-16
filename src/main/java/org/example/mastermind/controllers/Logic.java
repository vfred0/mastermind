package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;

public class Logic {
    private final State state;
    private final StartController startController;
    private final PlayController playController;
    private final ResumeController resumeController;
    private final SettingsController settingsController;

    public Logic() {
        this.state = new State();
        Game game = new Game();
        this.startController = new StartController(state, game);
        this.playController = new PlayController(state, game);
        this.resumeController = new ResumeController(state, game);
        this.settingsController = new SettingsController(state, game);
    }

    public Controller getController() {
        switch (state.getValueState()) {
            case INITIAL:
                return startController;
            case IN_SETTINGS:
                return settingsController;
            case IN_GAME:
                return playController;
            case RESUME:
                return resumeController;
            default:
                return null;
        }
    }
}
