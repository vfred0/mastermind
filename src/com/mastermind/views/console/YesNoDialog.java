package com.mastermind.views.console;


import com.mastermind.types.Message;
import com.utils.Console;

public class YesNoDialog {
  private boolean exit;
  
  
	public YesNoDialog(Message resume) {    
    String reply;
    do {            
      new MessageView().write(Message.RESUME);
      reply = Console.getInstance().readString();
    } while (!"YyNn".contains(reply));
    exit = "Nn".contains(reply);  
	}

	public boolean isExit() {
		return exit;
	}

  public static void main(String[] args) {
    System.out.println("SALIDA? " +new YesNoDialog(Message.RESUME).isExit());
  }

}
