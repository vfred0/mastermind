package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public abstract class Controller {
  protected State state;
  protected Game game;

  public Controller(State state, Game game) {
    this.state = state;
    this.game = game;
  }
  public abstract void accept(ControllerVisitor controllerVisitor);

	public void next() { 
    this.state.next();    
	}
  
}
