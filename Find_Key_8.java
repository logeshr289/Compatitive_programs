package Compatitive_programs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Find_Key_8 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int []ar= {a,b,c,d,e};
		
		int max=0;
		int mi=0;
		for(int i:ar) {
			TreeSet <Integer> ts=new TreeSet<Integer>();
			ArrayList <Integer> al=new ArrayList<Integer>();
			
			while(i!=0) {
				ts.add(i%10);
				al.add(i%10);
				i=i/10;
			}
			if(ts.size() == al.size() || ts.size() == al.size()/2) {
				max++;
			}
			else{
				mi++;
				//System.out.println(j);
			}
		}
		
		System.out.print((max*10)+mi);
		
		sc.close();
	}

}

