package kadai_018;

abstract public class Kato_Chapter18 {
     //姓
	String familyName  = "加藤";
	 //名
	String givenName;
	 //住所
	String address = "住所は東京都中野区〇×です";
	
	//メソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName +  "です");
		System.out.println(address);
	}
	abstract void eachIntroduce() ;
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}
	
}
