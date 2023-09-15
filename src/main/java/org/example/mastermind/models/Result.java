package org.example.mastermind.models;

public class Result {
    private int whites;
    private int blacks;

    public Result(ProposedCombination proposed, SecretCombination secret) {
        for (int i = 0; i < proposed.size(); i++) {
            if (proposed.equalsColor(secret, i)) {
                blacks++;
            }
            if (secret.containsColor(proposed, i)) {
                whites++;
            }
        }
    }

    public int getWhites() {
        return whites - blacks;
    }

    public int getBlacks() {
        return blacks;
    }
}