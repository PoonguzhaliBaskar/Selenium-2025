package week2.day2;

public class Fabonaccie {

	public static void main(String[] args) {
		int first=0;int second=1; int next;
       for(int i=1;i<=10;i++)
       {
    	   System.out.println(first);
		next=first+second;
		first=second;
		second=next;
		

       }
         
	}

	}
