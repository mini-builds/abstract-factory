package io.minibuilds.designpatterns.units.impl;

import io.minibuilds.designpatterns.units.Infantry;

public class DutchInfantry implements Infantry {
  @Override
  public void attack() {
    System.out.println("DutchInfantry attacked");
  }
}
