package java3;

import java.util.ArrayList;

public class TestArea {
	public static  double getTotalArea(ArrayList shapes){
		double TotalArea = 0;
		for(int i=0;i<shapes.size();i++)
			//System.out.println(((GetArea) shapes.get(i)).Area());
			TotalArea+= ((Shape) shapes.get(i)).Area();
		return TotalArea;
		
	}
	public static void main(String[] args) {
		ArrayList shapes = new ArrayList();
		shapes.add(new ChangFangXing(20,10));
		shapes.add(new ZhengFangXing(10));
		shapes.add(new YuanXing(5));
		shapes.add(new SanJiaoXing(20,10));
		System.out.println("Total Area:" + getTotalArea(shapes));


	}

}
