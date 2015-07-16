package java3;

import java.util.*;

public class Average {
	public static double averageScore(ArrayList<Integer> scores) {
		int i = 0, sum = 0;
		double aver = 0;
		int length = scores.size();
		/*
		 * for(i=0;i<length;i++) { sum=sum+scores.get(i); }
		 */
		/*
		 * while(i<length){
		 * 
		 * sum=sum+scores.get(i); i++; }
		 */
		/*
		 * do{ sum=sum+scores.get(i); i++; }while(i<length);
		 */
		for (Integer x : scores) {
			sum = sum + x;
		}

		return aver = sum / length;

	}

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.println("请输入成绩,并用逗号隔开：");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] temp = input.split(",");
		for (int i = 0; i < temp.length; i++) {
			scores.add(Integer.parseInt(temp[i]));
			System.out.println(scores.get(i));
		}
		System.out.println("平均成绩为" + averageScore(scores));
	}

}


}
