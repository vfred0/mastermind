package com.mastermind.views.console;

import com.mastermind.controllers.PlayController;
import com.mastermind.types.Message;

public class GameView {

	public void write(PlayController controller) {        
    MessageView messageView = new MessageView();    
    messageView.writeln(Message.ATTEMPTS, controller.getAttemps());    
    messageView.writeln(Message.SECRET_COMBINATION);
    for (int i = 0; i < controller.getAttemps(); i++) {      
      new ProposedCombinationView(controller.getPropesedCombination(i));
      messageView.writeln(Message.RESULT, controller.getResult(i).getBlacks(), controller.getResult(i).getWhites());      
      
    }
    
     

	}

}

