package org.example.mastermind.views.console.menus;

import org.example.mastermind.views.console.menus.options.SetNumberAttemptsMenuOption;
import org.example.mastermind.views.console.menus.options.ExitMenuOption;
import org.example.mastermind.views.console.menus.options.SetDefaultSettingsMenuOption;
import org.example.mastermind.views.console.menus.options.SetSizeCombinationMenuOption;
import org.example.utils.Console;

public class SettingsMenu extends org.example.utils.Menu {
    private final ExitMenuOption exitMenuOption;

    public SettingsMenu() {
        exitMenuOption = new ExitMenuOption("Back");
        this.addMenuOption(new SetSizeCombinationMenuOption());
        this.addMenuOption(new SetNumberAttemptsMenuOption());
        this.addMenuOption(new SetDefaultSettingsMenuOption());
        this.addMenuOption(exitMenuOption);
    }

    @Override
    public void execute() {
        do {
            Console.getInstance().writeln("----- Options for settings -----");
            super.execute();
        } while (!exitMenuOption.isActive());
    }
}