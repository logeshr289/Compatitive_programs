package Compatitive_programs;

import java.util.Scanner;

public class Find_key_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=c%10;
		int i=1,x=0,y=0,o=0;
		while(c!=0) {
		o=c%10;
		c/=10;a/=10;b/=10;
		if(o>max)
			max=o;
			//System.out.println(max);
		if(i==1)
			//System.out.println(b);
			x=b%10;
		if(i==2)
			//System.out.println(a);
			y=a%10;
		i++;
		}
		System.out.print(x*y-max);
		
		sc.close();

	}

}

