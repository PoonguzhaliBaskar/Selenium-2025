package week2.day2;

public class Prime {

	public static void main(String[] args) {
   
  
   
	for(int num=2;num<=10;num++) {
		int count=0;
		for(int j=1;j<=num;j++) {
		if(num%j==0) {
       count=count+1;
		}
		}
	
		if(count==2) {
			System.out.println("Prime"+ " "+ num);
		}else {
			System.out.println("Non prime"+" "+ num);
		}
		
}}
	}
