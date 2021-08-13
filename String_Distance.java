package Compatitive_programs;

import java.util.*;

public class String_Distance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		s=s.toLowerCase();
		String arr[]=s.split(" ");
		
		for(String j:arr) {
			char []ar=j.toCharArray();
			//if(Character.isAlphabetic(ar[0]) && Character.isAlphabetic(ar[1]))
			System.out.print(ar[0]);
			for(int i=0;i<ar.length-1;i++) {
				char x=ar[i];
				char y=ar[i+1];
				char f;
				if(Character.isAlphabetic(x) && Character.isAlphabetic(y)) {
					int z=(x-96)+(y-96);
					if (z>26) {
						int m= z%26;
						f=(char)(m+96);
					}
					else {
						f=(char)(z+96);
					}
					System.out.print(f);
					System.out.print(y);
				}
				else {
					//System.out.print(x);
					System.out.print(y);
				}
			}
			System.out.print(" ");
			
		}
		sc.close();
	}

}
