package com.mastermind.views.console;

import com.mastermind.controllers.Controller;
import com.mastermind.controllers.ElectionWidthCombinationController;
import com.mastermind.controllers.PlayController;
import com.mastermind.controllers.ResumeController;
import com.mastermind.controllers.StartController;
import com.mastermind.views.View;

public class ConsoleView extends View {
  private StartView startView;
  private PlayView playView;
  private ResumeView resumeView;
  private ElectionWidthCombinationView electionView;

  public ConsoleView() {
    startView = new StartView();
    playView = new PlayView();
    resumeView = new ResumeView();
    electionView = new ElectionWidthCombinationView();
  }

  @Override
  public void interact(Controller controller) {
    System.out.println("1. ENVIADO ACEPTACION A UN CONTROLADOR");
    controller.accept(this);
  }

  @Override
  public void visit(StartController controller) {
    System.out.println("3. RECIBIENDO EL CONTROLADOR A VISITAR");
    startView.interact(controller);
  }

  @Override
  public void visit(PlayController controller) {
    playView.interact(controller);
  }

  @Override
  public void visit(ResumeController controller) {
    resumeView.interact(controller);
  }

  @Override
  public void visit(ElectionWidthCombinationController controller) {
    controller.init();
    controller.next();
  }
}
