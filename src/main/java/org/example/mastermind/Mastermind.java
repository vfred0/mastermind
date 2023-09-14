package org.example.mastermind;

import org.example.mastermind.controllers.Controller;
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
        Controller controller;
        do {
            controller = logic.geController();
            if (existsController(controller)) {
                view.interact(controller);
            }
        } while (existsController(controller));
    }

    private static boolean existsController(Controller controller) {
        return controller != null;
    }
}