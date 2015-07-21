package java3;

public class Square {

	private float length;
	private String color;
	public Square(){
		length=10;
		color="red";
	}
	public Square(float length){
		this.length=length;
	}
	public Square(float length,String color){
		this.length=length;
		this.color=color;
	}
	public double getArea(){
		return length*length;
	}
	public  void printInfo(){
		System.out.println("正方形的边长为："+length+"  颜色为："+color+"  面积为："+getArea());
	}
	public static void main(String[] args) {
		Square r1=new Square();
		r1.printInfo();
		Square r2=new Square(20);
		r2.printInfo();
		Square r3=new Square(20,"blue");
		r3.printInfo();
	}
}

