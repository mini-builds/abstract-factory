package io.minibuilds.designpatterns.units.impl;

import io.minibuilds.designpatterns.units.Settler;

public class BritishSettler implements Settler {
  @Override
  public void gather() {
    System.out.println("BritishSettler gathered");
  }
}
