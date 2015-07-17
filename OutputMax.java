package java3;
import java.util.*;
public class OutputMax {
	public static String getMaxString(String s){
        String result = "";
        int count = 1;
        int max = 0;
        int i,temp=0;
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i)==s.charAt(temp)){
                count++;
                 
            }else{
                if(count>max){
                    max=count;
                    result=s.substring(temp,i);
                }
                temp=i;
                count=1;
            }
        }
        return result;
    }
	 public static void Change(String result) {// 字符串转换为ascii码   
	        char[] chars = result.toCharArray(); // 把字符中转换为字符数组   
	        System.out.println("最长字符串的ASCII码为："+(int) chars[1]);   
	    }   

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String scr;
		do{
		System.out.printf("请输入字符串以#键结束：");
		Scanner y = new Scanner(System.in);
		String s=y.next();
		String result=getMaxString(s);
		System.out.println("最长字符串为："+result);
		Change(result);
		System.out.println("是否继续输入？yes or no");
		scr = input.next();
		}while(scr.equals("yes"));
	}
}
		


