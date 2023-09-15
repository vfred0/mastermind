package org.example.mastermind.models;

import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

import java.util.List;

public class ProposedCombination extends Combination {

    public Error getError(List<Color> colors) {
        if (!containsSizeValid(colors)) {
            return Error.LENGTH;
        }
        if (hasRepeatedColors(colors)) {
            if (colors.contains(Color.EMPTY)) {
                return Error.COLOR;
            }
            return Error.REPEATED;
        }
        return Error.NULL;
    }

    private boolean containsSizeValid(List<Color> colors) {
        int size = colors.size();
        int minSize = 0;
        return size > minSize && size <= SIZE;
    }

    public boolean equalsColor(SecretCombination secret, int position) {
        return getColor(this, position).equals(getColor(secret, position));
    }

    public int size() {
        return getColors().size();
    }

    public String getInitials() {
        return Color.getAllInitials(getColors());
    }
}
