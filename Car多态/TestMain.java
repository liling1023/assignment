package java3;

public class TestMain {

	public static void main(String[] args) {
		CarShop shop = new CarShop();
		shop.sellCar(new QQ("ÆæÈğQQ",40000));
		shop.sellCar(new BMW("±¦ÂíX", 400000));
		System.out.println("Sale income: "+ shop.getMoney());


	}

}
