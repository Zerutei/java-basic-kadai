package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		//車オブジェクトの生成
		Car_Chapter15 myCar = new Car_Chapter15();
		
		
		//ギア変更
		myCar.gearChange(3);
		
		//走行状況表示
		myCar.run();
	}

}
