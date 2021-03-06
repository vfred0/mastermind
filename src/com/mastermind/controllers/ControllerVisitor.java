package com.mastermind.controllers;

public interface ControllerVisitor {
  void visit(StartController controller);
  void visit(PlayController controller);
  void visit(ResumeController controller);
  void visit(ElectionWidthCombinationController controller);
}
