package org.example.mastermind.views.console;


import org.example.utils.Console;
import org.example.mastermind.types.Message;

public class YesNoDialog {
    public final String yesReply = "Yy";
    public final String noReply = "Nn";
    public final String yesNoReply = yesReply + noReply;
    private final boolean isNoReply;

    public YesNoDialog() {
        String reply;
        do {
            new MessageView().write(Message.RESUME);
            reply = Console.getInstance().readString();
        } while (!yesNoReply.contains(reply));
        isNoReply = noReply.contains(reply);
    }

    public boolean isNoReply() {
        return isNoReply;
    }
}