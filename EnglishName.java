package java3;

import java.util.Scanner;

public class EnglishName {
	public static boolean isVaild(String in){ 
		boolean result=false;
		String regex ="^([A-Za-z]+\\s){1,2}[A-Za-z]+$";
		result= in.matches(regex);
		return result;
	} 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入英文名字：");
		String in= input.nextLine();
		if(isVaild(in)){
			System.out.println("输入格式正确！");
		}
		else
			System.out.println("输入格式错误！");
	}
	}


