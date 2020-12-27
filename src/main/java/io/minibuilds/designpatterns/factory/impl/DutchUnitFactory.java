package io.minibuilds.designpatterns.factory.impl;

import io.minibuilds.designpatterns.factory.UnitFactory;
import io.minibuilds.designpatterns.units.*;
import io.minibuilds.designpatterns.units.impl.DutchInfantry;
import io.minibuilds.designpatterns.units.impl.DutchSettler;

public class DutchUnitFactory implements UnitFactory {
  @Override
  public Settler createSettler() {
    return new DutchSettler();
  }

  @Override
  public Infantry createInfantry() {
    return new DutchInfantry();
  }
}
