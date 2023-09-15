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

    public void incrementAttempts() {
        game.incrementAttempts();
    }

    public boolean finished() {
        return game.finished();
    }

    public boolean isWinner() {
        return game.isWinner();
    }

    public Error getError(List<Color> colors) {
        return game.getError(colors);
    }

    public void add(List<Color> colors) {
        game.add(colors);
    }

    public int getAttempts() {
        return game.getAttempts();
    }

    public ProposedCombination getProposedCombination(int attempts) {
        return game.getProposedCombination(attempts);
    }

    public Result getResult(int attempts) {
        return game.getResult(attempts);
    }

}