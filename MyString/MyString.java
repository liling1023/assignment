package java3;

public class MyString {
	private char[] c;
	public MyString(String s) {
		this.c=s.toCharArray();
	}
	public int length() {
		int length=0;
		for (char x : c)
		{
			if(x!='\0')
				length++;
		}
			return length;
	}
	public void reverse(){
		for(int i=0, j=c.length-1;i<=j;i++,j--){
			char t = c[i];
			c[i]=c[j];
			c[j]=t;
		}
	}
	public void concat(MyString y){
		String s1=y.toValue()+this.toValue();
		this.c=s1.toCharArray();
	}
	public void lower(){
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
				c[i]=(char) (c[i]+32);
		}
	}
	public void upper(){
		char[] c1=c;
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>='a'&&c1[i]<='z')
				c1[i]=(char) (c1[i]-32);
		}
		
	}
	public String toValue(){
		String s2="";
		for(char x:c)
			s2+=x;
		return s2;
	}
}
