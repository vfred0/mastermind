package org.example.mastermind.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Color {
    RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, EMPTY;

    private static List<Color> getAll() {
        return new ArrayList<>(Arrays.asList(Color.values()));
    }

    public static boolean equals(Color color, Color otherColor) {
        return color.equals(otherColor);
    }

    private String getInitial() {
        return charAt(name(), 0);
    }

    private static Color get(int i) {
        return values()[i];
    }

    public static String getAllInitials(List<Color> colors) {
        String result = "";
        for (Color color : colors) {
            result += color.getInitial();
        }
        return result;
    }

    public static String getAllInitials() {
        return getAllInitials(getAll());
    }

    public static List<Color> get(String characters) {
        List<Color> result = new ArrayList<>();
        boolean exist = false;
        for (int i = 0; i < characters.length(); i++) {
            for (int j = 0; j < getAll().size() - 1; j++) {
                if (get(j).getInitial().equalsIgnoreCase(charAt(characters, i))) {
                    exist = true;
                    result.add(get(j));
                }
            }
            if (!exist) {
                result.add(EMPTY);
            }
        }
        return result;
    }

    private static String charAt(String input, int i) {
        return String.valueOf(input.charAt(i));
    }

    public static Color getRandom() {
        return get(new Random().nextInt(getAll().size() - 2) + 1);
    }
}