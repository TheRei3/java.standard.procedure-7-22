package ex7no22;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	
	public Product2() { }
}

class Tv2 extends Product2 {

	Tv2() { super(100); }
	
	public String toString() { return "Tv";}
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	
	public String toString() { return "Computer";}
}

class Audio extends Product2 {

	Audio() { super(50); }
	
	public String toString() { return "Audio";}
}


class Buyer2 {
	int money = 1000;
	int bounsPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("?ž”?•¡?´ ë¶?ì¡±í•˜?—¬ ë¬¼ê±´?„ ?‚´ ?ˆ˜ ?—†?Šµ?‹ˆ?‹¤.");
			return;
		}
		
		money -= p.price;
		bounsPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "?„/ë¥? êµ¬ìž…?•˜?…¨?Šµ?‹ˆ?‹¤.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < item.length ; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("êµ¬ìž…?•˜?‹  ë¬¼í’ˆ?˜ ì´ê¸ˆ?•¡?? "+ sum + "ë§Œì›?ž…?‹ˆ?‹¤.");
		System.out.println("êµ¬ìž…?•˜?‹  ? œ?’ˆ?? "+ itemList + "?ž…?‹ˆ?‹¤.");
	}
}

public class ex7no22 {  //  368p
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
		
	}

}
