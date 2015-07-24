package java3;

public class SanJiaoXing extends Shape {
	private float length;
	private float height;
	public SanJiaoXing(float length, float height){
		this.length=length;
		this.height=height;
	}
	public double Area(){
		return length*height*0.5;
	}


}
