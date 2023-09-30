package org.example.mastermind.views.console.menus;

import org.example.mastermind.types.Message;
import org.example.mastermind.views.View;
import org.example.mastermind.views.console.*;
import org.example.mastermind.views.console.menus.options.ExitMenuOption;
import org.example.mastermind.views.console.menus.options.PlayMenuOption;
import org.example.mastermind.views.console.menus.options.RulesMenuOption;
import org.example.mastermind.views.console.menus.options.SettingsMenuOption;
import org.example.utils.Menu;

public class MainMenu extends Menu {
    private final ExitMenuOption exitMenuOption;

    public MainMenu(View view) {
        exitMenuOption = new ExitMenuOption("Exit");
        this.addMenuOption(new PlayMenuOption(view));
        this.addMenuOption(new SettingsMenuOption());
        this.addMenuOption(new RulesMenuOption());
        this.addMenuOption(exitMenuOption);
    }

    @Override
    public void execute() {
        do {
            new MessageView(Message.TITLE);
            super.execute();
        } while (!exitMenuOption.isActive());
    }
}
