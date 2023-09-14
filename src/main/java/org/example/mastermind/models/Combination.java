package org.example.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import org.example.mastermind.types.Color;

public class Combination {
    protected static final int width = 5;
    private List<Color> colors;

    public Combination() {
        colors = new ArrayList<>();
    }

    protected List<Color> getColors() {
        return colors;
    }

    protected void setColors(List<Color> colors) {
        this.colors = colors;
    }

    protected static boolean haveColorsRepeat(List<Color> colors) {
        for (int i = 0; i < colors.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                if (i != j && colors.get(i).equals(colors.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    protected Color getColor(Combination combination, int i) {
        return combination.colors.get(i);
    }
}
