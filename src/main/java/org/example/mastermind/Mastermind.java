package org.example.mastermind;

import org.example.mastermind.controllers.Logic;
import org.example.mastermind.views.console.ConsoleView;

public class Mastermind {
    private final Logic logic;
    private final ConsoleView view;

    public static void main(String[] args) {
        new Mastermind().play();
    }

    public Mastermind() {
        view = new ConsoleView();
        logic = new Logic();
    }

    private void play() {
        do {
            view.interact(logic.getController());
        } while (!logic.isFinish());
    }
}