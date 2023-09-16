package org.example.mastermind.views.console;

import org.example.utils.Console;
import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;

public class ErrorView {

    public ErrorView(Error error) {
        String[] messages = {"Repeated colors", "Wrong colors, they must be: " + Color.getAllFirstLetters(),
                "Wrong proposed combination length"};
        Console.getInstance().writeln(messages[error.ordinal()]);
    }
}
