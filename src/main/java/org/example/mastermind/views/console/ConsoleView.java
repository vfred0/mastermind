package org.example.mastermind.views.console;

import org.example.mastermind.controllers.*;
import org.example.mastermind.views.View;
import org.example.mastermind.views.console.menus.MainMenu;

public class ConsoleView extends View {
    private final PlayView playView;
    private final ResumeView resumeView;
    private final SettingsView settingsView;

    public ConsoleView() {
        playView = new PlayView();
        resumeView = new ResumeView();
        settingsView = new SettingsView();
    }

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void execute() {
        new MainMenu(this).execute();
    }

    @Override
    public void visit(PlayController controller) {
        playView.interact(controller);
    }

    @Override
    public void visit(ResumeController controller) {
        resumeView.interact(controller);
    }

    @Override
    public void visit(SettingsController controller) {
        settingsView.interact(controller);
    }
}