package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;
import org.example.mastermind.types.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private final State state;

    private final Map<StateValue, Controller> controllers;

    public Logic() {
        this.state = new State();
        Game game = new Game();
        controllers = new HashMap<>();
        controllers.put(StateValue.INITIAL, new StartController(state, game));
        controllers.put(StateValue.IN_SETTINGS, new SettingsController(state, game));
        controllers.put(StateValue.IN_GAME, new PlayController(state, game));
        controllers.put(StateValue.RESUME, new ResumeController(state, game));
        controllers.put(StateValue.FINISH, null);
    }

    public boolean isFinish() {
        return state.isFinish();
    }

    public Controller getController() {
        return controllers.get(state.getValueState());
    }
}
