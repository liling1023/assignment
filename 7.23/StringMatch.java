package java3;

import java.util.ArrayList;
import java.util.Collections;

public class StringMatch {
	private String str;

	public StringMatch(String str) {
		this.str = str;
	}

	public int numberOfOccurence(char x) {
		int count = 0;
		char[] c = str.toCharArray();
		for (char c1 : c) {
			if (c1 == x)
				count++;
		}
		return count;
	}
	public String getMaxSubStr(int len) {
		int length = 1, temp = 0, i;
		String s1 = "";
		String s="";
		int cnt=1,max=1;
		char[] c = str.toCharArray();
		String comstr="";
		ArrayList<String> longstr = new ArrayList<String>();
		for (i = 1; i < c.length; i++) { 
			if (c[i] == c[temp]) {
				length++;
			} 
			else {
				if(length == len) {
				s1 = str.substring(temp, i);
				longstr.add(s1);
				}
				temp = i;
				length = 1;
			}
		}
		Collections.sort(longstr);
		if(longstr.isEmpty())
			s=null;
		else if(longstr.size()==1)
			s=longstr.get(0);
		else{
			for(int j=0;j<longstr.size()-1;j++){
				if(longstr.get(j)==longstr.get(j+1))
					cnt++;              
				else if(cnt>max)
					max=cnt;
				s=longstr.get(j);
			}
		}
		return s;
	}
}
	
	




