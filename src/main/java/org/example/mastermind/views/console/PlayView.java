package org.example.mastermind.views.console;

import org.example.mastermind.controllers.PlayController;
import org.example.mastermind.types.Message;

public class PlayView {
    public void interact(PlayController controller) {
        do {
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
}