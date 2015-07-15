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
		    System.out.printf("请输入年份：");
		    Scanner y=new Scanner(System.in);  
		    int year=y.nextInt();
		    if(year<1980||year>2050){
			   System.out.println("您的输入有误！请重新输入"); 
		       year=y.nextInt();
		    }
		    boolean consult=LeapYear.isLeapYear(year);
			if(consult==true)
				System.out.println(year+"年是闰年！");
			else
				System.out.println(year+"年是平年！");
	        System.out.println("是否继续输入？y or n");
		    in=input.next();
		}while(in.equals("y"));
				
		
	}

}
