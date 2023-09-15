package org.example.mastermind.models;

import java.util.List;

import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

public class Game {
    private SecretCombination secret;
    private ProposedCombination[] proposed;
    private int attempts;
    private final int maxAttempts = 5;

    public void init() {
        secret = new SecretCombination();
        secret.generate();
        proposed = new ProposedCombination[maxAttempts];
        for (int i = 0; i < maxAttempts; i++) {
            proposed[i] = new ProposedCombination();
        }
    }

    public void reset() {
        if (isWinner()) {
            secret.generate();
        }
        attempts = 0;
    }

    public int getAttempts() {
        return attempts;
    }

    public ProposedCombination getProposedCombination(int position) {
        return proposed[position];
    }

    public void add(List<Color> colors) {
        proposed[attempts].setColors(colors);
    }

    public Result getResult(int attempt) {
        return secret.getResult(proposed[attempt]);
    }

    public void incrementAttempts() {
        attempts++;
    }

    public boolean finished() {
        return attempts == maxAttempts || isWinner();
    }

    public boolean isWinner() {
        return secret.equals(proposed[attempts - 1]);
    }

    public Error getError(List<Color> colors) {
        return proposed[attempts].getError(colors);
    }

    public void setWidthCombination(int width) {
        // secret.setWidth(width);
    }

}
