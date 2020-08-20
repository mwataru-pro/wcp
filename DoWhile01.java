public class DoWhile01 {
  public static void main(String[] args) {
    int number = 1;
    do {
      number *= 2;
      System.out.println("DoWhile01 = " + number);
    } while (number < 50);
  }
}

// ※While01との違いは、条件のture/falseに関わらず、DoWhileは一回は処理が行われるところ