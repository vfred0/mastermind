package org.example.utils;

import java.util.ArrayList;

public abstract class Menu {
    private static final String OPTION_INPUT = "Choose one option: ";

    private final ArrayList<MenuOption> menuOptions;

    public Menu() {
        this.menuOptions = new ArrayList<>();
    }

    public void execute() {
//        ArrayList<MenuOption> menuOptions =
        int option;
        do {
            showMenuOptions(menuOptions);
            option = Console.getInstance().readInt(OPTION_INPUT) - 1;
        } while (existsError(menuOptions, option));
        menuOptions.get(option).execute();
    }

    private static boolean existsError(ArrayList<MenuOption> menuOptions, int option) {
        return !new ClosedInterval(0, menuOptions.size() - 1).isIncluded(option);
    }

    private static void showMenuOptions(ArrayList<MenuOption> menuOptions) {
        for (int i = 0; i < menuOptions.size(); i++) {
            Console.getInstance().writeln((i + 1) + ") " + menuOptions.get(i).getTitle());
        }
    }
    protected void addMenuOption(MenuOption menuOption) {
        this.menuOptions.add(menuOption);
    }
}
