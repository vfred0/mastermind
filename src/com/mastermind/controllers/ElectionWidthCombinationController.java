package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public class ElectionWidthCombinationController extends Controller{

  public ElectionWidthCombinationController(State state, Game game) {
    super(state, game);    
  }

  @Override
  public void accept(ControllerVisitor controllerVisitor) {
    controllerVisitor.visit(this);  
  }

  public void setWidthCombination(int width) {
    game.setWidthCombination(width);
  }
  public void init(){
    game.init();
  }

}
