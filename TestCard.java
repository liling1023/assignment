package java3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCard {

	public static int textcard17(String num) {
		int length = num.length();
		int count = 0;
		if (length == 18) {
			char[] numChar = num.substring(0, 17).toCharArray();
			int[] xishu = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
			for (int i = 0; i < numChar.length; i++) {
				count += (numChar[i] - '0') * xishu[i];
			}
		}
		int temp = count % 11;
		return temp;

	}

	public static void Text18(int temp, char n) {
		char last;
		switch (temp) {
		case 0:
			last = '1';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 1:
			last = '0';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 2:
			last = 'x';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 3:
			last = '9';
			break;
		case 4:
			last = '8';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 5:
			last = '7';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 6:
			last = '6';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 7:
			last = '5';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 8:
			last = '4';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 9:
			last = '3';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		case 10:
			last = '2';
			if (n == last)
				System.out.println("此身份证合法");
			else
				System.out.println("此身份证不合法！");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.printf("请输入18位身份证号：");
		Scanner y = new Scanner(System.in);
		String num = y.next();
		int temp = TestCard.textcard17(num);
		char n = num.charAt(num.length() - 1);
		System.out.println("身份证最后一位为：" + n);
		Text18(temp, n);
	}

}
