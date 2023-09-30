package org.example.mastermind.views.console.menus.options;

import org.example.mastermind.views.View;
import org.example.mastermind.views.console.menus.SettingsMenu;
import org.example.utils.MenuOption;

public class SettingsMenuOption extends MenuOption {
    public SettingsMenuOption() {
        super("Settings");
    }

    @Override
    public void execute() {
        new SettingsMenu().execute();
    }
}