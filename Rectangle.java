package java3;

public class Rectangle {
	private float length;
	private float wide;
	private String color;
	public Rectangle(){
		length=20;
		wide=10;
		color="red";
	}
	public Rectangle(float length){
		this.length=length;
	}
	public Rectangle(float length,float wide){
		this.length=length;
		this.wide=wide;
	}
	public Rectangle(float length,float wide,String color){
		this.length=length;
		this.wide=wide;
		this.color=color;
	}
	public double getArea(){
		return length*wide;
	}
	public  void printInfo(){
		System.out.println("长方形的长为："+length+"  宽为："+wide+"  颜色为："+color+"  面积为："+getArea());
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.printInfo();
		Rectangle r2=new Rectangle(30);
		r2.printInfo();
		Rectangle r3=new Rectangle(30,20);
		r3.printInfo();
		Rectangle r4=new Rectangle(30,20,"blue");
		r4.printInfo();

	}

}
