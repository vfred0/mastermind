package org.example.mastermind.models;

import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

import java.util.List;

public class ProposedCombination extends Combination {

    public ProposedCombination(List<Color> colors) {
        setColors(colors);
    }

    public ProposedCombination() {
    }

    public Error getError(List<Color> colors) {
        if (colors.size() < width || colors.size() > width) {
            return Error.LENGTH;
        }
        if (haveColorsRepeat(colors)) {
            if (colors.contains(Color.EMPTY)) {
                return Error.COLOR;
            }
            return Error.REPEATED;
        }
        return Error.NULL;
    }

    public boolean equalsColor(SecretCombination secret, int i) {
        return getColor(this, i).equals(getColor(secret, i));
    }

    public int size() {
        return getColors().size();
    }

    public String getInitials() {
        return Color.getAllInitials(getColors());
    }
}
