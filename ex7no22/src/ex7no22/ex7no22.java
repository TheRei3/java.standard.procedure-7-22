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
			System.out.println("?��?��?�� �?족하?�� 물건?�� ?�� ?�� ?��?��?��?��.");
			return;
		}
		
		money -= p.price;
		bounsPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "?��/�? 구입?��?��?��?��?��.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < item.length ; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구입?��?�� 물품?�� 총금?��?? "+ sum + "만원?��?��?��.");
		System.out.println("구입?��?�� ?��?��?? "+ itemList + "?��?��?��.");
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
