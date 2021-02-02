import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       //整数(int型) 
      int income = 5000000 ; //年収
      System.out.println("年収:"+ income);

      //整数（long型)
      long malePopulation = 3500000000L ; //人口（男性）
      System.out.println("人口(男性):"+ malePopulation);

       //小数点数（float型　doubleより厳密さにかける）
       float tax = 1.08F ;             //消費税
       System.out.println("消費税："+ tax);

       //論理値（boolean型）
       boolean genderMale  = false;     //性別が男性
       System.out.println("性別が男性："+ genderMale );

       //文字（char型　１文字）
       char weekday = '土';            //曜日
       System.out.println("曜日："+ weekday);

       // ----------------------------------------------------
       Scanner scanner = new Scanner(System.in);
       //コンストラクタ　引数（name,color）
       Car car = new Car("フェラーリ", "赤");

       // setNameメソッドを用いて、carの名前を「フェラーリ」にしてください
        //car.setName("フェラーリ");
    
       // setColorメソッドを用いて、carの色を「赤」にしてください
        //car.setColor("赤");
        //コンストラクタ　引数（name,color
       Bicycle bicycle = new Bicycle("ビアンキ", "緑");

       // setNameメソッドを用いて、bicycleの名前を「ビアンキ」にしてください
        //bicycle.setName("ビアンキ");
    
        // setColorメソッドを用いて、bicycleの色を「緑」にしてください
        //bicycle.setColor("緑");
    
        System.out.println("【車の情報】");
        car.printData();

        System.out.println("-----------------");
        System.out.print("走る距離を入力してください：");
        int carDistance = scanner.nextInt();
        // runメソッドを呼び出して、引数にcarDistanceを渡してください
        car.run(carDistance);
        
        System.out.println("-----------------");
        System.out.print("給油する量を入力してください：");
        int litre = scanner.nextInt();
        // chargeメソッドを呼び出して、引数にlitreを渡してください
        car.charge(litre);

        System.out.println("=================");
        System.out.println("【自転車の情報】");
        bicycle.printData();
        
        System.out.println("-----------------");
        System.out.print("走る距離を入力してください：");
        int bicycleDistance = scanner.nextInt();
        // runメソッドを呼び出して、引数にbicycleDistanceを渡してください
        bicycle.run(bicycleDistance);
        //-------------------------------------------------------

        try{
           int x= Integer.parseInt(args[0]);
           int y= Integer.parseInt(args[1]);

           System.out.println(x/y);
        }catch(ArithmeticException e){
          System.out.println("[ゼロ割]" + e +"が発生しました"); //ゼロ割が発生した場合の処理
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("[インデックス範囲外指定]" + e +"が発生しました");//存在しない配列のインデックスが指定された場合
        }catch(NumberFormatException e){
          System.out.println("[入力値不正（数字でない）]"+ e + "が発生しました");//数字の形式の文字列が入力された場合
          
        }
        System.out.println("最後まで処理しました");



    }
  }
  