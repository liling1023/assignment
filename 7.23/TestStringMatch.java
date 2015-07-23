package java3;

public class TestStringMatch {

	public static void main(String[] args) {
		StringMatch m = new StringMatch("ccbbbaadef");
		System.out.println(m.numberOfOccurence('a'));
		System.out.println(m.getMaxSubStr(2)); 	
		System.out.println(m.getMaxSubStr(3));
		System.out.println(m.getMaxSubStr(4));
	}
}
