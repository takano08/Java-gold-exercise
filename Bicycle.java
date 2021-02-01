class Bicycle extends Vehicle {
// Bicycleクラスのコンストラクタを定義し、
// superを用いてスーパークラスのコンストラクタを呼び出してください
  Bicycle(String name,String color){
    super(name,color);
  }  
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    this.distance += distance;
    System.out.println("走行距離：" + this.distance + "km");
  }

}