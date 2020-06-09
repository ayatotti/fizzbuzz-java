package net.cpcweb.apps.fizzbuzz;

class FizzBuzzMain {
  public static void main(String[] args) {
    String endNumArg;
    if(args.length != 0) {
      endNumArg = args[0];
    } else {
      return;
    }
    int endNum;
    try {
      endNum = Integer.parseInt(endNumArg);
    } catch (NumberFormatException e) {
      return;
    }

    FizzBuzz fizzBuzz = new SimpleFizzBuzz(endNum);
    fizzBuzz.execute();
  }
}