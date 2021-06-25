package com.mastermind.views.console;

import com.mastermind.controllers.PlayController;
import com.mastermind.types.Message;

public class PlayView {


  public void interact(PlayController controller) {
		do {									
			controller.add(new ProposedCombinationView().read(controller));
			controller.incrementAttemps();
			new GameView().write(controller);
		} while (!controller.finished());
		Message message = Message.LOOSER;
		if (controller.isWinner()) {
			message = Message.WINNER;
		}
		new MessageView(message);
		controller.next();
  }

	


}
