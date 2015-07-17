package java3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TextCard {

	public static int textcard17(String num){
		int length = num.length();
			    // 判断是否为18位
		int count = 0;
			    if (length == 18) {
			        char[] numChar = num.substring(0, 17).toCharArray();
			        int[] xishu = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
			        int[] vi = { 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 };

			        for (int i = 0; i < numChar.length; i++) {
			            count += (numChar[i] - '0') * xishu[i];
			        }
			        // 余数
			        System.out.println(count);
			    }   
			    int temp = count % 11;
			    System.out.println(temp);
			    return temp;
			 
	}
		        // 判断校验码位是否正确
	public static int Text18(int temp){
		switch(temp){
		case 0:
			return 1;
		case 1:
			return 0;
		case 2:
			return 'x';
		case 3:
			return 9;
		case 4:
			return 8;
		case 5:
			return 7;
		case 6:
			return 6;
		case 7:
			return 5;
		case 8:
			return 4;
		case 9:
			return 3;
		case 10:
			return 2;
		}
		return -1;
  
	}      

	
	
	public static void main(String[] args) {
		System.out.printf("请输入18位身份证号：");
		Scanner y= new Scanner(System.in);
		String num=y.next();
		char[] numChar = num.substring(0, 17).toCharArray();
		int temp=TextCard.textcard17(num);
		int s=numChar[17];
		System.out.println(s);
		if((numChar[17]-48)==Text18(temp))
				 System.out.println("此身份证合法"); 
		 else
			 System.out.println("此身份证不合法！");
			

	}

}
