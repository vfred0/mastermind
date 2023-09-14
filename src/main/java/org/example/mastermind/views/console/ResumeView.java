package org.example.mastermind.views.console;

import org.example.mastermind.controllers.ResumeController;
import org.example.mastermind.types.Message;

public class ResumeView {
    public void interact(ResumeController controller) {

        if (!new YesNoDialog(Message.RESUME).isExit()) {
            controller.reset();
        } else {
            controller.next();
        }
    }

}
