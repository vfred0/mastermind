package org.example.mastermind.views.console;

import org.example.mastermind.controllers.PlayController;
import org.example.mastermind.types.Message;

public class GameView {

    public void write(PlayController controller) {
        MessageView messageView = new MessageView();
        messageView.writeln(Message.ATTEMPTS, controller.getAttempts());
        messageView.writeln(Message.SECRET_COMBINATION);
        for (int i = 0; i < controller.getAttempts(); i++) {
            new ProposedCombinationView(controller.getProposedCombination(i));
            messageView.writeln(Message.RESULT, controller.getResult(i).getBlacks(), controller.getResult(i).getWhites());
        }
    }
}