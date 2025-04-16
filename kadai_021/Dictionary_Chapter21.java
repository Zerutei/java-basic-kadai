package kadai_021;
import java.util.HashMap;


public class Dictionary_Chapter21 {
	
	HashMap<String,String> fruitsMap = new HashMap<String,String>();
	
	public void set() {
		
		fruitsMap.put("apple","りんご");
		fruitsMap.put("peach","桃");
		fruitsMap.put("banana","バナナ");
		fruitsMap.put("lemon","レモン");
		fruitsMap.put("pear","梨");
		fruitsMap.put("kiwi","キウィ");
		fruitsMap.put("strawberry","イチゴ");
		fruitsMap.put("grape","ぶどう");
		fruitsMap.put("muscat","マスカット");
		fruitsMap.put("cherry","サクランボ");
		
	}
		public void hantei(String[]go) {
		for( int i = 0; i < go.length; i++) {
			
			if(fruitsMap.get(go[i]) == null) {
				System.out.println( go[i] + "は辞書に存在しません");
			}
			else {
				System.out.println( go[i] + "の意味は" + fruitsMap.get(go[i]));
			}
				
			}
		}
		
		

	}


