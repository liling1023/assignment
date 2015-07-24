package java3;

public class ZhengFangXing extends Shape {
	private float length;
	public ZhengFangXing(float length){
		this.length=length;
	}
	public double Area(){
		return length*length;
	}

}
