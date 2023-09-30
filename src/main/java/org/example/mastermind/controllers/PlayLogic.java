package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;
import org.example.mastermind.types.PlayStateValue;

import java.util.HashMap;
import java.util.Map;

public class PlayLogic {
    private final State state;

    private final Map<PlayStateValue, Controller> controllers;

    public PlayLogic() {
        this.state = new State();
        Game game = new Game();
        controllers = new HashMap<>();
        controllers.put(PlayStateValue.IN_GAME, new PlayController(state, game));
        controllers.put(PlayStateValue.RESUME, new ResumeController(state, game));
        controllers.put(PlayStateValue.FINISH, new NullController(state, game));
    }

    public boolean isFinish() {
        return state.isFinish();
    }

    public Controller getController() {
        return controllers.get(state.getValueState());
    }
}
