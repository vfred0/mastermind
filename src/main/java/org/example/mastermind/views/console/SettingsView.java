package org.example.mastermind.views.console;

import org.example.mastermind.controllers.SettingsController;
import org.example.utils.Console;

public class SettingsView {
    public void interact(SettingsController controller) {
        controller.setSizeCombination(getPositiveNumber("Enter size of combination: "));
        controller.setAttempts(getPositiveNumber("Enter number of attempts: "));
        controller.nextState();
    }

    private int getPositiveNumber(String title) {
        int number;
        boolean existsError;
        do {
            number = Console.getInstance().readInt(title);
            existsError = number < 0;
            if (existsError) {
                Console.getInstance().writeln("Error, enter positive number.");
            }
        } while (existsError);
        return number;
    }
}