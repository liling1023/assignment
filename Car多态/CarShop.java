package java3;

public class CarShop {
	int money=0;
	void sellCar( Car c) {
		System.out.println("sellCar is£º"+c.getName());
		money=money+c.getPrice();
	}
	int getMoney(){
		return money;
		
	}


}
