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
	 public static void Change(String result) {// �ַ���ת��Ϊascii��   
	        char[] chars = result.toCharArray(); // ���ַ���ת��Ϊ�ַ�����   
	        System.out.println("��ַ�����ASCII��Ϊ��"+(int) chars[1]);   
	    }   

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String scr;
		do{
		System.out.printf("�������ַ�����#��������");
		Scanner y = new Scanner(System.in);
		String s=y.next();
		String result=getMaxString(s);
		System.out.println("��ַ���Ϊ��"+result);
		Change(result);
		System.out.println("�Ƿ�������룿yes or no");
		scr = input.next();
		}while(scr.equals("yes"));
	}
}
		


