package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		
   int input=1234;
   int output=0;
   int input1;
  for(;input>0;input=input/10) {
	   input1=input%10;
	  output=output*10+input1;
	    input1=input/10;
  }
    	  System.out.println("output:" +output); 

   
	if(input!=output) {
		System.out.println("It is not a pallindrome");
	}else {
		System.out.println("Given number is pallindrome");
	}
  
}}
