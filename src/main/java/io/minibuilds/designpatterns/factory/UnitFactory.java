package io.minibuilds.designpatterns.factory;

import io.minibuilds.designpatterns.units.Settler;
import io.minibuilds.designpatterns.units.Infantry;

public interface UnitFactory {
  Settler createSettler();
  Infantry createInfantry();
}
