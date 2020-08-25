// 【問題】「Chapter09.java」を実行した結果が(20 km 走ります/残量は、53.4です)になるように「Car.java」を作成してください。

package practice;

public class Car {
  // 【問題文】燃費(Km/L)
  private double fuelCost;
  // 【問題文】残量(L)
  private double fuelAmount;
  
  // 【問題文】コンストラクタを作成
  public Car(double fuelCost, double fuelAmount) {
    this.fuelCost = fuelCost;
    this.fuelAmount = fuelAmount;
  }
  // 【問題文】moveメソッド
  // 【問題文】・"xx km 走ります"を出力
  // 【問題文】・残量を計算
  public void move(int km) {
    System.out.println(km + "km 走ります");
    this.fuelAmount -= (km / fuelCost);
  }
  
  // 【問題文】fuelAmountを取得するメソッドを作成
  public double getFuelAmount() {
    return this.fuelAmount;
  }
}