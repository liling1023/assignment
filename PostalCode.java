package java3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCode {
	public static boolean isVaild(String in){ 
		boolean result=false;
		String regex ="[1-9]\\d{5}";
		result= in.matches(regex);
		return result;
	} 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������������룺");
		String in= input.next();
		if(isVaild(in)){
			System.out.println("������ȷ��");
		}
		else
			System.out.println("�������");
	}

}
