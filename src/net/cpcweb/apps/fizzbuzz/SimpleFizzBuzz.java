package net.cpcweb.apps.fizzbuzz;

class SimpleFizzBuzz extends FizzBuzz {
  SimpleFizzBuzz(int endNum) {
    super(endNum);
  }

  public void execute() {
    for(int i = 1; i <= getEndNum(); i++) {
      if(i % 3 == 0 && i % 5 == 0) {
        System.out.print("fizz buzz ");
      } else if(i % 3 == 0) {
        System.out.print("fizz ");
      } else if(i % 5 == 0) {
        System.out.print("buzz ");
      } else {
        System.out.print(i + " ");
      }
    }
    return;
  }
}