package com.mastermind.views.console;

import java.util.List;

import com.mastermind.controllers.PlayController;
import com.mastermind.models.ProposedCombination;
import com.mastermind.types.Color;
import com.mastermind.types.Error;
import com.mastermind.types.Message;
import com.utils.Console;

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
