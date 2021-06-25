package com.mastermind.views.console;

import com.mastermind.controllers.ResumeController;
import com.mastermind.types.Message;

public class ResumeView {
	
  public void interact(ResumeController controller) {
		
		if(!new YesNoDialog(Message.RESUME).isExit()){
			controller.reset();
			
			System.out.println("CONTINUAR");
		}else {
			controller.next();
		}
  }

}
