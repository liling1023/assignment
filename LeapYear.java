package java3;
import java.util.Scanner;
public class LeapYear {
    
	public static boolean isLeapYear(int year){
		if(year%400==0||(year%4==0&&year%100!=0))
		    return true;
		else
		    return false;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String in;
		do{
		    System.out.printf("��������ݣ�");
		    Scanner y=new Scanner(System.in);  
		    int year=y.nextInt();
		    if(year<1980||year>2050){
			   System.out.println("����������������������"); 
		       year=y.nextInt();
		    }
		    boolean consult=LeapYear.isLeapYear(year);
			if(consult==true)
				System.out.println(year+"�������꣡");
			else
				System.out.println(year+"����ƽ�꣡");
	        System.out.println("�Ƿ�������룿y or n");
		    in=input.next();
		}while(in.equals("y"));
				
		
	}

}
