package java3;

public class ChangFangXing extends Shape  {
	private float length;
	private float wide;
	public ChangFangXing(float length,float width){
		this.length=length;
		this.wide=width;
	}
	public double Area(){
		return length*wide;
	}

}
