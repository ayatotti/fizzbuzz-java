package net.cpcweb.apps.fizzbuzz;

abstract class FizzBuzz {
  private int endNum;
  FizzBuzz(int endNum) {
    this.endNum = endNum;
  }
  abstract public void execute();

  protected int getEndNum() {
    return endNum;
  }
}