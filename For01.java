public class For01 {
  public static void main(String[] args) {
    // for文
    // 初期化式：numberを１で初期化
    // 条件式：numberが５未満の場合、ブロック処理を行う
    // 変化式：ブロックの処理後に、numberをインクリメント(加算)
    for (int number = 1; number <= 5; number++) {
      // ブロック；numberを出力
      System.out.println("For01 = " + number);
    }
  }
}