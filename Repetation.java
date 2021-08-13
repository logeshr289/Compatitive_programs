package Compatitive_programs;

import java.util.*;
public class Repetation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		var f=sc.nextInt();
		var l=sc.nextInt();
		int c=0;
		for (int i=f;i<=l;i++) {
			String n=String.valueOf(i);
			TreeSet <Integer> ts= new TreeSet <Integer>();
			int j=i;
			while(j!=0) {
				ts.add(j%10);
				j=j/10;
			}
			if(n.length() == ts.size())
				c++;
		}
		System.out.print(c);
		sc.close();
	}

}
