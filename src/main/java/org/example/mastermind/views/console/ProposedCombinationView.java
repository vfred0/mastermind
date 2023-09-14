package org.example.mastermind.views.console;

import java.util.List;

import org.example.mastermind.controllers.PlayController;
import org.example.mastermind.models.ProposedCombination;
import org.example.utils.Console;
import org.example.mastermind.types.Color;
import org.example.mastermind.types.Error;
import org.example.mastermind.types.Message;

public class ProposedCombinationView {
    public ProposedCombinationView(ProposedCombination propesedCombination) {
        Console.getInstance().write(propesedCombination.getInitials());
    }

    public ProposedCombinationView() {
    }

    public List<Color> read(PlayController controller) {
        String characters;
        Error error;
        do {
            new MessageView().write(Message.PROPOSED_COMBINATION);
            characters = Console.getInstance().readString();
            error = controller.getError(Color.get(characters));
            if (error.exists()) {
                new ErrorView(error);
            }
        } while (error.exists());

        return Color.get(characters);
    }
}