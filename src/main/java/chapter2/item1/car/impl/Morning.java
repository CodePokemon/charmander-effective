package chapter2.item1.car.impl;

public class Morning implements Car {
  @Override
  public String getModel() {
    return "This is Morning";
  }

  @Override
  public int getPrice() {
    return 1_000_000;
  }
}
