package io.minibuilds.designpatterns.factory.impl;

import io.minibuilds.designpatterns.factory.UnitFactory;
import io.minibuilds.designpatterns.units.Settler;
import io.minibuilds.designpatterns.units.Infantry;
import io.minibuilds.designpatterns.units.impl.BritishSettler;
import io.minibuilds.designpatterns.units.impl.BritishInfantry;

public class BritishUnitFactory implements UnitFactory {
  @Override
  public Settler createSettler() {
    return new BritishSettler();
  }

  @Override
  public Infantry createInfantry() {
    return new BritishInfantry();
  }
}
