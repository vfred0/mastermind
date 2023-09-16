package org.example.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import org.example.mastermind.types.Color;

public class Combination {
    protected static int size;
    private List<Color> colors;

    public Combination() {
        colors = new ArrayList<>();
        setSize(5);
    }

    protected List<Color> getColors() {
        return colors;
    }

    protected void setColors(List<Color> colors) {
        this.colors = colors;
    }

    protected static boolean hasRepeatedColors(List<Color> colors) {
        for (int i = 0; i < colors.size(); i++) {
            for (int j = i + 1; j < colors.size(); j++) {
                if (Color.equalsFromPositions(i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected Color getColor(Combination combination, int position) {
        return combination.colors.get(position);
    }

    public void setSize(int size) {
        Combination.size = size;
    }
}