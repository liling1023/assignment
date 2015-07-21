package java3;

public class Man {
	private String name;
	private int    age;
	private float  height;
	private String sex;
	public Man(String name,int age,float  height,String sex){
		this.name=name;
		this.age=age;
		this.height=height;
		this.sex=sex;
	}
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	public String getsex(){
		return sex;
	}
	public float getheight(){
		return height;
	}
	public boolean canmarray(){
		if(sex=="man"&&age>=22||sex=="famale"&&age>=20)
			return true;
		else
			return false;
	}
}
