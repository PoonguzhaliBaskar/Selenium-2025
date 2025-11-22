package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
		String name="TestLeaf";
		char[] CharArray=name.toCharArray();
		for(int i=CharArray.length-1;i>=0;i--) {
			
			System.out.print(CharArray[i]);
		}
	}

}
