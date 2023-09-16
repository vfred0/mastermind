package org.example.mastermind.views.console;

import java.util.List;

import org.example.mastermind.controllers.PlayController;
import org.example.mastermind.models.ProposedCombination;
import org.example.utils.Console;
import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;
import org.example.mastermind.types.Message;

public class ProposedCombinationView {
    public ProposedCombinationView(ProposedCombination proposedCombination) {
        Console.getInstance().write(proposedCombination.getFirstColorLetters());
    }

    public ProposedCombinationView() {
    }

    public List<Color> read(PlayController controller) {
        List<Color> colors;
        Error error;
        do {
            new MessageView().write(Message.PROPOSED_COMBINATION);
            colors = Color.getColorsFromCharacters(Console.getInstance().readString());
            error = controller.getError(colors);
            if (error.exists()) {
                new ErrorView(error);
            }
        } while (error.exists());
        return colors;
    }
}