public class Chapter08 {
  public static void main(String[] args) {
    // 問題１
    int number = 1;
    while (number < 5) {
      System.out.println(number * number);
      number++;
    }

    //問題２
    int array[] = {1 ,4 ,15 ,24};
    for (int num = 0; num < array.length; num++) {
      System.out.println(array[num]);
    }

    //問題3
    for (int val : array) {
      if (val % 2 == 0) {
        continue;
      }
      System.out.println(val);
    }
  }
}