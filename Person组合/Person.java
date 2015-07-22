package java3;

public class Person {
    Leg[] L=new Leg[2];
    Hand[] H=new Hand[2];
	public void printInfo(){
		for(int i=0;i<2;i++){
			System.out.println("第"+(i+1)+"只手的重量为: "+H[i].getweight()+" 长度为:"+H[i].getlength());
			System.out.println("第"+(i+1)+"条腿的重量为: "+L[i].getweight()+" 长度为:"+L[i].getlength());
		}
	}
	
}
