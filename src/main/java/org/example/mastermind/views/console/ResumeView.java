package org.example.mastermind.views.console;

import org.example.mastermind.controllers.ResumeController;

public class ResumeView {
    public void interact(ResumeController controller) {
        if (!new YesNoDialog().isNoReply()) {
            controller.reset();
        } else {
            controller.nextState();
        }
    }
}