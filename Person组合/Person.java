package java3;

public class Person {
    Leg[] L=new Leg[2];
    Hand[] H=new Hand[2];
	public void printInfo(){
		for(int i=0;i<2;i++){
			System.out.println("��"+(i+1)+"ֻ�ֵ�����Ϊ: "+H[i].getweight()+" ����Ϊ:"+H[i].getlength());
			System.out.println("��"+(i+1)+"���ȵ�����Ϊ: "+L[i].getweight()+" ����Ϊ:"+L[i].getlength());
		}
	}
	
}
