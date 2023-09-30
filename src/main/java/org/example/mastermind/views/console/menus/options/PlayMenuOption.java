package org.example.mastermind.views.console.menus.options;

import org.example.mastermind.controllers.PlayLogic;
import org.example.mastermind.views.View;
import org.example.utils.MenuOption;

public class PlayMenuOption extends MenuOption {
    private final PlayLogic logic;
    private final View view;

    public PlayMenuOption(View view) {
        super("Play");
        this.view = view;
        logic = new PlayLogic();
    }

    @Override
    public void execute() {
        do {
            view.interact(logic.getController());
        } while (!logic.isFinish());
    }
}
