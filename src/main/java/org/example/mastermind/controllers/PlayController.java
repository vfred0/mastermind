package org.example.mastermind.controllers;

import java.util.List;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.ProposedCombination;
import org.example.mastermind.models.Result;
import org.example.mastermind.models.State;
import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

public class PlayController extends Controller {

    public PlayController(State state, Game game) {
        super(state, game);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void incrementAttemps() {
        game.incrementAttemps();
    }

    public boolean finished() {
        return game.finished();
    }

    public boolean isWinner() {
        return game.isWinner();
    }

    public Error getError(List<Color> list) {
        return game.getError(list);
    }

    public void add(List<Color> colors) {
        game.add(colors);
    }

    public int getAttemps() {
        return game.getAttemps();
    }

    public ProposedCombination getPropesedCombination(int attemps) {
        return game.getPropesedCombination(attemps);
    }

    public Result getResult(int attemps) {
        return game.getResult(attemps);
    }

}