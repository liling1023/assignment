package java3;

import java.util.Scanner;

public class Email {

	public static boolean isVaild(String in) {
		boolean result = false;
		String regex  ="^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+[.][a-zA-Z0-9_-]+";
		result = in.matches(regex);
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������email��");
		String in = input.next();
		if (isVaild(in)) {
			System.out.println("����������ȷ��");
		} else
			System.out.println("�����������");
	}

}
