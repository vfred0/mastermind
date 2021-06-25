package com.mastermind.views.console;

import com.mastermind.controllers.StartController;
import com.mastermind.types.Message;

public class StartView  {		
  public void interact(StartController controller) {	
		new MessageView(Message.TITLE);		
		controller.next();
  }

}
