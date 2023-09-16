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

    private String getFirstLetter() {
        return charAt(name(), 0);
    }

    private static Color get(int position) {
        return values()[position];
    }

    public static String getAllFirstLetters(List<Color> colors) {
        StringBuilder allFirstLetters = new StringBuilder();
        for (Color color : colors) {
            allFirstLetters.append(color.getFirstLetter());
        }
        return allFirstLetters.toString();
    }

    public static String getAllFirstLetters() {
        return getAllFirstLetters(getAll());
    }

    public static List<Color> getColorsFromCharacters(String characters) {
        List<Color> colors = new ArrayList<>();
        String firstLetters = getAllFirstLetters().toLowerCase();
        for (int i = 0; i < characters.length(); i++) {
            String letter = charAt(characters, i);
            if (firstLetters.contains(letter)) {
                colors.add(get(firstLetters.indexOf(letter)));
            }
        }
        return colors;
    }

    private static String charAt(String input, int i) {
        return String.valueOf(input.charAt(i));
    }

    public static Color getRandom() {
        return get(new Random().nextInt(getAll().size() - 2) + 1);
    }
}