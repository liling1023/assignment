import java3.Man;

public class TestMan {

	public static void main(String[] args) {
		Man m=new Man("小明",22,183,"man");
		System.out.println("姓名："+m.getname()+"  "+"年龄:"+m.getage()+"  "+"性别："+m.getsex()+"  "+"身高："+m.getheight());
		if(m.canmarray())
			System.out.println("此人可以结婚！");
		else
			System.out.println("此人年龄未达到标准，不能结婚!");
		
	}

}
