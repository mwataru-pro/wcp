public class Chapter07 {
  public static void main(String[] args) {
    // 確認問題1
    int distance = 13;
    if (distance <= 5) {
      System.out.println("とても近いです");
    }else if (distance <= 10) {
      System.out.println("近いです");
    }else if (distance <= 15) {
      System.out.println("遠いです");
    }else {
      System.out.println("とても遠いです");
    }

    // 確認問題２
    String color = "blue";
    switch (color) {
    case "red":
      System.out.println("赤信号です");
      break;
    case "blue":
      System.out.println("青信号です");
      break;
    case "yellow":
      System.out.println("黄信号です");
    default:
      System.out.println("信号の色ではありません");
    }
  }
}