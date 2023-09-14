package org.example.mastermind.views.console;


import org.example.utils.Console;
import org.example.mastermind.types.Message;

public class YesNoDialog {
    private boolean exit;

    public YesNoDialog(Message resume) {
        String reply;
        do {
            new MessageView().write(Message.RESUME);
            reply = Console.getInstance().readString();
        } while (!"YyNn".contains(reply));
        exit = "Nn".contains(reply);
    }

    public boolean isExit() {
        return exit;
    }
}