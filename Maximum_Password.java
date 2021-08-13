package Compatitive_programs;

import java.util.*;

public class Maximum_Password {

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
		ArrayList <Integer> m=new ArrayList<Integer>();
		for(int i:ar) {
			TreeSet <Integer> ts=new TreeSet<Integer>();
			ArrayList <Integer> al=new ArrayList<Integer>();
			int j=i;
			
			while(i!=0) {
				ts.add(i%10);
				al.add(i%10);
				i=i/10;
			}
			if(ts.size() == al.size() || ts.size() == al.size()/2) {
				if (j>max)
					max=j;
			}
			else{
				m.add(j);
				//System.out.println(j);
			}
		}
		mi= Collections.min(m);
		
		int x=max-mi;
		System.out.print(x);
		
		sc.close();
	}

}
