package java3;

public class YuanXing extends Shape {
	private float radius;
	public YuanXing(float radius){
		this.radius=radius;
	}
	public double Area(){
		return Math.PI*radius*radius;
	}

}
