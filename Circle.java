
import java.util.Scanner;

public class Circle {
	private static final double pi=3.14;
    public  static double CaculArea(double r)
    {
    	if(r>=0)
    	  return r*r*pi;
    	else
    	 return -1;
    }
	public static void main(String[] args) {
       System.out.print("������Բ�İ뾶");
       Scanner reader=new Scanner(System.in);
       double  r=reader.nextDouble();
       double area=CaculArea(r);
       System.out.println("Բ�����Ϊ��"+area);
	}

}
