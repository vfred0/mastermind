package org.example.mastermind.views.console;

import org.example.mastermind.controllers.PlayController;
import org.example.mastermind.types.Message;
import org.example.utils.Console;

public class PlayView {
    public void interact(PlayController controller) {
        do {
            this.showColors();
            controller.add(new ProposedCombinationView().read(controller));
            controller.incrementAttempts();
            new GameView().write(controller);
        } while (!controller.finished());
        Message message = Message.LOOSER;
        if (controller.isWinner()) {
            message = Message.WINNER;
        }
        new MessageView(message);
        controller.nextState();
    }

    private void showColors() {
        Console console = Console.getInstance();
        console.writeln("Available colors:");
        console.writeln("r -> red");
        console.writeln("g -> green");
        console.writeln("b -> blue");
        console.writeln("y -> yellow");
        console.writeln("o -> orange");
        console.writeln("p -> purple");
        console.writeln("e -> empty");
        console.writeln("Enter the first letters of each color...");
    }
}