package org.example.mastermind.views;

import org.example.mastermind.controllers.Controller;
import org.example.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {
    public abstract void interact(Controller controller);

    public abstract void execute();
}