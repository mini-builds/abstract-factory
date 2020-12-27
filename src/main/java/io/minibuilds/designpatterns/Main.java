package io.minibuilds.designpatterns;

import io.minibuilds.designpatterns.factory.UnitFactory;
import io.minibuilds.designpatterns.factory.impl.BritishUnitFactory;
import io.minibuilds.designpatterns.factory.impl.DutchUnitFactory;

public class Main {

  public static void main(String[] args) {
    UnitFactory unitFactory;
    if (args.length > 0 && args[0].equalsIgnoreCase("british")) {
      unitFactory = new BritishUnitFactory();
    } else {
      unitFactory = new DutchUnitFactory();
    }
    Game game = new Game(unitFactory);
    game.update();
  }

}
