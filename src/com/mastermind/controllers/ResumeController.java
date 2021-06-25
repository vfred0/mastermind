package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public class ResumeController extends Controller {

  public ResumeController(State state, Game game) {
    super(state, game);   
  }

  @Override
  public void accept(ControllerVisitor controllerVisitor) {  
    controllerVisitor.visit(this);
  }

  public void reset() {
    this.game.reset();
    state.reset();
  }
}