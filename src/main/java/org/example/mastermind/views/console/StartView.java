package org.example.mastermind.views.console;

import org.example.mastermind.controllers.StartController;
import org.example.mastermind.types.Message;

public class StartView {
    public void interact(StartController controller) {
        new MessageView(Message.TITLE);
        controller.next();
    }
}