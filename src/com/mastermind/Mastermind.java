package com.mastermind;

import com.mastermind.controllers.Controller;
import com.mastermind.controllers.Logic;
import com.mastermind.views.console.ConsoleView;

public class Mastermind {
  private Logic logic;
  private ConsoleView view;

  public static void main(String[] args) {
    new Mastermind().play();
  }

  public Mastermind() {
    view = new ConsoleView();
    logic = new Logic();    
  }

  private void play() {
    Controller controller;
    do {
      if( (controller = logic.geController() ) != null){
        view.interact(controller);
      }
    } while (controller != null);
  }
}
