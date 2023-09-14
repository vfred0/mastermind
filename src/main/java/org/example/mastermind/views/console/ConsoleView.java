package org.example.mastermind.views.console;

import org.example.mastermind.views.View;
import org.example.mastermind.controllers.Controller;
import org.example.mastermind.controllers.ElectionWidthCombinationController;
import org.example.mastermind.controllers.PlayController;
import org.example.mastermind.controllers.ResumeController;
import org.example.mastermind.controllers.StartController;

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
        controller.accept(this);
    }

    @Override
    public void visit(StartController controller) {
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