package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		while( !input.equals("r") && !input.equals("s") && !input.equals("p")) {
			System.out.println("適切ではありません");
			
			 scanner = new Scanner(System.in);
			
			 input = scanner.next();
			 
		}
		
		return input;
		
	}
	
	public String getRandom() {
		String[] rsp = {"r","s","p"};
		return rsp[(int)(Math.floor(Math.random() * 3))];
		
		
	}
	public void playGame() {
	  HashMap<String,String> rspMap = new HashMap<String,String>();
	  
	  rspMap.put("r","グー");
	  rspMap.put("s","チョキ");
	  rspMap.put("p","パー");
	  
	  
	  String player = getMyChoice();
	  String cpu = getRandom();
	  
	  System.out.println("自分の手は" + rspMap.get(player)+",対戦相手の手は" + rspMap.get(cpu));
	  
	  
	  if(player.equals(cpu)) {
	  System.out.print("あいこです");
	  
	  }
	  
	  else if((player.equals("r") && cpu.equals("s")) || (player.equals("s") && cpu.equals("p")) || (player.equals("p") && cpu.equals("r"))) {
		  System.out.print("自分の勝ちです");
	  }
	  
	  else{System.out.println("自分の負けです");}
	  
	  
	}
}
