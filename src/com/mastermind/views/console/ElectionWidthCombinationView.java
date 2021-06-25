package com.mastermind.views.console;

import com.mastermind.controllers.ElectionWidthCombinationController;
import com.utils.Console;

public class ElectionWidthCombinationView {

  public void interact(ElectionWidthCombinationController controller) {

    controller.setWidthCombination( Console.getInstance().readInt("Tamaño a jugar: "));
    controller.next();
  }
  
}
