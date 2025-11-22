package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
int arr[]={1, 4,3,2,8, 6, 7};
 Arrays.sort(arr);
  int iteration = 1;
for(int i=0;i<arr.length;i++)
	
{
			if(arr[i]!=iteration) {
			System.out.println("Missing Element in a arrya"+" "+iteration);
				break;

	}else {iteration++;}
		
}}}
