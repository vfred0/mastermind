package org.example.mastermind;

import org.example.mastermind.views.View;
import org.example.mastermind.views.console.ConsoleView;

public class ConsoleViewMastermind extends Mastermind {
    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleViewMastermind().play();
    }
}