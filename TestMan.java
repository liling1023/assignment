import java3.Man;

public class TestMan {

	public static void main(String[] args) {
		Man m=new Man("С��",22,183,"man");
		System.out.println("������"+m.getname()+"  "+"����:"+m.getage()+"  "+"�Ա�"+m.getsex()+"  "+"��ߣ�"+m.getheight());
		if(m.canmarray())
			System.out.println("���˿��Խ�飡");
		else
			System.out.println("��������δ�ﵽ��׼�����ܽ��!");
		
	}

}
