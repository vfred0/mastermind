package org.example.mastermind.views.console;

import org.example.utils.Console;
import org.example.mastermind.types.Message;

public class MessageView {
    private String[] messages = {"----- MASTERMIND -----", "*****", "# attempt(s): ", " --> # blacks and # whites",
            "Propose a combination: ", "You've won!!! ;-)", "You've lost!!! :-(", "Do you want to continue?(y/n)"};

    public MessageView(Message message) {
        writeln(message);
    }

    public MessageView() {
    }

    public void writeln(Message message) {
        Console.getInstance().writeln(getOrdinal(message));
    }

    public void writeln(Message message, int attemp) {
        Console.getInstance().writeln(getOrdinal(message).replace("#", String.valueOf(attemp)));
    }

    public void writeln(Message message, int blacks, int whites) {
        Console.getInstance().writeln(getOrdinal(message).replaceFirst("#", String.valueOf(blacks))
                .replaceFirst("#", String.valueOf(whites)));
    }

    private String getOrdinal(Message message) {
        return messages[message.ordinal()];
    }

    public void write(Message message) {
        Console.getInstance().write(getOrdinal(message));
    }
}