package org.example.mastermind.views.console.menus.options;

import org.example.utils.Console;
import org.example.utils.MenuOption;

public class RulesMenuOption extends MenuOption {
    public RulesMenuOption() {
        super("Rules");

    }

    @Override
    public void execute() {
        Console console = Console.getInstance();
        console.writeln("The game consists of guessing the combination with the attempts you have available, which by default are 10 attempts.");
        console.writeln("If you guess then you have won otherwise you lost.");
        console.readString("Press [Enter] to back...");
    }
}