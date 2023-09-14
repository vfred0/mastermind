package org.example.mastermind;

import org.example.mastermind.controllers.Controller;
import org.example.mastermind.controllers.Logic;
import org.example.mastermind.views.console.ConsoleView;

public class Mastermind {
    private Logic logic;
    private ConsoleView view;

    public static void main(String[] args) {
        new Mastermind().play();
    }

    public Mastermind() {
        view = new ConsoleView();
        logic = new Logic();
    }

    private void play() {
        Controller controller;
        do {
            if ((controller = logic.geController()) != null) {
                view.interact(controller);
            }
        } while (controller != null);
    }
}