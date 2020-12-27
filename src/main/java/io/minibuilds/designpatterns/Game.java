package io.minibuilds.designpatterns;

import io.minibuilds.designpatterns.factory.UnitFactory;
import io.minibuilds.designpatterns.units.Settler;
import io.minibuilds.designpatterns.units.Infantry;

public class Game {

  private final Settler settler;
  private final Infantry infantry;

  public Game(UnitFactory factory) {
    settler = factory.createSettler();
    infantry = factory.createInfantry();
  }

  public void update() {
    settler.gather();
    infantry.attack();
  }
}
