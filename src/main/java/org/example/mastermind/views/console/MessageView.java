package org.example.mastermind.views.console;

import org.example.utils.Console;
import org.example.mastermind.types.Message;

public class MessageView {
    private String[] messages;

    private Console console;

    public MessageView(Message message) {
        setAttributes();
        writeln(message);
    }

    public MessageView() {
        setAttributes();
    }

    private void setAttributes() {
        messages = new String[]{
                "----- Welcome to Mastermind -----",
                "*****",
                "# attempt(s): ",
                " --> # blacks and # whites",
                "Propose a combination: ",
                "You've won!!! ;-)",
                "You've lost!!! :-(",
                "Do you want to continue?(y/n): "
        };
        console = Console.getInstance();
    }

    public void writeln(Message message) {
        console.writeln(getOrdinal(message));
    }

    public void writeln(Message message, int attempt) {
        console.writeln(getOrdinal(message).replace("#", String.valueOf(attempt)));
    }

    public void writeln(Message message, int blacks, int whites) {
        console.writeln(getOrdinal(message).replaceFirst("#", String.valueOf(blacks))
                .replaceFirst("#", String.valueOf(whites)));
    }

    private String getOrdinal(Message message) {
        return messages[message.ordinal()];
    }

    public void write(Message message) {
        console.write(getOrdinal(message));
    }
}