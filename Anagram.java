package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
    String str1="stops";
    String str2= "potss";
	char[] CharArray1=str1.toCharArray();
	Arrays.sort(CharArray1);
	System.out.println(CharArray1);
	char[] CharArray2=str2.toCharArray();
    Arrays.sort(CharArray2);
	System.out.println(CharArray2);

    for(int i=0;i<=CharArray1.length-1;i++)
    {
    	   	
    		if(CharArray1.length==CharArray2.length && (CharArray1[i]==CharArray2[i]))
    		{
          continue;
    			    			}
    		else{
        		System.out.println("It is not a Anagram");
        		break;
    		}    			
     
    }
    System.out.println("It is a Anagram");
    }
}
    
	
