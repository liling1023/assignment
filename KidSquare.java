package java3;

class KidSquare extends FatherRectangle{
	public KidSquare(float length,String color) {
		super(length,color);
	}
	public static void main(String[] args) {
		KidSquare s = new KidSquare(20, "black");
		s.printInfo();
	}
}