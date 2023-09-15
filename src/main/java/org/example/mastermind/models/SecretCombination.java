package org.example.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import org.example.mastermind.types.Color;

public class SecretCombination extends Combination {

    public void generate() {
        List<Color> combination;
        do {
            combination = new ArrayList<>();
            for (int i = 0; i < SIZE; i++) {
                combination.add(Color.getRandom());
            }
        } while (hasRepeatedColors(combination));
        setColors(combination);
    }

    public boolean equals(ProposedCombination proposed) {
        return this.getColors().equals(proposed.getColors());
    }

    public Result getResult(ProposedCombination proposed) {
        return new Result(proposed, this);
    }

    public boolean containsColor(ProposedCombination proposed, int position) {
        return getColors().contains(getColor(proposed, position));
    }
}