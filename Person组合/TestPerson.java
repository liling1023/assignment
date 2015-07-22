package java3;

public class TestPerson {
	
	public static void main(String[] args) {
		Person person=new Person();
		person.H[0]=new Hand(2,10);
		person.H[1]=new Hand(2,10);
		person.L[0]=new Leg(20,20);
		person.L[1]=new Leg(20,20);
		person.printInfo();

	}

}
