package java3;

import java.util.Scanner;

public class DayNum {

	public static int getDays(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return 366;
		else
			return 365;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in;
		do {
			System.out.printf("请输入年份：");
			Scanner y = new Scanner(System.in);
			int year = y.nextInt();
			if (year < 1980 || year > 2050) {
				System.out.println("您的输入有误！请重新输入");
				year = y.nextInt();
			}

			System.out.println(year + "年的天数是" + DayNum.getDays(year));
			System.out.println("是否继续输入？y or n");
			in = input.next();
		} while (in.equals("y"));
	}

}
