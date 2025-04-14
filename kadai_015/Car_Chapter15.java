package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 1;
    private int speed = 10 ;
    
    //コンストラクタ
    public Car_Chapter15( int gear, int speed ) {
    	this.gear = gear;
    	this.speed = speed;
   	
    }
    public Car_Chapter15() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	//メソッド
    public void gearChange( int afterGear ) {
    	if (afterGear < 1 || afterGear >5 ) {
    		this.gear = 1;
    		this.speed = 10;
    	}else {
    		this.gear = afterGear;
    		switch (afterGear){
    		case 1 -> this.speed = 10;
    		case 2 -> this.speed = 20;
    		case 3 -> this.speed = 30;
    		case 4 -> this.speed = 40;
    		case 5 -> this.speed = 50;
    				
    		}
    			
    		}
    	}
    
        public void run() {
        	System.out.println( "ギア" + gear +"から" + gear + "に切り替えました");
        	System.out.println("速度は時速" + speed + "kmです");
        	
        }

}
