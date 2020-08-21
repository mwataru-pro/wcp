public class Continue01 {
  public static void main(String[] args) {
    for (int count = 0; count < 5; count++) {
      if (count == 2) {
        // countが２の場合、この後の処理をスキップ
        continue;
      }
      System.out.println("Continue01 = " + count);
    }
  }
}

// ループを終了する条件(ここではcount < 5)が決して満たされないようなループを無限ループという。
// きちんと終了条件を書いておかないと無限ループによる、メモリ消費やCPU負荷上昇などが起きるので注意。