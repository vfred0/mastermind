package org.example.mastermind.models;

import java.util.List;

import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

public class Game {
    private SecretCombination secret;
    private ProposedCombination[] proposed;
    private int attemps;
    private final int MAX_ATTEMPS = 5;

    public void init() {
        secret = new SecretCombination();
        secret.generate();
        proposed = new ProposedCombination[MAX_ATTEMPS];
        for (int i = 0; i < MAX_ATTEMPS; i++) {
            proposed[i] = new ProposedCombination();
        }
    }

    public void reset() {
        if (isWinner()) {
            secret.generate();
        }
        attemps = 0;
    }

    public int getAttemps() {
        return attemps;
    }

    public ProposedCombination getPropesedCombination(int i) {
        return proposed[i];
    }

    public void add(List<Color> colors) {
        proposed[attemps].setColors(colors);
    }

    public Result getResult(int attemps) {
        return secret.getResult(proposed[attemps]);
    }

    public void incrementAttemps() {
        attemps++;
    }

    public boolean finished() {
        return attemps == MAX_ATTEMPS || isWinner();
    }

    public boolean isWinner() {
        return secret.equals(proposed[attemps - 1]);
    }

    public Error getError(List<Color> list) {
        return proposed[attemps].getError(list);
    }

    public void setWidthCombination(int width) {
        // secret.setWidth(width);
    }

}
