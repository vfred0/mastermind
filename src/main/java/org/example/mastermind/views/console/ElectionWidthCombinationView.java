package org.example.mastermind.views.console;

import org.example.mastermind.controllers.ElectionWidthCombinationController;
import org.example.utils.Console;

public class ElectionWidthCombinationView {
    public void interact(ElectionWidthCombinationController controller) {

        controller.setWidthCombination(Console.getInstance().readInt("Tamaño a jugar: "));
        controller.next();
    }
}