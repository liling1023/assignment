package java3;

public class FatherRectangle {
	public float length;
	public float wide;
	public String color;
	public FatherRectangle(){
		length=20;
		wide=10;
		color="red";
	}
	public FatherRectangle(float length,String color){
		this.length=length;
		this.wide=length;
		this.color=color;
	}
	public FatherRectangle(float length,float wide,String color){
		this.length=length;
		this.wide=wide;
		this.color=color;
	}
	public double getArea(){
		return length*wide;
	}
	public  void printInfo(){
		System.out.println("��Ϊ��"+length+"  ��Ϊ��"+wide+"  ��ɫΪ��"+color+"  ���Ϊ��"+getArea());
	}
}
