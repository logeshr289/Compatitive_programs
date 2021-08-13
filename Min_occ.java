package Compatitive_programs;

import java.util.*;
public class Min_occ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		String x=(a+""+b+""+c+""+d);
		char arr[]=x.toCharArray();
		Arrays.sort(arr);
		if(arr[0]!=arr[1])
			System.out.print(arr[0]);
		else {
			int count=1,min=100000;
			char s=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				if (arr[i]==arr[i+1]) {
					count+=1;
			       }
				else {
					if (count<min){
						min=count;
						s=arr[i];
					
					}
					count=1;
				}
			}
			System.out.println(s);
		}
		sc.close();
	}

}
