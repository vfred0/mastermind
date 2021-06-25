package com.mastermind.views;

import com.mastermind.controllers.Controller;
import com.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

  public abstract void interact(Controller controller);

}