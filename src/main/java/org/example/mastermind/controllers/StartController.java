package org.example.mastermind.controllers;

import org.example.mastermind.models.Game;
import org.example.mastermind.models.State;

public class StartController extends Controller {

    public StartController(State state, Game game) {
        super(state, game);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        System.out.println("2. ACEPTANDO CONSOLE VIEW");
        controllerVisitor.visit(this);
        System.out.println("4. FIN DE LA VISITA");
    }
}
