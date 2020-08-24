//Eclipseより記述コピーペースト

// パッケージがclassMethodと宣言
package classMethod;

// classMethod.huma.Human02をインポート
import classMethod.human.Human02;

public class ClassMethod02 {
  public static void main(String[] args) {
    // import文がない場合は、パッケージ名.クラス名にする必要がある(ここだと以下記述となる)
    // classMethod.human.Human02 yamada = new classMethod.human.Human02();
    // import文があるとクラス名のみでOK
    Human02 yamada = new Human02();
    System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

    // 上記import問題と同じことがここでも言える
    // classMethod.human.Human02 yamada = new classMethod.human.Human02("佐藤", 25);
    Human02 sato = new Human02("佐藤", 25);
    System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
  }
}