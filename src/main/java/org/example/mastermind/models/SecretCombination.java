package org.example.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import org.example.mastermind.types.Color;

public class SecretCombination extends Combination {
    private static final String CODE_COLOR = "?";

    public void generate() {
        List<Color> randomColors;
        do {
            randomColors = new ArrayList<>();
            for (int i = 0; i < width; i++) {
                randomColors.add(Color.getRandom());
            }
        } while (haveColorsRepeat(randomColors));
        setColors(randomColors);
    }

    public boolean equals(ProposedCombination proposed) {
        return this.getColors().equals(proposed.getColors());
    }

    public Result getResult(ProposedCombination proposed) {
        return new Result(proposed, this);
    }


    public String getCodeColors() {
        String result = "";
        for (int i = 0; i < width; i++) {
            result += CODE_COLOR;
        }
        return result;
    }

    public boolean containsColor(ProposedCombination proposed, int i) {
        return getColors().contains(getColor(proposed, i));
    }
}