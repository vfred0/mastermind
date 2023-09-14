package org.example.mastermind.views.console;

import org.example.utils.Console;
import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

public class ErrorView {

    private String[] messages = {"Repeated colors", "Wrong colors, they must be: " + Color.getAllInitials(),
            "Wrong proposed combination length"};

    public ErrorView(Error error) {
        Console.getInstance().writeln(messages[error.ordinal()]);
    }
}
