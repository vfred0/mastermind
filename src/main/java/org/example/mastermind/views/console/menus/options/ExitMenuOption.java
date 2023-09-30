package org.example.mastermind.views.console.menus.options;

import org.example.utils.MenuOption;

public class ExitMenuOption extends MenuOption {

    private boolean active;

    public ExitMenuOption(String title) {
        super(title);
    }

    @Override
    public void execute() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }
}